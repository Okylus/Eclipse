
package name1;
import java.util.Scanner;
public class project3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Введите число: ");
		int number = in.nextInt();
			if(number%5==2||number%7==1){
				System.out.print("Число "+ number + " удволетворяет условию ");
					}else {
						System.out.print("Число"+ number + " НЕ удволетворяет условию ");
		
				}
			in.close();
		}
}
