/**
 * 
 */
package dcll.grp7.MoodleXML;
=======
package dcll.grp7.MoodleQuizXML;
>>>>>>> aff9df96fd8bab26ee4cf261ccd5571e52bd896d  

import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.jdom.Element;
import org.jdom.input.SAXBuilder;


<<<<<<< HEAD
/**
 * @author etu2
 *
 */
//implementation de la lasse ParserXmlToJava
public class ParserXmlToJava {
	
	private static org.jdom.Document document;
    private static Element racine;

    public static void main(String[] args) {

        // On crée une instance de SAXBuilder
        SAXBuilder sxb = new SAXBuilder();
        try {
            // On crée un nouveau document JDOM avec en argument le fichier XML
            // Le parsing est terminé ;)
            String fichier = "/home/dioubate/Bureau/doc.xml";
            document = sxb.build(new File(fichier));
            System.out.println("Création du JDOM terminée");

        } catch (Exception e) {
            System.out.println("Erreur dans la création du JDOM");
        }

        // On initialise un nouvel élément racine avec l'élément racine du
        // document.
        racine = document.getRootElement();

        // Méthode définie dans la partie 3.2. de cet article
        afficheALL();
    }


    static void afficheALL() {
        // On crée une List contenant tous les noeuds "question" de l'Element
        // racine
        List listDesQuestions = racine.getChildren("question");

        // On crée un Iterator sur notre liste
        Iterator i = listDesQuestions.iterator();
        int numero=0;
        while (i.hasNext()) {
            //    On recrée l'Element courant à chaque tour de boucle afin de
            // pouvoir utiliser les méthodes propres aux Element comme :
            // selectionner un noeud fils, modifier du texte, etc...
            Element courant = (Element) i.next();
            numero++;
            // traitement dans le cas d'une question de type category//
            if(courant.getAttribute("type").getValue().equals("category"))
            {
                
            	new Category();
				Category.lireCategory(courant);
            }
            if(courant.getAttribute("type").getValue().equals("description"))
            {
                
				Description.lireDescription(courant);
            }
            if(courant.getAttribute("type").getValue().equals("truefalse"))
            {
               TrueFalse.lireTrueFalse(courant);
            }
         // traitement dans le cas d'une question de type essay//
            if (courant.getAttribute("type").getValue().equals("essay")) {
                Essay.lireEssay(courant);
            }
            // traitement dans le cas d'une question de type numerical//
            if (courant.getAttribute("type").getValue().equals("numerical")) {
                Numerical.lireNumerical(courant);
            }
         // traitement dans le cas d'une question de type calculated//
            if (courant.getAttribute("type").getValue().equals("calculated")) {
                Calculated.lireCalculated(courant);
            }
         // traitement dans le cas d'une question de type matching//
            if (courant.getAttribute("type").getValue().equals("matching")) {
                Matching.lireMatching(courant);
            }
           
         // traitement dans le cas d'une question de type cloze//
            if (courant.getAttribute("type").getValue().equals("cloze")) {
                Cloze.lireCloze(courant);
            }
         // traitement dans le cas d'une question de type multichoice//
            if (courant.getAttribute("type").getValue().equals("multichoice")) {
               Multichoice.lireMultiChoice(courant);
            }
         // traitement dans le cas d'une question de type multichoice//
            if (courant.getAttribute("type").getValue().equals("shortanswer")) {
                ShortAnswer.lireShortAnswer(courant);
            }
        }
       
    }      
   
    
    
 




private static org.jdom.Document document;
    private static Element racine;

    public static void main(String[] args) {

        // On crée une instance de SAXBuilder
        SAXBuilder sxb = new SAXBuilder();
        try {
            // On crée un nouveau document JDOM avec en argument le fichier XML
            // Le parsing est terminé ;)
            String fichier = "/home/dioubate/Bureau/doc.xml";
            document = sxb.build(new File(fichier));
            System.out.println("Création du JDOM terminée");

        } catch (Exception e) {
            System.out.println("Erreur dans la création du JDOM");
        }

        // On initialise un nouvel élément racine avec l'élément racine du
        // document.
        racine = document.getRootElement();

        // Méthode définie dans la partie 3.2. de cet article
        afficheALL();
    }


    static void afficheALL() {
        // On crée une List contenant tous les noeuds "question" de l'Element
        // racine
        List listDesQuestions = racine.getChildren("question");

        // On crée un Iterator sur notre liste
        Iterator i = listDesQuestions.iterator();
        int numero=0;
        while (i.hasNext()) {
            // On recrée l'Element courant à chaque tour de boucle afin de
            // pouvoir utiliser les méthodes propres aux Element comme :
            // selectionner un noeud fils, modifier du texte, etc...
            Element courant = (Element) i.next();
            numero++;
            // traitement dans le cas d'une question de type category//
            if(courant.getAttribute("type").getValue().equals("category"))
            {
                
            	new Category();
				Category.lireCategory(courant);
            }
            if(courant.getAttribute("type").getValue().equals("description"))
            {
                
				Description.lireDescription(courant);
            }
            if(courant.getAttribute("type").getValue().equals("truefalse"))
            {
               TrueFalse.lireTrueFalse(courant);
            }
         // traitement dans le cas d'une question de type essay//
            if (courant.getAttribute("type").getValue().equals("essay")) {
                Essay.lireEssay(courant);
            }
            // traitement dans le cas d'une question de type numerical//
            if (courant.getAttribute("type").getValue().equals("numerical")) {
                Numerical.lireNumerical(courant);
            }
         // traitement dans le cas d'une question de type calculated//
            if (courant.getAttribute("type").getValue().equals("calculated")) {
                Calculated.lireCalculated(courant);
            }
         // traitement dans le cas d'une question de type matching//
            if (courant.getAttribute("type").getValue().equals("matching")) {
                Matching.lireMatching(courant);
            }
           
         // traitement dans le cas d'une question de type cloze//
            if (courant.getAttribute("type").getValue().equals("cloze")) {
                Cloze.lireCloze(courant);
            }
         // traitement dans le cas d'une question de type multichoice//
            if (courant.getAttribute("type").getValue().equals("multichoice")) {
               Multichoice.lireMultiChoice(courant);
            }
         // traitement dans le cas d'une question de type multichoice//
            if (courant.getAttribute("type").getValue().equals("shortanswer")) {
                ShortAnswer.lireShortAnswer(courant);
            }
        }
       
    }      
   
    
    
 


}
    }

