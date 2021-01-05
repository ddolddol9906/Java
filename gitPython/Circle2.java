import java.util.Scanner;
import static java.lang.Math.*;

public class Circle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("원의 면적을 계산합니다.");
		System.out.print("반지름 : ");  double r= stdIn.nextDouble();
		System.out.println("면적은 " + (PI * r * r) + " 입니다.");
	}

}
