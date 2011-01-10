import java.util.Set;
import java.util.TreeSet;


public class Bayesnode
{

	private double prop_true = 0;
	private double prop_false = 0 ; 
	private double prop_boundSingle = 0;
	
	private TreeSet<Bayesnode> fatherNode = new TreeSet<Bayesnode>();
	
	/**
	 * Wird nur eine W'keit bei der Initialisierung übergeben, wird ein neuer Knoten ohne 
	 * Vaterknoten erstellt. 
	 * 
	 * @param prob_trueInput positive W'keit des Knotens
	 */
	public Bayesnode( double prob_trueInput)
	{
		prop_true = prob_trueInput;
		prop_false = 1 - prop_true;
	}
	/**
	 * Wenn ein Objekt erstellt wird, übergeben sie ein Set<String> mit den VaterKnoten
	 * und der W'keit, P(Dieses Objekt|"wenn"). Bsp.: Heißt diese Objekt soreThorat und 
	 * sie möchten die W'keit P(soreThroat|influenza) = 0.3 eingeben. Erzeugen sie das 
	 * Objekt mit Bayesnode("influenza","influenza",0.3)
	 * @param father
	 * @param wenn P(ojekt|wenn)
	 * @param p P(objekt|wenn)=p
	 */
	public Bayesnode (Bayesnode father , Bayesnode wenn, double p)
	{
		prop_boundSingle = p;
		fatherNode.add(father);
		this.toString();
	}
	
	public double givePropTrue()
	{
		
		return prop_true;
	}
	
	
	public double givePropFalse()
	{
		return prop_false;
	}
	
	public TreeSet<Bayesnode> giveBayesnode()
	{
		return fatherNode;
	}
	
	public double givePropBoundSingle()
	{
		return prop_boundSingle;
	}
}
