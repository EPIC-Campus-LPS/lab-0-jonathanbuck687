package packageName;
import java.util.Scanner;
public class lab03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int s1 = scan.nextInt();
		int s2 = scan.nextInt();
		int s3 = scan.nextInt();
		int tot = s1 + s2 + s3;
		int ave = tot/3;
		int star = tot % 5;
		System.out.println("Score: " + tot);
		System.out.println("Average Score: " + ave);
		System.out.println("Stars Earned: " + star);
	}

}
