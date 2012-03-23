package dcll.grp7.MoodleQuizXML;

import org.jdom.Element;

/** Implémentation de la classe numerical **/
public class Numerical extends Quiz {

	public Numerical() {
		super();
	}

	public void gererateNumerical(Element racine) {

		ajouterQuestion("type", "name", "HTTP 1er protocole de l'Internet");

		ajouterQuestionTextEtSubQ("questiontext", "format",
				"moodle_auto_format", "text",
				"En quelle année HTTP devient le premier"
						+ " protocole de l'Internet ?");

		elemSimple("image", "");

		balContenantUnElem("generalfeedback", "text", "");

		getQuestion().addContent(new Element("defaultgrade").setText("1"));
		elemSimple("defaultgrade", "1");

		getQuestion().addContent(new Element("penalty").setText("0.1"));
		elemSimple("penalty", "0.1");

		getQuestion().addContent(new Element("hidden").setText("0"));
		elemSimple("hidden", "0");

		getQuestion().addContent(new Element("shuffleanswers").setText("0"));
		elemSimple("shuffleanswers", "0");

		getQuestion().addContent(
				new Element("answer")
						.setAttribute("fraction", "100")
						.addContent(new Element("text").setText("1999"))
						.addContent(new Element("tolerance").setText("0"))
						.addContent(
								new Element("feedback").addContent(new Element(
										"text"))));

	}

	// afficher une question de type numerical////
	static void lireNumerical(Element courant) {
		lirePartieCommuneEssayNumerical(courant);
		System.out.println("la fraction de la réponse est               :"
				+ courant.getChild("answer").getAttribute("fraction")
						.getValue());

		lireDeuxBalise(courant, "answer", "text");

		lireDeuxBalise(courant, "answer", "tolerance");

		lireTroisBalise(courant, "answer", "feedback", "text");
	}
}
