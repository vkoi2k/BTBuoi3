package Bai1;
import java.util.Scanner;

public class TinhGiaiThua {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập vào số nguyên không âm bất kỳ: ");
		int n = Integer.parseInt(sc.nextLine());
		if (n < 0) {
			System.out.println("Hãy nhập vào một số nguyên không âm: ");
			n = Integer.parseInt(sc.nextLine());
		}
		int dem = 1;
		int giaiThua = 1;
		if (n >= 0) {
			while (dem <= n) {
				giaiThua *= dem;
				dem++;
			}
			System.out.println(n + "!" + " = " + giaiThua);			
		}
	}
}
