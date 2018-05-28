import java.util.Scanner;

public class day_4_2 {

	public static void main(String[] args) {
		int i = 0;
		do {
			System.out.println("i= " + i);
			i++;
			
		} while (i <3);
		System.out.println("programma beidzaas");
		
		String test = "";
		for(int ii=0; ii<5; ii++) {          //labaakais cikla veids!
			test = test + "x";
			System.out.println(test +" ,ii= " + ii);

		}
		
		int [] ints = new int[12];
		ints[5]=100;
		ints[3]=300;
		for (int iii = 0; iii<12; iii++)
			if (ints[iii]!=0) {

		System.out.println("int ["+ iii + "]: " + ints [iii]);
			}
	}

}
