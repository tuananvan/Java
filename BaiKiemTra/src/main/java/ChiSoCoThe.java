/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
import java.util.Scanner;
public class ChiSoCoThe {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhap tuoi cua ban: ");
    int age = scanner.nextInt();
	if (age >=16) {
            System.out.print("Nhap kilogam cua ban: ");
            double kg = scanner.nextDouble();
            System.out.print("Nhap chieu cao cua ban: ");
            double height = scanner.nextDouble();
            double BMI = kg / Math.pow(height, 2);
			
	if (BMI < 18.5) {
            System.out.println("Underweight");
	} else if (BMI >= 18.5 && BMI <25.0) {
            System.out.println("Normal");
	} else if (BMI >= 25.0 && BMI < 30.0) {
            System.out.println("Overweight");
	} else if (BMI >= 30.0) {
            System.out.println("Obese");
				}
	} else {
            System.out.println("You are not old enough");
	}
    }
}
