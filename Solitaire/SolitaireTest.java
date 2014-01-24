package TestSolitaire;

public class Case{
	
	private int abscisse, ordonne, valeur;
	public static final int OCCUPE = 1, LIBRE = 0, INTERDIT = -1;
	
	public int getAbscisse()
	{
		return abscisse;
	}
	
	public void setAbscisse (int abscisse)
	{
		this.abscisse = abscisse;
	}
	
	public int getOrdonne()
	{
		return ordonne;
	}
	
	public void setOrdonne (int ordonne)
	{
		this.ordonne = ordonne;
	}
	
	public boolean getAutoriser()
	{
		return (valeur == LIBRE || valeur == OCCUPE);
	}
	
	public boolean getImpossible()
	{
		return (valeur == INTERDIT);
	}
	
	public void setValeur (int valeur)
	{
		this.valeur = valeur;
	}
	public int getOccuper()
	{
		return OCCUPE;
	}
	public int getlibre()
	{
		return LIBRE;
	}
	
	public Case (int abscisse, int ordonne, int valeur)
	{
		this.abscisse = abscisse;
		this.ordonne = ordonne;
		this.valeur = valeur;
	}
	
	public String toString()
    {
		if (valeur == INTERDIT)
				return "   ";
		else
			if (valeur == LIBRE)
				return "[ ]";
			else
				return "[X]";
    }
	

	public static void main(String[] args) 
	{
		int valeur = LIBRE;
		int abscisse = 0;
		int ordonne = 0;
		Case case1 = new Case(abscisse, ordonne, valeur);
		System.out.println(case1.toString());
	}

}
