/**
 * 
 */
package dcll.grp7.MoodleQuizXML;

import org.jdom.Element;

/**
 * @author dioubate
 *
 */
public class Category extends Quiz{

<<<<<<< HEAD
public Category(){
=======
	public Category(){
>>>>>>> aff9df96fd8bab26ee4cf261ccd5571e52bd896d
		super();
	}
	
	public void generateCategory(Element racine){
		
		ajouterQuestion("category","category","ha");
		
		
        
	}
	
	// afficher une question de type category////
    static void lireCategory(Element courant)
    {
      
        //System.out.println("   "+courant.getAttribute("type").getValue());
        lireDeuxBalise(courant, "category", "text");

       
       
       
    }

}
