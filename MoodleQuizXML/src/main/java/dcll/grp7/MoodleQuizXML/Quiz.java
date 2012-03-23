/**
Quiz est la class mere
de l'application 
tous les types questions l'herite
* 
*/
package dcll.grp7.MoodleQuizXML;






import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.List;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;


public class Quiz {

	public static Element racine = new Element("quiz");

	//On crée un nouveau Document JDOM basé sur la racine que l'on vient de créer
	public static org.jdom.Document document = new Document(racine);

	protected Element question;
	
	public Quiz(){
		question=new Element("question");
		 
	}
	
	//methode qui ajoute une question
	public void ajouterQuestion(String type,String name,String texte){
		racine.addContent(getQuestion());
        getQuestion().setAttribute("type",type)
        .addContent(new Element(name).addContent(new Element("text").setText(texte)));
        		
	}
	
	//methode qui ajoute une questiontext ou une subquestion
	public void ajouterQuestionTextEtSubQ(String name,String balf,String attr,String elem,String text){
		getQuestion().addContent(new Element(name)
        .setAttribute(balf,attr).addContent(
        		new Element(elem).
        		setText(text)));
        
	}
	
	//methode pour ajouter un element simple
	public void elemSimple(String name,String text){
		getQuestion().addContent(new Element(name).setText(text));
	}
	
	//methode pour ajouter un element  contenant un autre element 
	public void balContenantUnElem(String namebalP,String nameBalF,String text){
		getQuestion().addContent(new Element(namebalP).
        		addContent(new Element(nameBalF).setText(text)));
        
	}
	//methode pour ajouter une question subquestion
	public void balsubquestion(String text1,String text2){
		getQuestion().addContent(new Element("subquestion").
        		addContent(new Element("text").setText(text1)).addContent(new Element("answer")
        		.addContent(new Element("text").setText(text2))));
        
	}
	
	//methode pour ajouter question answers
	public void ajouterAnswer(String attr,String text1,String text2){
		getQuestion().addContent(new Element("answer")
        .setAttribute("fraction",attr).addContent(
        		new Element("text").
        		setText(text1)).addContent(
        						new Element("feedback").addContent(
        								new Element("text").setText(text2))));
          
	}
	
		
	

	//methode pour recuperer une question
	public Element getQuestion() {
		return question;
	}
	
	//methode pour consulter et modifier la question
	public void setQuestion(Element question) {
		this.question = question;
	}
	

		
	static void lireUneBalise(Element courant,String fils)
	{
	       
	    System.out.println(" "+courant.getChild(fils).getText());
	    
	          
	}
	
	   
    static void lireBalireComplexeAnswer(Element courant,String fils,String petitfils,String sPetitfils)
    {
    	 List listanswer = courant.getChildren("answer");

         // On crée un Iterator sur notre liste
         Iterator j = listanswer.iterator();
         while (j.hasNext()) {
            
             Element _courant = (Element) j.next();
             
            if(_courant.getAttribute("fraction").getValue().equals("0")){
            	 System.out.println(" fraction "+_courant.getAttribute("fraction").getValue());
            	  lireUneBalise(_courant, sPetitfils);
    	          lireDeuxBalise(_courant, petitfils,sPetitfils);
            }
            if(_courant.getAttribute("fraction").getValue().equals("100")){
            	 System.out.println(" fraction "+_courant.getAttribute("fraction").getValue());
            	lireUneBalise(_courant, sPetitfils);
            	lireDeuxBalise(_courant, petitfils,sPetitfils);
                    }
            if(_courant.getAttribute("fraction").getValue().equals("75")){
           	 System.out.println(" fraction "+_courant.getAttribute("fraction").getValue());
           	lireUneBalise(_courant, sPetitfils);
           	lireDeuxBalise(_courant, petitfils,sPetitfils);
                   }
            if(_courant.getAttribute("fraction").getValue().equals("33.333")){
           	 System.out.println(" fraction "+_courant.getAttribute("fraction").getValue());
           	lireUneBalise(_courant, sPetitfils);
           	lireDeuxBalise(_courant, petitfils,sPetitfils);
                   }
         }  
   }
    
    
    static void lireBalireComplexeDatasetItems(Element courant,String fils,String petitfils,String s_petitfils)
    { //System.out.println(" fffjf "+courant.getText());
    	 List listanswer = courant.getChildren("dataset_items");

         // On crée un Iterator sur notre liste
         Iterator j = listanswer.iterator();
         while (j.hasNext()) {
            
             Element _courant = (Element) j.next();
            
         
            	// System.out.println(" fffjf "+_courant.getText());
            	lireUneBalise(courant, petitfils);
            	lireUneBalise(courant,s_petitfils);
                    
         }  
   }
    static void lireTroisBalise(Element courant,String fils,String petitfils,String s_petitfils)
    {
       
    	System.out.println(" "+courant.getChild(fils).getChild(petitfils).getChild(s_petitfils).getText());
   }
    
    // lire la partie commune entre essay et numerical//
    static void lirePartieCommuneEssayNumerical(Element courant) {
     
    //  System.out.println("l'attribut name de la question est             :");
      lireDeuxBalise(courant, "name", "text");
     System.out.println("le format de la question est                   :"
              + courant.getChild("questiontext").getAttribute("format")
                      .getValue());
     // System.out.println("l'attribut questiontext de la question est     :");
      lireDeuxBalise(courant, "questiontext", "text");
     // System.out.println("l'attribut generalfeedback de la question est  :");
      lireUneBalise(courant, "generalfeedback");
      //System.out.println("l'attribut defaultgrade de la question est     :");
      lireUneBalise(courant, "defaultgrade");
     // System.out.println("l'attribut penalty de la question est          :");
      lireUneBalise(courant, "penalty");
     // System.out.println("l'attribut hidden de la question est           :");
      lireUneBalise(courant, "hidden");
     // System.out.println("l'attribut shuffleanswers de la question est   :");
      lireUneBalise(courant, "shuffleanswers");

  }

  static void lireDeuxBalise(Element courant,String fils,String petitfils)
   {
      
      System.out.println(" "+courant.getChild(fils).getChild(petitfils).getText());
   
         
  }
  
  static void affiche()
	{
	   try
	   {
	      //On utilise ici un affichage classique avec getPrettyFormat()
	      XMLOutputter sortie = new XMLOutputter(Format.getPrettyFormat());
	      sortie.output(document, System.out);
	   }
	   catch (java.io.IOException e){}
	}

	static void enregistre(String fichier)
	{
	   try
	   {
	      //On utilise ici un affichage classique avec getPrettyFormat()
	      XMLOutputter sortie = new XMLOutputter(Format.getPrettyFormat());
	      //Remarquez qu'il suffit simplement de créer une instance de FileOutputStream
	      //avec en argument le nom du fichier pour effectuer la sérialisation.
	      sortie.output(document, new FileOutputStream(fichier));
	   }
	   catch (java.io.IOException e){}
	}


  
  

	
}
