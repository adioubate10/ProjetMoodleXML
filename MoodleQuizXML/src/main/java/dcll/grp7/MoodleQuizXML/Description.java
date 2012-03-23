
package dcll.grp7.MoodleQuizXML;

import org.jdom.Element;


public class Description extends Quiz{

	public Description(){
		super();
	}
	
	public void generateDescription(Element racine){
		
		
		ajouterQuestion("description", "name", "Consigne dispositif électronique");
		
        
        ajouterQuestionTextEtSubQ("questiontext", "format", "moodle_auto_format", 
        		"text", "Pas de calculatrice !");
        
        
        
     
        elemSimple("image", "");
        
        
        balContenantUnElem("generalfeedback", "text", "");
        
        elemSimple("defaultgrade", "0");
        
        elemSimple("penalty", "0");
        
        elemSimple("hidden", "0");
        
        elemSimple("shuffleanswers", "0");
        
        
	}
	
	static void lireDescription(Element courant )
    {
    	
    	lireDeuxBalise(courant, "name","text");
    	lireDeuxBalise(courant, "questiontext", "text");
    	lireDeuxBalise(courant, "generalfeedback", "text");
    	lireUneBalise(courant,  "defaultgrade");
    	lireUneBalise(courant,  "penalty");
    	lireUneBalise(courant,  "hidden");
    	lireUneBalise(courant,  "shuffleanswers");
    }
    
}
