
package dcll.grp7.MoodleQuizXML;

import org.jdom.Element;


public class ShortAnswer extends Quiz{
	
	public ShortAnswer(){
		super();
	}
	
	public void generateShortAnswer(Element racine){
		
		
        ajouterQuestion("shortanswer", "name", "MVC");
        
        ajouterQuestionTextEtSubQ("questiontext", "format", "moodle_auto_format","text", "Que signifie MVC ?");
        
        
        
        
        elemSimple("image", "");
        
        
        balContenantUnElem("generalfeedback", "text", "");
        
        elemSimple("defaultgrade", "1");
        
        elemSimple("penalty", "0.1");
        
        
        elemSimple("hidden", "0");
        
       
        elemSimple("shuffleanswers", "0");
        
        elemSimple("usecase", "0");
        
        ajouterAnswer("100", "Modele View controller", 
        		"vide");
        
        
        ajouterAnswer("100", "Modèle Vue Contrôleur", 
        		"vide");
		
		
	}
	
	public void generateShortAnswerBis(Element racine){

		
        ajouterQuestion("shortanswer", "name", "Premier langage Orienté Objet");
        
        ajouterQuestionTextEtSubQ("questiontext", "format", "moodle_auto_format",
        		"text", "Quel est le premier langage Orienté Objet ?");
        
        
        elemSimple("image", "");
        
        
        balContenantUnElem("generalfeedback", "text", "");
        
        elemSimple("defaultgrade", "1");
        
        elemSimple("penalty", "0.1");
        
        
        elemSimple("hidden", "0");
        
       
        elemSimple("shuffleanswers", "0");
        
        elemSimple("usecase", "0");
        
        ajouterAnswer("100", "Simula", 
        		"Parfait !");
        
        
        ajouterAnswer("75", "Simula", 
        		"Oui, plus précisément Simula 66");
		
		
		
		
		
		
	}
	
	 static void lireShortAnswer(Element courant )
	    {
	    	 //System.out.println("  "+courant.getAttribute("type").getValue());
	    	lireDeuxBalise(courant, "name", "text");
	    	lireDeuxBalise(courant, "questiontext", "text");
	    	lireDeuxBalise(courant, "generalfeedback", "text");
	    	lireUneBalise(courant,  "defaultgrade");
	    	lireUneBalise(courant,  "penalty");
	    	lireUneBalise(courant,  "hidden");
	    	lireUneBalise(courant,  "shuffleanswers");
	    	lireUneBalise(courant,  "usecase");
	    	lireBalireComplexeAnswer(courant,"answer","feedback","text");
	    	
	    }
	   
	   

}
