
package dcll.grp7.MoodleQuizXML;

import org.jdom.Element;


public class Numerical extends Quiz{

	public Numerical(){
		super();
	}
	
	public void gererateNumerical(Element racine){
		
		/*racine.addContent(getQuestion());
        getQuestion().setAttribute("type","numerical")
        .addContent(new Element("name").addContent(new Element("text").
        		setText("HTTP 1er protocole de l'Internet")));*/
        ajouterQuestion("type", "name", "HTTP 1er protocole de l'Internet");
        
        ajouterQuestionTextEtSubQ("questiontext", "format", "moodle_auto_format",
        		"text", "En quelle année HTTP devient le premier" +
        				" protocole de l'Internet ?");
        /*getQuestion().addContent(new Element("questiontext")
        .setAttribute("format","moodle_auto_format").addContent(
        		new Element("text").
        		setText("En quelle année HTTP devient le premier protocole de l'Internet ?")));*/
        
        
        /*getQuestion().addContent(new Element("image"));*/
        elemSimple("image", "");
        
        /*getQuestion().addContent(new Element("generalfeedback").
        		addContent(new Element("text")));*/
        balContenantUnElem("generalfeedback", "text","");
        
        getQuestion().addContent(new Element("defaultgrade").setText("1"));
        elemSimple("defaultgrade","1");
        
        getQuestion().addContent(new Element("penalty").setText("0.1"));
        elemSimple("penalty","0.1");
        
        getQuestion().addContent(new Element("hidden").setText("0"));
        elemSimple("hidden", "0");
        
        getQuestion().addContent(new Element("shuffleanswers").setText("0"));
        elemSimple("shuffleanswers", "0");
        
        
                
        getQuestion().addContent(new Element("answer")
        .setAttribute("fraction","100").addContent(
        		new Element("text").
        		setText("1999")).addContent(
        						new Element("tolerance").
        								setText("0")).addContent(
        										new Element("feedback").addContent(
        												new Element("text"))));
        
        
        
       
        
        
    }
	
    // afficher une question de type numerical////
    static void lireNumerical(Element courant) {
        lirePartieCommuneEssayNumerical(courant);
        System.out.println("la fraction de la réponse est               :"
                + courant.getChild("answer").getAttribute("fraction")
                        .getValue());
       // System.out.println("l'attribut réponse de la question est       :");
        lireDeuxBalise(courant, "answer", "text");
       // System.out.println("l'attribut tolerance de la réponse est         :");
        lireDeuxBalise(courant, "answer", "tolerance");
       // System.out.println("l'attribut feedback de la reponse est          :"
           //     + courant.getChild("answer").getChild("feedback")
              //          .getChild("text").getText());
        lireTroisBalise(courant, "answer", "feedback", "text");
    }
}
