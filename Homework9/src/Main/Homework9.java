// H O M E W O R K   # 9 
// C S C   1 5
// Student's Name Here: Jashan Rai

package Main;

public class Homework9{
	public static void main(String[] args){
		// My tests (Do NOT modify this part!)
		int[] a = {24,3,12,55,6,21,35,7,33,10};
		int[] b = {72,103,3,56,87,23,9,78,5,110};
		p(divide(10,0));
		p(divide(20,5));
		p(getUnsignedIntString(-100));
		p(getUnsignedIntString(1000));
		p(Integer.toString(getMaxValue(a)));
		p(Integer.toString(getMaxValue(b)));
		p(getArrayElement(a, 3));
		p(getArrayElement(b, 10));
		p(twoSum(a, 31));
		p(twoSum(b, 113));
	}
	
	public static String getUnsignedIntString(int value){
		String ret = "";
		// TODO: Follow Homework hand out for method
		if(value<0){
			ret=Integer.toString(0);
		}else{
			ret=Integer.toString(value);
		}
		return ret;
	}
	
	public static String getArrayElement(int[] a, int index){
		String ret = "";
		// TODO: Follow Homework hand out for method
		try{
			ret=Integer.toString(a[index]);		
		}catch(Exception e){
			ret="Out of Bounds";
		}
		return ret;
	}
	
	public static int getMaxValue(int[] a){
		int max = a[0];
		// TODO: Follow Homework hand out for method
		int arraylength= a.length;
		int i=1;
		while(i<arraylength){;
			if(a[i]>max){
				max=a[i];
				i=i+1;
			}else{
				i=i+1;
			}
			
		}
		return max;
	}
	
	public static String divide(int v1, int v2){
		String ret = "";
		// TODO: Follow Homework hand out for method
		try{
			ret=Integer.toString(v1/v2);
			v2=0;
		}catch(Exception e){
			ret="Undefined";
		}
		return ret;
	}
	
	public static String twoSum(int[] a, int sum){
		String ret = "";
		// TODO: Follow Homework hand out for method
		for(int n1=1;n1<a.length;n1++){
			for(int n2=1;n2<a.length;n2++){
				if(a[n1]+a[n2]==sum){;
				ret=Integer.toString(n1)+","+Integer.toString(n2);
				}
			}
		}
		return ret;
	}
	
	/* Given for easy printing */
	public static void p(String inp){
		System.out.println(inp);
	}
}