import java.util.Scanner;

public class TinhThue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int SG = 1;
		final int MQ = 2;
		final int MF = 3;
		final int HO = 4;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1 is Single filer");
		System.out.println("2 is married file jointly");
		System.out.println("3 is married file separately");
		System.out.println("4 is tax for head of household");
		
		System.out.print("Status of you: ");
		int status = scanner.nextInt();
		System.out.print("Income of you: ");
		double ic = scanner.nextDouble();
		
		double tax = 0;
		if (ic >0 && ic <= 8.350) {
			tax = ic * 10;
		} else if (ic >8.351 && ic <= 33.950) {
			tax = ic * 15;
		}else if (ic >33.951 && ic <= 82.250) {
			tax = ic * 25;
		}else if (ic >82.251 && ic <= 171.550) {
			tax = ic * 28;
		}else if (ic >171.551 && ic <= 372.950) {
			tax = ic * 33;
		}else  {
			tax = ic * 35;
		}
		if (status == SG) {
			System.out.print("Tax for single filers: " + (tax / 100 ) + " USD" );
		} else if (status == MQ) {
			System.out.println("tax for married file jointly: " + (tax / 100 ) + " USD");
		} else if (status == MF) {
			System.out.println("tax for married file separately: " + (tax / 100 ) + " USD");
		} else if (status == HO) {
			System.out.println("tax for head of household: " + (tax / 100 ) + " USD");
		} else {
			System.out.println("Wrong status");
		}
		scanner.close();
	}

}