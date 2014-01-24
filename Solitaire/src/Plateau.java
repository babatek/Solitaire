
public class Plateau {
	
	char [][] plateauDeJeu;
	int dimension = 5;
	
	@Override
	public String toString() {
		String resultat = "";
		for (int i = 0; i < dimension; i++) {
			for (int j = 0; j < dimension; j++){
				if (i == 2 && j == 2)
					resultat += ' ';
				else
					resultat += 'X';
			}	
			resultat += '\n';
		}
		
		return resultat ;
	}
	
	public void initPlateau(int dimension)
	{
		plateauDeJeu = new char [dimension][dimension];
		for (int i = 0; i < dimension - 1; i++) {
			for (int j = 0; j < dimension - 1; j++){
					plateauDeJeu[i][j] = 'X';
			}	
		}
	}
	
	public char transforme (boolean b)
	{
		if (b)
			return 'X';
		return ' ';
	}
	
	public void affichePlateau(Plateau plateau)
	{
		plateau.initPlateau(5);
		System.out.println(plateau);
	}
	
	public static void main(String[] args)
	{
		Plateau test = new Plateau();
		test.affichePlateau(test);
	}
}
