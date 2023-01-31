import java.util.Date;
import java.util.Scanner;


public class exercice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" entrer le décalage horaire entre votre domicile et l’endroit où vous allez " +
		"\n" + " entrez une valeur negative si la destination est en retard sur le domicile : ");
		int fuseau_horaire = sc.nextInt();
		
		int timeDestinationNuit = fuseau_horaire < 0 ? 24 + fuseau_horaire : fuseau_horaire;
		int timeDestinationJour = 12 + fuseau_horaire;
		
		System.out.println("il sera " + timeDestinationNuit + "H  quand il est minuit à la maison, " 
		+ "\n" + " et quand il est midi à la maison il sera " +  timeDestinationJour + " H à la destintion");
		 
		
		

	}

}
