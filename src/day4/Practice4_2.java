package day4;

import java.util.Scanner;

public class Practice4_2 {

	public static void main(String[] args) {
		// 삽입정렬
		Scanner getnum = new Scanner(System.in);
		System.out.printf("정수를 입력하십시오. : ");
		int cont=0, leng = getnum.nextInt();
		int sort[] = new int[leng];
		boolean comp;
		while(cont<sort.length) {
			int in=0;
			sort[cont]=(int)(Math.random()*leng+1);
			while(in<cont) {
				if(sort[cont]==sort[in]) {
					sort[cont]=(int)(Math.random()*leng+1);
					break;
				}
				in++;
			}
			if(in==cont) {
				cont++;
			}
		}
		
		System.out.println("원본");
		for(int prt : sort) {
			System.out.printf("%4d", prt);
		}
		System.out.println();
		System.out.println("배열");
		
		for(int i=1; i<sort.length; i++) {
			comp = false;
			cont = 0;
			int key = sort[i];
			for(int j=i; 0<j; j--) {
				if(sort[j-1]>key) {
					sort[j]=sort[j-1];
					cont++;
				}else {
					break;
				}
			}
			sort[i-cont]=key;
			for(int j=0; j<sort.length; j++) {
				System.out.printf("%4d", sort[j]);
				if(0<j) {
					if(sort[j-1]>sort[j]) {
						comp = true;
					}
				}
			}
			if(!comp) {
				break;
			}
			System.out.println();
		}
		getnum.close();
		System.exit(0);
		
	}

}
