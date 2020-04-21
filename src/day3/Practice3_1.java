package day3;

import java.util.Scanner;

public class Practice3_1 {

	public static void main(String[] args) {
		// 양의 정수 10개를 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력해보자.
		Scanner getnum = new Scanner(System.in);
		int num[]=new int[10];
		
		System.out.printf("숫자 10개를 입력하여 주십시오 : ");
		for(int i=0; i<num.length; i++) {
			num[i] = getnum.nextInt();
		}
		System.out.printf("입력하신 숫자 중에 3의 배수인 수는 : ");
		for(int i=0; i<num.length; i++) {
			if(num[i]%3 == 0) {
				System.out.printf(" %d", num[i]);
			}
		}
		System.out.printf("입니다.");
		getnum.close();
		System.exit(0);
	}

}
