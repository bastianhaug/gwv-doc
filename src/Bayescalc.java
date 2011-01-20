import java.util.ArrayList;

public class Bayescalc
{
	private Bayesnetwork _bayesnetwork;
	private ArrayList<Question> _questionaire;
	
	public Bayescalc(Questionaire questionaire) {
		this._bayesnetwork = new Bayesnetwork();
		this._questionaire = questionaire.get_questionaire();
	}
	
	/**
	 * Berechnet anhand der in _bayesnetwork gesetzen Wahrscheinlichkeiten und
	 * der in _questionaire beantworteten Fragen die entgültige Wahrscheinlichkeit
	 * für eine Influenza-Erkrankung.
	 */
	private double calculate() {
		double influenza_prob = 0;
		
		//Berechnung mit Hile von _questionaire und _bayesnetwork
		Question sorethroat = _questionaire.get(0);
		Question fever = _questionaire.get(1);
		Question coughing = _questionaire.get(2);
		Question wheezing = _questionaire.get(3);
		Question smokes = _questionaire.get(4);

		
//		if(allQuestionsAnswered())
//			{
//				_bayesnetwork.getSoreThroat().getProp_boundSingle()
//			}
//	
		
		
		return influenza_prob;
	}
	
	/**
	 * Ruft die Berechnungsfunktion auf und gibt die Wahrscheinlich zurück.
	 * 
	 * @return double
	 */
	public double get_influenza() {
		return this.calculate();
	}
	
	private boolean allQuestionsAnswered()
	{
				for ( Question question : _questionaire )
					{
						if (!question.is_answered())
							{
								return false;	
							}
							
					}
				return true;
					
					
	}	
	
	
}
