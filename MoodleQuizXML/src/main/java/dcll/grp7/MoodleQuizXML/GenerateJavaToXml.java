package dcll.grp7.MoodleQuizXML;

import java.io.FileOutputStream;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;
 
/** implementation de la classe GenerateJavaToXml**/
public class GenerateJavaToXml {

	public static Element racine = new Element("quiz");

	// On crée un nouveau Document JDOM basé sur la racine que l'on vient de
	// créer
	public static org.jdom.Document document = new Document(racine);

	public static void main(String[] args) {

		Category cat = new Category();// création d'une instance Category
		cat.generateCategory(racine);
		Calculated cal = new Calculated();// création d'une instance Calculated
		cal.generateCalculated(racine);
		Description desc = new Description(); // création d'une instance
												// Description
		desc.generateDescription(racine);
		Essay essay = new Essay(); // création d'une instance Essay
		essay.generateEssay(racine);
		Matching ma = new Matching(); // création d'une instance Matching
		ma.gererateMatching(racine);
		Cloze clo = new Cloze(); // création d'une instance Cloze
		clo.generateCloze(racine);
		Multichoice multic = new Multichoice(); // création d'une instance
												// Mutichoice
		multic.generateMultichoice(racine);
		Multichoice multicbis = new Multichoice(); // création d'une instance
													// Mutichoice
		multicbis.generateMultichoisebis(racine);
		Numerical num = new Numerical(); // création d'une instance Numerical
		num.gererateNumerical(racine);
		ShortAnswer sho = new ShortAnswer(); // création d'une instance
												// ShortAnswer
		ShortAnswer sho1 = new ShortAnswer(); // création d'une instance
												// ShortAnswer
		sho.generateShortAnswer(racine);
		sho1.generateShortAnswerBis(racine);
		TrueFalse truefalse = new TrueFalse(); // création d'une instance
												// TrueFalse
		truefalse.generateTrueFalse(racine); // création d'une instance
												// TrueFalse
		Quiz.affiche();
		Quiz.enregistre("home/dioubate/Bureau/quiztest.xml");
	}

}
