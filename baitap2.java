import java.util.Scanner;

public class baitap2 {
	public static void main(String[] args) {
		int n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap n = ");
		n=sc.nextInt();
		System.out.println((n %2 ==0) ? n + " la so chan ": n + " la so le ");
	}

}
