import java.util.Scanner;


public class exercice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" enter the three angles of a triangle " );
		System.out.println(" enter the one angles of a triangle : " );
		int angle1 = sc.nextInt();
		
		System.out.println(" enter the one angles of a triangle : " );
		int angle2 = sc.nextInt();
		
		System.out.println(" enter the one angles of a triangle : " );
		int angle3 = sc.nextInt();
		
		//imprime un resultat si condition est remplie
		
		int sum_three_angles = angle1 + angle2 + angle3 ;
		
		if(sum_three_angles == 180){
			System.out.println("It is a valid triangle.");
		}
		else{
			System.out.println("It is not a valid triangle.");
		}

	}

}
