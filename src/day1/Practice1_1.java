package day1;

import java.util.Scanner;

public class Practice1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.printf("실수를 입력 하시오 : ");
		double x = scan.nextDouble();
		System.out.printf("\n입력된 실수는 %f입니다.\n", x);
		int y = (int)x;
		System.out.printf("정수로 변환할 경우 %d입니다.\n", y);
		int z = 0;
		do{
			System.out.printf("%d는 2의 배수 입니다.\n", z, z);
			z = z+1;
		} while(z%2==0);
		scan.close();
	}

}
