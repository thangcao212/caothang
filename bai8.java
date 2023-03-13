
import java.util.Scanner;

public class bai8 {
	public static void main(String[] args) {
		int n,number;
		int sum =0;
		float trungbinhcong;
		System.out.println("nhap vao so cac so nguyen la  : ");
		Scanner sc =new Scanner(System.in);
		n=sc.nextInt();
		for (int i = 1; i <=n; i++) {
            System.out.println("Nhap so thu  " + i + ": ");
            number= sc.nextInt();
            sum += number;
        }
		trungbinhcong = (float)sum/n;
		System.out.println("trung binh cong cua day so la :" + trungbinhcong);
		
	
		
	}

}
