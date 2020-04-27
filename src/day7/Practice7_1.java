package day7;

import java.util.Scanner;

public class Practice7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner getnum = new Scanner(System.in);
		int sugar = getnum.nextInt(), cont=0, comp=sugar, sugar5=0, sugar3=0;
		while(comp/5!=0) {
			cont = sugar/5;
			comp = sugar%5;
			sugar5 = cont;
		}
		while(cont>=0 && comp<=sugar && comp>0) {
			if(comp%3==0) {
				cont = cont+1;
				comp = comp-3;
				sugar3 = sugar3+1;
			}else {
				comp = comp+5;
				cont = cont-1;
				sugar5 = sugar5-1;
			}			
		}
		if(comp==0) {
			System.out.printf("설탕 3kg %d포대, 5kg %d포대, 총 %d포대를 옮기면 됩니다.\n", sugar3, sugar5, cont);
		}else {
			System.out.printf("설탕을 정확하게 분배할 수 없습니다.\n");
		}
		getnum.close();
		System.exit(0);
	}

}
