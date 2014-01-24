package SolitaireBasic;

public class Solitaire {
	

	public static void main(String[] args) 
	{
		String resultat = "";
		int dimension = 9;
		char[][] plateau = new char[dimension][dimension];
		for (int i = 0; i < dimension - 1; i++) {
			for (int j = 0; j < dimension - 1; j++){
				plateau[i][j] = 'X';
				resultat += plateau[i][j];
			}	
			resultat += '\n';
		}
		System.out.println(resultat);
		
		
	}

}
