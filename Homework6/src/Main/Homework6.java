// Jashan Rai - CSC 15 - Section 13

package Main;

public class Homework6{
	public static void main(String[] args){
		Arithmetic ar;
		ar= new Arithmetic(3,5);
		System.out.println(ar.toString());
		System.out.println(ar.add());
		System.out.println(ar.subtract());
		System.out.println(ar.multiply());
		System.out.println(ar.divide());
		System.out.println(ar.modulo());
		ar.changeValues(10, 15);
		System.out.println(ar.toString());
		System.out.println(ar.add());
		System.out.println(ar.subtract());
		System.out.println(ar.multiply());
		System.out.println(ar.divide());
		System.out.println(ar.modulo());
		System.out.println(Arithmetic.staticAdd(10, 15));
	}
}