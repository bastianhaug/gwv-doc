import java.util.ArrayList;
import java.util.Collection;

/**
 * 
 */

/**
 * @author Basti
 *
 */
public class Questionaire {
	private Collection<Question> _questionaire = new ArrayList<Question>();
	
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
	
	public Collection<Question> get_questionaire() {
		return this._questionaire;
	}
}
