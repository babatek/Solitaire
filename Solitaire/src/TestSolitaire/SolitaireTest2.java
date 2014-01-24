package TestSolitaire;

public class Grille {
	
	private String[][] plateau;
	public static final int DIMENSION = 9;
	Case case1;
	
	public String[][] getPlateau()
	{
		return plateau;
	}
	
	public void setPlateau(String[][] plateau)
	{
		this.plateau = plateau;
	}
	
	public Grille (String[][] plateau)
	{
		this.plateau = plateau;
	}
	
	public String toString()
	{
		String resultat = "";
		for (int i = 0; i < DIMENSION; i++) {
			for (int j = 0; j < DIMENSION; j++){
				if (i == 2 && j == 2)
				{
					case1 = new Case(i, j, case1.getLibre());
					resultat += case1;
				}
				else
				{
					case1 = new Case(i, j, case1.getOccupe());
					resultat += case1;
				}
			}	
			resultat += '\n';
		}
		return resultat;
	}
	
	public void initGrille()
	{
		plateau = new String [DIMENSION][DIMENSION];
		for (int i = 0; i < DIMENSION - 1; i++) {
			for (int j = 0; j < DIMENSION - 1; j++){
					case1 = new Case(i, j, case1.getLibre());
					plateau[i][j] = case1.toString();
			}	
		}
	}

	public static void main(String[] args) 
	{
		String[][] plateau = null;
		Grille plateau1 = new Grille(plateau);
		plateau1.initGrille();
		plateau1.toString();
	}

}
