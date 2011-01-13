public class Bayescalc
{
	private Bayesnetwork _bayesnetwork;
	private Questionaire _questionaire;
	
	public Bayescalc(Questionaire questionaire) {
		this._bayesnetwork = new Bayesnetwork();
		this._questionaire = questionaire;
	}
	
	/**
	 * Berechnet anhand der in _bayesnetwork gesetzen Wahrscheinlichkeiten und
	 * der in _questionaire beantworteten Fragen die entgültige Wahrscheinlichkeit
	 * für eine Influenza-Erkrankung.
	 */
	private double calculate() {
		double influenza_prob = 0;
		
		//Berechnung mit Hile von _questionaire und _bayesnetwork
		
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
}
