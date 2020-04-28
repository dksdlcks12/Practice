package day8;

import java.util.Scanner;

public class Practice8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner getnum = new Scanner(System.in);
		System.out.print("출발위치와 도착위치를 입력하시오. : ");
		int start = getnum.nextInt(), end = getnum.nextInt(), cont = 0, comp = 0;
		boolean reverse=false;
		if(end<start) {
			int tmp = end;
			end = start;
			start = tmp;
			reverse = true;
		}
		
		while(comp<end-start){
	        if(cont%2==0){
	        	cont++;
	            comp=((cont+1)/2)*((cont+1)/2);
	        } else {
	            cont++;
	            comp=(cont/2)*(cont/2)+(cont/2);
	        }
		}
		if(!reverse) {
			System.out.printf("%d부터 %d까지의 최소 워프 횟수는 %d회 입니다.", start, end, cont);
		} else {
			System.out.printf("%d부터 %d까지의 최소 워프 횟수는 %d회 입니다.", end, start, cont);
		}
		getnum.close();
		System.exit(0);
	}

}
