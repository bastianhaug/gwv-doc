
public class Propability
{

	private String signatur;
	private double prop;
	private boolean father1;
	private boolean father2;
	
	
	/**
	 * Dieser Konstruktor macht das gleiche, wie der BayesnodeKonstruktor, bei dem nur ein
	 * Vater übergeben wird. Nur wird hier die dazugehörige Wahrscheinlichkeit gespeichert.
	 * Im Bayesnetwork benutzte ich ihn vorerst nicht, aber er könnte das Programm
	 * später übersichtlicher machen.
	 * 
	 * @param singnatur Übergeben sie als String die "wenn" Signatur.
	 * Also für P(fever|influenza) übereben sie "influenza". Sie müssen kein not_influenza übergeben,sondern
	 * nur die boolsche Variable ändern.
	 * @param father1 Bsp. für P(fever|Influenza) übergeben sie true
	 * ; für P(fever|not_influenza) übergeben sie false
	 * @param p Die Wahrscheinlichkeit
	 */
	public Propability(String singnatur, boolean father1, double p)
	{
		this.signatur = singnatur;
		this.father1 = father1;
		this.prop = p;
		
	}
	/**
	 * Eine Wahrscheinlichkeit für doppelt gebundene Bayesknoten. Sie ist für die Aufnahme
	 * In eine Liste gedacht. 
	 * @param singnatur  singnatur Übergeben sie als String die "wenn" Signatur.
	 * Also für P(fever|influenza and  smokes) übereben sie "influenza and smokes"
	 * @param father1 father1 Bsp. für P(fever|Influenza and smokes) übergeben sie true
	 * ; für P(fever|influenza and not_smokes) übergeben sie false
	 * @param father2 father1 Bsp. für P(fever|Influenza and smokes) übergeben sie true
	 * ; für P(fever|not_influenza and smokes) übergeben sie false
	 * @param p
	 */
	public Propability(String singnatur, boolean father1, boolean father2, double p)
	{
		this.signatur = singnatur;
		this.father1 = father1;
		this.father2 = father2;
		this.prop = p;
		
	}
	



	/**
	 * @return the signatur
	 */
	public String getSignatur()
	{
		return signatur;
	}



	/**
	 * @param signatur the signatur to set
	 */
	public void setSignatur(String signatur)
	{
		this.signatur = signatur;
	}



	/**
	 * @return the prop
	 */
	public double getProp()
	{
		return prop;
	}



	/**
	 * @param prop the prop to set
	 */
	public void setProp(double prop)
	{
		this.prop = prop;
	}



	/**
	 * @return the father1
	 */
	public boolean isFather1()
	{
		return father1;
	}



	/**
	 * @param father1 the father1 to set
	 */
	public void setFather1(boolean father1)
	{
		this.father1 = father1;
	}



	/**
	 * @return the fater2
	 */
	public boolean isFater2()
	{
		return father2;
	}



	/**
	 * @param fater2 the fater2 to set
	 */
	public void setFater2(boolean fater2)
	{
		this.father2 = fater2;
	}
}
