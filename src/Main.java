import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	private static Questionaire _questionaire = new Questionaire();
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (Question question : _questionaire.get_questionaire()) {
			System.out.println(question.get_question() + " (ja/nein)");
			
			String eingabezeile = "";
			
			BufferedReader eingabe = new BufferedReader(new InputStreamReader(
	                System.in));
	        try {
	            eingabezeile = eingabe.readLine();
	        } catch (IOException exc) {
	            System.out.println(exc.getMessage());
	        }
	        
			String yes = "ja";
			String no = "nein";
			
			if (eingabezeile.equals(yes))
				question.set_answer(true);
			if (eingabezeile.equals(no))
				question.set_answer(false);
			
			// ToDo : Bei unbekannter Antwort, Frage erneut stellen.
			
			
		}
		// ToDo : Antworten an BayesCalc übergeben.
	}

}