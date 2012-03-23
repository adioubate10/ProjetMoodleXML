**
 * 
 */
package dcll.grp7.MoodleXML;

/**
 * @author etu2
 *
 */
public class Category extends Quiz{

public Category(){
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
