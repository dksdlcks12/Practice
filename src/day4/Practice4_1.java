package day4;

import java.util.Scanner;

public class Practice4_1 {

	public static void main(String[] args) {
		// 선택정렬 
		Scanner getnum = new Scanner(System.in);
		System.out.printf("정수를 입력하십시오. : ");
		int leng = getnum.nextInt();
		int sort[] = new int[leng];
		int cont = 0;
		boolean comp;
		
		while(cont<sort.length) {
			int in = 0;
			sort[cont] = (int)(Math.random()*leng+1);
			while(in<cont) {
				if(sort[in]==sort[cont]) {
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
		
	
		for(int i=0; i<sort.length-1; i++) {
			comp = false;
			cont = i;
			for(int j=i; j<sort.length; j++) {
				if(sort[j]<sort[cont]) {
					cont = j;
				}
			}
			int tmp = sort[cont];
			sort[cont] = sort[i];
			sort[i] = tmp;
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
