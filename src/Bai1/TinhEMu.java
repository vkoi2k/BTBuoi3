package Bai1;
import java.util.Scanner;

public class TinhEMu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập vào số nguyên không âm bất kỳ: ");
		int n = Integer.parseInt(sc.nextLine());
		if (n < 0) {
			System.out.println("Hãy nhập vào một số nguyên không âm: ");
			n = Integer.parseInt(sc.nextLine());
		}
		double dem =1 ;
		double kq=1;
		double tam=1;
		int soMu=1;
		while(dem<=n) {
			tam*=dem;
			kq+= (n*soMu)/tam;
			dem++;
			soMu++;
		}
		System.out.println("e^"+n+" = " +kq);
	}
}
