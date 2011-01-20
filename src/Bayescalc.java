import java.util.ArrayList;

public class Bayescalc
{
	private Bayesnetwork _bayesnetwork;
	private Questionaire _questionaire;
	
	public Bayescalc(Questionaire questionaire) {
		this._bayesnetwork = new Bayesnetwork();
		this._questionaire = questionaire;
	}
	
	private double calculate_soreThroat() {
		if (!this._questionaire.get_question("soreThroat").is_answered()) {
			return 1;
		}
		
		if (this._questionaire.get_question("soreThroat").get_answer()) {
			return (this._bayesnetwork.getSoreThroat().getProp_boundSingle() *
						this._bayesnetwork.getInfluenza().getProp_true()) /
					(this._bayesnetwork.getSoreThroat().getprop_boundSingle_false() *
						this._bayesnetwork.getInfluenza().getProp_false() +
						this._bayesnetwork.getSoreThroat().getProp_boundSingle() *
						this._bayesnetwork.getInfluenza().getProp_true());
		} else {
			return ((1 - this._bayesnetwork.getSoreThroat().getProp_boundSingle()) *
						this._bayesnetwork.getInfluenza().getProp_true()) /
					((1- this._bayesnetwork.getSoreThroat().getprop_boundSingle_false()) *
						this._bayesnetwork.getInfluenza().getProp_false() +
						(1 - this._bayesnetwork.getSoreThroat().getProp_boundSingle()) *
						this._bayesnetwork.getInfluenza().getProp_true());	
		}
	}
	
	private double calculate_fever() {
		return 1;
	}
	
	private double calculate_smokes_bronchitis() {
		if (!this._questionaire.get_question("smokes").is_answered()) {
			return (this._bayesnetwork.getInfluenza().getProp_true() * 
					(this._bayesnetwork.getSmokes().getProp_true() *
							this._bayesnetwork.getBronchitis().getProp_boundDouble().get(0).getProp() +
							this._bayesnetwork.getSmokes().getProp_false() *
							this._bayesnetwork.getBronchitis().getProp_boundDouble().get(1).getProp()) +
					this._bayesnetwork.getInfluenza().getProp_false() *
					(this._bayesnetwork.getSmokes().getProp_true() * 
							this._bayesnetwork.getBronchitis().getProp_boundDouble().get(2).getProp() +
							this._bayesnetwork.getSmokes().getProp_false() *
							this._bayesnetwork.getBronchitis().getProp_boundDouble().get(3).getProp()
					));
		}
		
		if (this._questionaire.get_question("smokes").get_answer()) {
			return 0.9045;
		} else {
			return 0.20898;
		}
	}
	
	private double calculate_bronchitis_coughing() {
		if (!this._questionaire.get_question("coughing").is_answered()) {
			return 1;
		}
		
		if (this._questionaire.get_question("coughing").get_answer()) {
			return ((this._bayesnetwork.getCoughing().getProp_boundSingle() *
						this.calculate_smokes_bronchitis()) /
					(this._bayesnetwork.getCoughing().getprop_boundSingle_false() *
						(1 - this.calculate_smokes_bronchitis()) +
						(this._bayesnetwork.getCoughing().getProp_boundSingle() *
								this.calculate_smokes_bronchitis())
					));
		} else {
			return 1;
		}
	}
	
	private double calculate_bronchitis_wheezing() {
		if (!this._questionaire.get_question("wheezing").is_answered()) {
			return 1;
		}
		
		if (this._questionaire.get_question("wheezing").get_answer()) {
			return 1;
		} else {
			return 1;
		}
	}
	
	private double calculate_bronchitis() {
		if (!this._questionaire.get_question("smokes").is_answered() &&
				!this._questionaire.get_question("coughing").is_answered() &&
				!this._questionaire.get_question("wheezing").is_answered()) {
			return 1;
		}
		
		return (this.calculate_smokes_bronchitis() *
				this.calculate_bronchitis_coughing() *
				this.calculate_bronchitis_wheezing());
	}
	
	/**
	 * Berechnet anhand der in _bayesnetwork gesetzen Wahrscheinlichkeiten und
	 * der in _questionaire beantworteten Fragen die entgültige Wahrscheinlichkeit
	 * für eine Influenza-Erkrankung.
	 */
	private double calculate() {
		return (this.calculate_soreThroat() *
				this.calculate_fever() *
				this.calculate_bronchitis());
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
