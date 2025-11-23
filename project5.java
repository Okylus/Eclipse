package name1;
import java.util.Scanner;
public class project5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Введите целое число: ");
		long number = in.nextLong();
		number = Math.abs(number);
		long thousands = (number/1000)%10;
		System.out.println("Количество тысяч в числе: " + thousands);
		in.close();
	}
}
