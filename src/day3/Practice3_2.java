package day3;

public class Practice3_2 {

	public static void main(String[] args) {
		/* [버블정렬]
		 * 1~10까지 버블정렬하기
		 */
		int sort[] = new int[10];
		boolean comp, stop;
		for(int i=0; i<sort.length; i++) {
			while(true) {
				sort[i]=(int)(Math.random()*10+1);
				comp=false;
				for(int j=0; j<i; j++) {
					if(sort[i]==sort[j]) {
						comp=true;
						break;
					}else {
						comp=false;
					}
										
				}
				if(!comp) {
					break;
				}
			}
		}
		for(int i=0; i<sort.length; i++) {
			System.out.printf("%4d", sort[i]);
		}
		System.out.println();
		for(int i=0; i<sort.length-1; i++) {
			stop=true;
			for(int j=0; j<sort.length-1-i; j++) {
				if(sort[j]>sort[j+1]) {
					int tmp = sort[j];
					sort[j] = sort[j+1];
					sort[j+1] = tmp;
					stop=false;
				}
			}
			if(stop) {
				break;
			}
			for(int j=0; j<sort.length; j++) {
				System.out.printf("%4d", sort[j]);
			}

			System.out.println();
		}
		System.exit(0);
	}

}
