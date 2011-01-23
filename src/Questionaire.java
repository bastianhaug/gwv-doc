/**
 * 
 */
import java.util.ArrayList;

/**
 * Die Questionaire-Klasse enthält alle Fragen, die dem Nutzer im Fragebogen
 * gestellt werden sollen.
 * 
 * @author Basti
 */
public class Questionaire {
	private ArrayList<Question> _questionaire = new ArrayList<Question>();
	
	public Questionaire() {
		Question soreThroat = new Question("soreThroat", "Haben Sie einen rauen Hals?", false);
		this._questionaire.add(soreThroat);
		
		Question fever = new Question("fever", "Haben Sie Fieber?", false);
		this._questionaire.add(fever);
		
		Question coughing = new Question("coughing", "Haben Sie Husten?", false);
		this._questionaire.add(coughing);
		
		Question wheezing = new Question("wheezing", "Haben Sie Schnupfen?", false);
		this._questionaire.add(wheezing);
		
		Question smokes = new Question("smokes", "Rauchen Sie?", false);
		this._questionaire.add(smokes);
		
		
	}
	
	public ArrayList<Question> get_questionaire() {
		return this._questionaire;
	}
	
	/**
	 * Gibt zurück, ob der Fragebogen vollständig beantwortet wurde.
	 * 
	 * @return boolean
	 */
	public boolean is_answered() {
		for (Question question : this.get_questionaire()) {
			if (!question.is_answered()) {
				return false;
			}
		}
		
		return true;
	}
	
	/**
	 * Gibt die Frage mit dem entsprechenden Namen zurück.
	 * 
	 * @param name String
	 * @return Question
	 */
	public Question get_question(String name) {
		for (Question question : this.get_questionaire()) {
			if (question.get_name().equals(name)) {
				return question;
			}
		}
		
		return null;
	}
}
