/**
 * 
 */

/**
 * @author Basti
 *
 */
public class Question {
	private String _name;
	private String _question;
	private boolean _answer;
	private boolean _answered = false;
	
	public Question(String name, String question, boolean answer) {
		this._name = name;
		this._question = question;
		this._answer = answer;
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public String get_question() {
		return _question;
	}

	public void set_question(String _question) {
		this._question = _question;
	}

	public boolean get_answer() {
		return _answer;
	}

	public void set_answer(boolean _answer) {
		this._answer = _answer;
	}

	public void set_answered(boolean _answered)
	{
			this._answered = _answered;
	}

	public boolean is_answered()
	{
			return _answered;
	}
}
