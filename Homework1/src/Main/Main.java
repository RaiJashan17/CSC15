package Main;

public class Main{
	public static void main(String[] args){
		System.out.println("Hello, World my name is Jashan Rai!");
		System.out.println(Foo(3));
	}
public static int Foo (int val){
	int ret=(val*9)/4;
	return ret%6;
	}
}