import java.util.Scanner;

public class bai5 {
	public static void main(String[] args) {
		int n;
		int sum=0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("nhap so nguyen n :");
			n=sc.nextInt();
			sum+= n;
			
			
		} while (sum <100);
		System.out.println("tong cac so nguyen  vua nhap la : " + sum);
		
	}

}
