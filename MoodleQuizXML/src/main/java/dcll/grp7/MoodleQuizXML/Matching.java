/**
 * 
 */
package dcll.grp7.MoodleQuizXML;

import org.jdom.Element;
 
/**
 * @author dioubate
 *
 */
public class Matching extends Quiz {
	
	  public Matching(){
		  super();
	  }

	  public void gererateMatching(Element racine){
	        
	      
	        
	        ajouterQuestion("type", "name", "Serveur d'application / éditeurs");
	        
	       
            ajouterQuestionTextEtSubQ("questiontext","format","moodle_auto_format","text",
            		"Relier les serveurs d'applications avec les bons éditeurs");
            
	        
	        elemSimple("image", "");
	        
	        
	        balContenantUnElem("generalfeedback", "text", "");
	        
	        
	        elemSimple("defaultgrade", "1");
	        
	        elemSimple("penalty", "0.1");
	        
	        elemSimple("hidden", "0");
	        
	        elemSimple("shuffleanswers", "1");
	        
	        
	        balsubquestion("JBOSS", "Redhat");
	        
	        balsubquestion("Websphere", "IBM");
	        
	        
	        balsubquestion("Glassfish", "Oracle");
	        
	        
	        
	        balsubquestion("Tomcat", "Fondation Apache");
	        

	    }
	  
	  static void lireMatching(Element courant )
	    {
	    	 //System.out.println("  "+courant.getAttribute("type").getValue());
	    	lireDeuxBalise(courant, "name", "text");
	    	lireDeuxBalise(courant, "questiontext", "text");
	    	lireUneBalise(courant,  "image");
	    	lireDeuxBalise(courant, "generalfeedback", "text");
	    	lireUneBalise(courant,  "defaultgrade");
	    	lireUneBalise(courant,  "penalty");
	    	lireUneBalise(courant,  "hidden");
	    	lireUneBalise(courant,  "shuffleanswers");
	    	
	    	lireBalireComplexeAnswer(courant,"answer","feedback","text");
	    	
	    }
}
