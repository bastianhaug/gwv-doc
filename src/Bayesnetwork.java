public class Bayesnetwork
{

	private Bayesnode influenza;
	private Bayesnode soreThroat ;
	private Bayesnode fever;
	private Bayesnode smokes;
	private Bayesnode bronchitis;
	private Bayesnode coughing;
	private Bayesnode wheezing;
	
	
	/**
	 * Das vordefinierte Bayesnetzwerk wird bei der Initialisierung erstellt.
	 */
	public Bayesnetwork()
	{
		influenza = new Bayesnode(0.05);
		
		soreThroat = new Bayesnode(influenza, 0.3);
		soreThroat.setProp_boundSingle_false(0.001);
		
		fever = new Bayesnode(influenza, 0.9);
		fever.setProp_boundSingle_false(0.05);
		
		smokes = new Bayesnode(0.2);
		
		bronchitis = new Bayesnode(influenza, smokes);
		
		Propability p0 = new Propability("influenza,smokes", true, true, 0.99);
		Propability p1 = new Propability("influenza,smokes", true, false, 0.9);
		Propability p2 = new Propability("influenza,smokes", false, true, 0.7);
		Propability p3 = new Propability("influenza,smokes", false, false, 0.0001);

		bronchitis.setProp_boundDouble(p0);
		bronchitis.setProp_boundDouble(p1);
		bronchitis.setProp_boundDouble(p2);
		bronchitis.setProp_boundDouble(p3);
		
		coughing = new Bayesnode(bronchitis,0.8);
		coughing.setProp_boundSingle_false(0.07);
		
		wheezing = new Bayesnode(bronchitis,0.6);
		wheezing.setProp_false(0.001);
	}


	/**
	 * @return the influenza
	 */
	public Bayesnode getInfluenza()
	{
		return influenza;
	}


	/**
	 * @return the soreThroat
	 */
	public Bayesnode getSoreThroat()
	{
		return soreThroat;
	}


	/**
	 * @return the fever
	 */
	public Bayesnode getFever()
	{
		return fever;
	}


	/**
	 * @return the smokes
	 */
	public Bayesnode getSmokes()
	{
		return smokes;
	}


	/**
	 * @return the bronchitis
	 */
	public Bayesnode getBronchitis()
	{
		return bronchitis;
	}


	/**
	 * @return the coughing
	 */
	public Bayesnode getCoughing()
	{
		return coughing;
	}


	/**
	 * @return the wheezing
	 */
	public Bayesnode getWheezing()
	{
		return wheezing;
	}
	
}
