/**
 * 
 */
package dcll.grp7.MoodleXML;

/**
 * @author etu2
 *
 */
public class Calculated extends Quiz{

public Calculated(){
		super();
	}
	
	public void generateCalculated(Element racine){
		
		ajouterQuestion("calculated", "name", "Aire du cercle");
	        
	    ajouterQuestionTextEtSubQ("questiontext", "format", "moodle_auto_format", 
	        		"text", "Calcul de l'aire du cercle ayant pour rayon {R}");
	        
	        
	    elemSimple("image", "");
	        
	        
	    balContenantUnElem("generalfeedback", "text", "");
	        
	    elemSimple("defaultgrade", "1");
	        
	        
	    elemSimple("penalty", "0.1");
	        
	    elemSimple("hidden", "0");
	        
	        
	    elemSimple("shuffleanswers", "0");
	        
	         

	}
	
	static void lireCalculated(Element courant )
    {
    	 System.out.println("  "+courant.getAttribute("type").getValue());
    	lireDeuxBalise(courant, "name", "text");
    	lireDeuxBalise(courant, "questiontext", "text");
    	lireDeuxBalise(courant, "generalfeedback", "text");
    	lireUneBalise(courant,  "defaultgrade");
    	lireUneBalise(courant,  "penalty");
    	lireUneBalise(courant,  "hidden");
    	lireUneBalise(courant,  "shuffleanswers");
    	System.out.println(" fraction "+courant.getChild("answer").getAttribute("fraction").getValue());
    	
    	lireDeuxBalise(courant, "answer", "text");
    	lireDeuxBalise(courant, "answer", "tolerance");
    	lireDeuxBalise(courant, "answer", "tolerancetype");
    	lireDeuxBalise(courant, "answer", "correctanswerformat");
    	lireDeuxBalise(courant, "answer", "correctanswerlength");
    	lireTroisBalise(courant,"answer","feedback","text");
    	lireBalireComplexeDatasetItems(courant, "dataset_items", "number", "value");
    }

}
