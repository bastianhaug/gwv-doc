import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;


public class Bayesnode
{

	private double prop_true = 0;
	private double prop_false = 0 ; 
	private double prop_boundSingle = 0;
	private double prop_boundSingle_false = 0;
	private List<Propability> prop_boundDouble = new ArrayList<Propability>();
	
	private List<Bayesnode> fatherNode = new ArrayList<Bayesnode>();
	

	/**
	 * Wird nur eine W'keit bei der Initialisierung übergeben, wird ein neuer Knoten ohne 
	 * Vaterknoten erstellt. 
	 * 
	 * @param prob_trueInput positive W'keit des Knotens
	 */
	public Bayesnode( double prob_trueInput)
	{
		prop_true = prob_trueInput;
		setProp_false(1 - prop_true);
	}
	/**
	 * Wenn ein Objekt erstellt wird, übergeben sie ein Set<String> mit den VaterKnoten
	 * und der W'keit, P(Dieses Objekt|"wenn"). Bsp.: Heißt diese Objekt soreThorat und 
	 * sie möchten die W'keit P(soreThroat|influenza) = 0.3 eingeben. Erzeugen sie das 
	 * Objekt mit Bayesnode("influenza",0.3). Da der Vater auch immer die Gebundene W'keit hat,
	 * muss er nur einmal übergeben werden.
	 * @param father
	 * @param wenn P(ojekt|wenn)
	 * @param p P(objekt|wenn)=p
	 */
	public Bayesnode (Bayesnode father , double p)
	{
		setProp_boundSingle(p);
		fatherNode.add(father);
		this.toString();
	}
	
	public Bayesnode (Bayesnode father1, Bayesnode father2)
	{
		fatherNode.add(father1);
		fatherNode.add(father2);
	}
	
	/**
	 * Dies ist die setter Methode für die gebundene W'keit bei negativen Fall.
	 * Z.b. P(fever | not_influenza).
	 * @param antiProp_boundSingle
	 */
	public void setProp_boundSingle_false(double Prop_boundSingle_false)
	{
			this.prop_boundSingle_false = Prop_boundSingle_false;
	}
	
	/**
	 * Dies ist die getter Methode. Beschreibung der Variable: siehe getter.
	 * @return
	 */
	public double getprop_boundSingle_false()
	{
			return prop_boundSingle_false;
	}
	
	public double getProp_true()
	{
		return prop_true;
	}
	public void setProp_true(double propTrue)
	{
		prop_true = propTrue;
	}
	
	/**
	 * Setzt die Wahrscheinlichkeit, das ein Ereigniss nicht eintritt. Bei ungebundener W'keit
	 * wird diese W'keit automatisch berechnet. 
	 * @param prop_false
	 */
	public void setProp_false(double prop_false)
	{
			this.prop_false = prop_false;
	}
	public double getProp_false()
	{
			return prop_false;
	}
	
	/**
	 * Besitzt dieser Knoten eine Vaterknote, ist die W'keit Gebunden. 
	 * Dieser Wert steht für die W'keit, dass ein Ereigniss eintritt, wenn das "wenn" Ereigniss
	 * eintritt. Z.b. P(fever|influenza)
	 * @param prop_boundSingle
	 */
	public void setProp_boundSingle(double prop_boundSingle)
	{
			this.prop_boundSingle = prop_boundSingle;
	}
	public double getProp_boundSingle()
	{
			return prop_boundSingle;
	}
	/**
	 * Gibt eine Liste von VäterKnoten zurück, von Welchen der Knoten abhängig ist.
	 * @return 
	 */
	public List<Bayesnode> getFatherNode()
	{
		return fatherNode;
	}
	
	/**
	 * möchtest du W'keiten bei doppelter Bindung übergeben, benötigst du eine Liste mit den double-Werten 
	 * in dieser Reihenfolgen  P(father1 and father2)= p0 P(father1 and not_father2) = p1
	 * P(not_father1 and father2) = p2 P(not_father1 and not_father2)= p3
	 * 								
	 * @param prop_boundDouble
	 */
	public void setProp_boundDouble(Propability prop_boundDouble)
	{
			this.prop_boundDouble.add(prop_boundDouble);
	}
	public List<Propability> getProp_boundDouble()
	{
			return prop_boundDouble;
	}
	
}
