package day5;

import java.util.Scanner;

public class Practice5_1 {
	public static void prtch(int n) {
		char ch='a';
		for(int i=1; i<=n; i++) {
			ch='a';
			for(int j=1; j<=i; j++) {
				System.out.printf("%2c", ch);
				ch+=1;
			}
			System.out.println();
		}
		System.out.println();
	}
	public static void prtnum(int n1, int n2) {
		for(int i=0; i<n1; i++) {
			for(int j=1; j<=n2; j++) {
				System.out.printf("%4d", n2*i+j);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner getnum = new Scanner(System.in);
		System.out.printf("정수 2개를 입력하십시오. : ");
		int num1=getnum.nextInt(), num2=getnum.nextInt();
		prtch(num1);
		prtnum(num1, num2);
		getnum.close();
		System.exit(0);
	}

}
