import java.util.Scanner;

		public class aufg2c {

			public static void main(String[] args) {
				
				
		        Scanner input = new Scanner(System.in);
		        
		          System.out.print("Name des Patienten: ");
		           String name = input.nextLine();
		          
		          System.out.print("Kreatinwert des Patienten: ");
		           double Kreatinwert = input.nextDouble();
		          
		          System.out.print("Bilirubinwert des Patienten: ");
		           double Bilirubinwert = input.nextDouble();
		           
		          System.out.print("INR-Wert des Patienten: ");
		           double INRwert = input.nextDouble();
				
				
		            double meldScore  = (10 * (0.957 * Math.log(Kreatinwert) + 0.378 * Math.log(Bilirubinwert) + 1.12 * Math.log(INRwert) + 0.643) ); 
				
				
			     System.out.printf ("Patient %s hat einen Meld-Score von %.1f." , name, meldScore);
				
				
				input.close();
			}

		


	}


