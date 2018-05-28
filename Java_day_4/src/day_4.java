import java.util.Scanner;

public class day_4 {

	public static void main(String[] args) {
		
		//CIKLI
		int ii = 0;
		while (ii<5) {
			System.out.println("cikls prieks ii: "+ ii);
			ii++;
		}
		
		boolean isInt = false;
		int i;
		Scanner scanner = new Scanner(System.in);
		while(!isInt) {
			System.out.println("ievadi skaitli: ");
			isInt = scanner.hasNextInt();
			if(!isInt) {
				scanner.nextLine();
				continue;
			}
			
			i = scanner.nextInt();
			System.out.println("value= " +i);
			break;

			
		}
		
	}

}
