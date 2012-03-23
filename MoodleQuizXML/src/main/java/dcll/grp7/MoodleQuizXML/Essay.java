/**

 * 
 */
package dcll.grp7.MoodleQuizXML;

import org.jdom.Element;

/**
 * @author dioubate
 *
 */
public class Essay extends Quiz {

	//contructeur de la class Quiz
	public Essay(){
		super();
	}
	
	//la fonction qui permet de generer xml du questionnaire Essay
	public void generateEssay(Element racine){
		
		//ajouter une question
        ajouterQuestion("essay","name", "Question ouverte");
        
        //ajouter une question text
        ajouterQuestionTextEtSubQ("questiontext","format","moodle_auto_format","text",
        		 "Ecrire un programme qui affiche Hello world");
        
        //ajouter un element image
        elemSimple("image","");
        
        //ajouter un element generalfeedback qui contient un element text
        balContenantUnElem("generalfeedback","text" ,"");
        
        
        //ajouter un element defaultgrade qui contient le texte "1"
        elemSimple("defaultgrade", "1");
        
        //ajouter un element penalty qui contient le texte "0"
        elemSimple("penalty", "0");
        
        elemSimple("hidden", "0");
        
        
        elemSimple("shuffleanswers", "0");
        
        
        
        ajouterQuestionTextEtSubQ("answer", "fraction","0","feedback", "");
        

	}
	
	// afficher une question de type essay////
    static void lireEssay(Element courant) {
        lirePartieCommuneEssayNumerical(courant);
        System.out
                .println("la fraction de la réponse est                      :"
                        + courant.getChild("answer").getAttribute("fraction")
                                .getValue());
        System.out
                .println("l'attribut feedback de la reponse est              :"
                        + courant.getChild("answer").getChild("feedback")
                                .getChild("text").getText());
    }

     //contructeur de la class Quiz
	public Essay(){
		super();
	}
	
	//la fonction qui permet de generer xml du     questionnaire Essay
	public void generateEssay(Element racine){
		
		//ajouter une question
        ajouterQuestion("essay","name", "Question ouverte");
        
        //ajouter une question text
        ajouterQuestionTextEtSubQ("questiontext","format","moodle_auto_format","text",
        		 "Ecrire un programme qui affiche Hello world");
        
        //ajouter un element image
        elemSimple("image","");
        
        //ajouter un element generalfeedback qui contient un element text
        balContenantUnElem("generalfeedback","text" ,"");
        
        
        //ajouter un element defaultgrade qui contient le texte "1"
        elemSimple("defaultgrade", "1");
        
        //ajouter un element penalty qui contient le texte "0"
        elemSimple("penalty", "0");
        
        elemSimple("hidden", "0");
        
        
        elemSimple("shuffleanswers", "0");
        
        
        
        ajouterQuestionTextEtSubQ("answer", "fraction","0","feedback", "");
        

	}
	
	// afficher une question de type essay////
    static void lireEssay(Element courant) {
        lirePartieCommuneEssayNumerical(courant);
        System.out
                .println("la fraction de la réponse est                      :"
                        + courant.getChild("answer").getAttribute("fraction")
                                .getValue());
        System.out
                .println("l'attribut feedback de la reponse est              :"
                        + courant.getChild("answer").getChild("feedback")
                                .getChild("text").getText());
    }


}
