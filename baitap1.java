import java.util.Scanner;

public class baitap1 {
	public static void main(String[] args) {
		float a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap a =  ");
		a=sc.nextFloat();
		System.out.println("nhap b = ");
		b=sc.nextFloat();
		float tong = a+ b;
		System.out.println("tong hai so " + a + " va " + b + " la : " + tong);
		
		float hieu = a-b;
		System.out.println("hieu hai so " + a + " va " + b + " la : " + hieu);
		
		float tich = a* b;
		System.out.println("tich hai so " + a + " va " + b + " la : " + tich);
		
		float thuong = (float)a/b;
		System.out.println("thuong hai so " + a + " va " + b + " la : " + thuong);
		
		float chialaydu = a % b;
		System.out.println("chia lay du hai so " + a + " va " + b + " la : " + chialaydu);
		
		System.out.println("   hai so a va b bang nhau " + (a==b));
		System.out.println("   so a lon hon so b "+ (a > b));
		System.out.println("   so a nho hon so b "+ (a < b));
		System.out.println("   so a khac so b "+ (a !=b));
		System.out.println("   so a >= so b "+ (a >= b));
		System.out.println("   so a <= so b "+ (a <= b));
		
		
		
		
		
	}

}
