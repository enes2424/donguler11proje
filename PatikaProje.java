import java.util.Scanner;

public class PatikaProje {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Kaç tane sayı gireceksiniz: ");
		int n = input.nextInt(), num;
		System.out.print("1. Sayıyı giriniz: ");
		num = input.nextInt();
		int max = num, min = num;
		for (int i = 2; i <= n; i++) {
			System.out.print(i + ". Sayıyı giriniz: ");
			num = input.nextInt();
			if (max < num) max = num;
			else if (min > num) min = num;
		}
		System.out.println("En büyük sayı: " + max);
		System.out.println("En küçük sayı: " + min);
	}

}
