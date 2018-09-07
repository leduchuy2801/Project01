package Huy.dev;
 
import java.util.Scanner;

public class Tinhtong {

	public static void main(String[]arg) {
		System.out.println("nhap so nguyen duong n :");
		int n= new Scanner(System.in).nextInt();
		int tong = 0;
		for (int i=1;i<=n;i++) {
		tong = tong +i;
	}
	System.out.println("tong la" +tong);
	
		
	}
}
