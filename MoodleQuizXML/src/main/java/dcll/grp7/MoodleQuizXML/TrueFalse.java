
 
package dcll.grp7.MoodleQuizXML;

import org.jdom.Element;


public class TrueFalse extends Quiz{

	public TrueFalse(){
		super();
	}
	
	public void generateTrueFalse(Element racine){
		
        ajouterQuestion("truefalse", "name", "Tomcat et JEE");
        
        ajouterQuestionTextEtSubQ("questiontext", "format", "moodle_auto_format", 
        		"text", "Tomcat est un conteneur " +
        				"implémentant toutes les spécifications JEE.");
        
        
        elemSimple("image", "");
        
        
        balContenantUnElem("generalfeedback", "text", "");
        
        elemSimple("defaultgrade", "1");
        
        
        elemSimple("penalty", "1");
        
        elemSimple("hidden", "0");
        
        
        elemSimple("shuffleanswers", "0");
        
        
        ajouterAnswer("0", "true", "Tomcat est un conteneur Web uniquement.");
        
        
        ajouterAnswer("100", "false", "Tomcat est un conteneur Web uniquement.");
       
	}
	
	
	static void lireTrueFalse(Element courant )
    {
    	// System.out.println("  "+courant.getAttribute("type").getValue());
    	lireDeuxBalise(courant, "name", "text");
    	lireDeuxBalise(courant, "questiontext", "text");
    	lireDeuxBalise(courant, "generalfeedback", "text");
    	lireUneBalise(courant,  "defaultgrade");
    	lireUneBalise(courant,  "penalty");
    	lireUneBalise(courant,  "hidden");
    	lireUneBalise(courant,  "shuffleanswers");
    	
    	lireBalireComplexeAnswer(courant,"answer","feedback","text");
    	
    }
}
