package Bai2;

import java.util.Scanner;

public class MaHoa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = "", b = "";
		int num, temp, digit, count = 0;
		System.out.print("Nhập vào số tự nhiên có 4 chữ số: ");
		num = Integer.parseInt(sc.nextLine());
		while(num<1000||num>9999) {
			System.out.print("Hãy nhập số tự nhiên có 4 chữ số: ");
			num = Integer.parseInt(sc.nextLine());
		}
		temp = num;
        while(temp > 0)
        {	
            digit = ((temp % 10)+7)%10;
            a = String.valueOf(digit)+a;
            temp = temp / 10;
        }
//        b = b + a.charAt(2) + a.charAt(3) + a.charAt(0) + a.charAt(1);
        b = b + a.substring(2,4)+a.substring(0,2);
        System.out.println("Số sau khi mã hóa là: "+b);
	}
}
