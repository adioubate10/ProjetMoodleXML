package dcll.grp7.MoodleQuizXML;




import org.jdom.Element;

public class Cloze extends Quiz{

<<<<<<< HEAD
public Cloze(){
=======
	public Cloze(){
>>>>>>> aff9df96fd8bab26ee4cf261ccd5571e52bd896d
		super();
	}
	
	public void generateCloze(Element racine){
		
        
        ajouterQuestion("type", "name", "Question Cloze (composite ?)");
        
        ajouterQuestionTextEtSubQ("questiontext", "format", "moodle_auto_format", "text",
        		 "Cette question comporte du texte dans lequel on a" +
        				" directement intégré des réponses à choix multiples" +
        				" {1:MULTICHOICE:Mauvaise réponse#Feedback pour cette" +
        				" mauvaise réponse~Une autre mauvaise réponse#Feedback pour " +
        				"cette autre mauvaise réponse~=Bonne réponse#Feedback pour " +
        				"la bonne réponse~%50%Réponse qui vaut la moitié des points#Feedback" +
        				" pour la question qui vaut la moitié des points} ; " +
        				"vous devez maintenant répondre à une question " +
        				"courte{1:SHORTANSWER:Mauvaise réponse#Feedback pour cette " +
        				"mauvaise réponse~=Bonne réponse#Feedback pour la bonne " +
        				"réponse~%50%Réponse qui vaut la moitié des points#Feedback" +
        				" pour la question qui vaut la moitié des points}. " +
        				"Nous avons finalement une question qui demande une réponse" +
        				" numérique avec point décimal {2:NUMERICAL:=23.8:0.1#Feedback " +
        				"pour la bonne réponse 23.8~%50%23.8:2#Feedback pour la réponse " +
        				"qui donne la moitié des points}. Remarquez que les adresses URL " +
        				"comme www.moodle.org et les binettes :-) sont correctement" +
        				" interprétées : a) Est-ce bien? {:MULTICHOICE:=Oui#Bonne réponse~Non#Votre " +
        				"opinion nous indiffère !} b) Quelle " +
        				"note désirez-vous? {3:NUMERICAL:=3:2}");
        
       
        
        balContenantUnElem("generalfeedback", "text","");
        
        
        elemSimple("shuffleanswers","0");
        
        
        
        
		
	}
	
	
	static void lireCloze(Element courant )
    {
    	System.out.println("  "+courant.getAttribute("type").getValue());
    	lireDeuxBalise(courant, "name", "text");
    	lireDeuxBalise(courant, "questiontext", "text");
    	lireDeuxBalise(courant, "generalfeedback", "text");
    	lireUneBalise(courant,  "shuffleanswers");
    	
    	lireBalireComplexeAnswer(courant,"answer","feedback","text");
    	
    }
<<<<<<< HEAD
=======
	
>>>>>>> aff9df96fd8bab26ee4cf261ccd5571e52bd896d

}
