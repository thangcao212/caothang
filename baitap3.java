import java.util.Scanner;

public class baitap3 {
	public static void main(String[] args) {
		String ten;
		int namsinh;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap ten : ");
		ten =sc.nextLine();
		System.out.println("nhap nam sinh : ");
		namsinh = sc.nextInt();
		if((2023 - namsinh) < 16) {
			System.out.println("ban "+ ten + "do tuoi vi thanh nien ");
			
		}else if((2023-namsinh)>=16 && (2023-namsinh)<18){
			System.out.println("ban " + ten + "do tuoi truong thanh");
		}else if((2023 -namsinh) > 18) {
			System.out.println("ban "+ ten + " da gia ");
		
	
	}

}
}
