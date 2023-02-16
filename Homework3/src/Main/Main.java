package Main;
// Jashan Rai-Section 13
public class Main{
	public static void main(String[] args){
		int i = 0;
		final int max = 10;
		while (i<max){;
			System.out.println(Integer.toString(i)); // The loop is displaying i every time that i is less than 10.
			i++; // Also, the loop is adding one to i, so the loop is not infinite.
		}
		i = 0;
			do{
				System.out.println(i++);
			}while(i<10);	
			for (i=0;i<max;i++){
				System.out.println(i);
			}
	}
}