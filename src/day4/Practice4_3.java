package day4;

import java.util.Scanner;

public class Practice4_3 {

	public static void main(String[] args) {
		// 마방진
		Scanner getnum = new Scanner(System.in);
		System.out.printf("홀수를 입력하십시오. : ");
		int num = getnum.nextInt();
		while(num%2==0) {
			System.out.printf("홀수를 입력하십시오. : ");
			num = getnum.nextInt();
		}
		int mgsq[][] = new int [num][num];
		int cont=1;
		int x=0, y=(num-1)/2;
		mgsq[x][y] = cont;
		
		while(cont<num*num) {
			x-=1;
			y+=1;
			cont+=1;
			if(cont%num==1) {
				x+=2;
				y-=1;
			}
			if(x<0) {
				x=num-1;
			}
			if(num==y) {
				y=0;
			}
			if(num==x) {
				x=0;
			}
			mgsq[x][y]=cont;
		}

		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				System.out.printf("%4d", mgsq[i][j]);
			}
			System.out.println();
		}
		getnum.close();
		System.exit(0);
	}
}
