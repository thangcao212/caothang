import java.util.Scanner;

public class bai6 {
	

	
	    public static void main(String[] args) {
	        int n;
	        System.out.print("nhap so nguyen duuong bat ki : ");
	        Scanner scanner = new Scanner(System.in);
	            n = scanner.nextInt();
	        
	        long giaithua = 1;
	        if (n != 0 || n != 1) {
	            for (int i = 2; i <= n; i++) {
	                giaithua = giaithua * i;
	            }
	        }
	        System.out.println("giai thua cua  "+ n + " la " + giaithua);
	    }

}
