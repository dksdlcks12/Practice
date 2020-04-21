package day2;

import java.util.Scanner;

public class Practice2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner getscore = new Scanner(System.in);
		System.out.printf("당신의 점수를 입력하십시오. : ");
		int score = getscore.nextInt();
		while(score<0 || 100<score) {
			System.out.printf("오류가 발생 하였습니다. 점수를 다시 입력하여 주십시오. : ");
			score = getscore.nextInt();
		}
		if(90<=score && score<=100) {
			if(96<= score) {
				System.out.printf("당신의 점수는 %d점, 학점은 A+입니다.\n", score);
			}else if(93<=score) {
				System.out.printf("당신의 점수는 %d점, 학점은 A0입니다.\n", score);
			}else {
				System.out.printf("당신의 점수는 %d점, 학점은 A-입니다.\n", score);
			}
		}else if(80<=score) {
			if(86<= score) {
				System.out.printf("당신의 점수는 %d점, 학점은 B+입니다.\n", score);
			}else if(83<=score) {
				System.out.printf("당신의 점수는 %d점, 학점은 B0입니다.\n", score);
			}else {
				System.out.printf("당신의 점수는 %d점, 학점은 B-입니다.\n", score);
			}
		}else if(70<=score) {
			if(76<= score) {
				System.out.printf("당신의 점수는 %d점, 학점은 C+입니다.\n", score);
			}else if(73<=score) {
				System.out.printf("당신의 점수는 %d점, 학점은 C0입니다.\n", score);
			}else {
				System.out.printf("당신의 점수는 %d점, 학점은 C-입니다.\n", score);
			}
		}else if(60<=score) {
			if(66<= score) {
				System.out.printf("당신의 점수는 %d점, 학점은 D+입니다.\n", score);
			}else if(63<=score) {
				System.out.printf("당신의 점수는 %d점, 학점은 D0입니다.\n", score);
			}else {
				System.out.printf("당신의 점수는 %d점, 학점은 D-입니다.\n", score);
			}
		}else if(50<=score) {
			if(56<= score) {
				System.out.printf("당신의 점수는 %d점, 학점은 E+입니다.\n", score);
			}else if(53<=score) {
				System.out.printf("당신의 점수는 %d점, 학점은 E0입니다.\n", score);
			}else {
				System.out.printf("당신의 점수는 %d점, 학점은 E-입니다.\n", score);
			}
		}else{
			System.out.printf("당신의 점수는 %d점, 학점은 F입니다.\n", score);
		}
		getscore.close();

	}

}