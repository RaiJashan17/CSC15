// H O M E W O R K   # 1 0 
// C S C   1 5
// Student's Name Here: Jashan Rai

package Main;

import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Homework10{
	public static void main(String[] args){
		// My code to dynamically create a text file (DO NOT MODIFY OR REMOVE!)
		EZFileWrite efw = new EZFileWrite("parse.txt");
		efw.writeLine("Shawshank Redemption*1994*Tim Robbins*2.36");
		efw.writeLine("The Godfather*1972*Al Pacino*2.92");
		efw.writeLine("Raging Bull*1980*Robert De Niro*2.15");
		efw.writeLine("Million Dollar Baby*2004*Hilary Swank*2.2");
		efw.writeLine("Straight Outta Compton*2015*Jason Mitchell*2.45");
		efw.saveFile();
		// End of test
		
		// TODO: Write your code to load the text file into memory, parse it, and display the data in a meaningful way...
		// (Use the instructions in the hand out to complete the assignment for full credit)
		EZFileRead ezr = new EZFileRead("parse.txt");
		String[] movies = new String [ezr.getNumLines()];
		int[] years = new int [ezr.getNumLines()];
		String[] stars = new String [ezr.getNumLines()];
		float[] runtimes = new float [ezr.getNumLines()];
		for(int i=0; i<ezr.getNumLines();i++){
			String raw = ezr.getNextLine();
			StringTokenizer st= new StringTokenizer(raw,"*");
			movies[i]=st.nextToken();
			years[i]=Integer.parseInt(st.nextToken());
			stars[i]=st.nextToken();
			runtimes[i]=Float.parseFloat(st.nextToken());
			try{
				st.nextToken();
			}catch(NoSuchElementException exception){
			}
			}
		System.out.println("-----MOVIES-----");
		for(int i=0; i<movies.length; i++)
			System.out.println(movies[i]);
		System.out.println("-----YEARS-----");
		for(int i=0; i<years.length; i++)
			System.out.println(years[i]);
		System.out.println("-----STARS-----");
		for(int i=0; i<stars.length; i++)
			System.out.println(stars[i]);
		System.out.println("-----RUNTIMES-----");
		for(int i=0; i<runtimes.length; i++)
			System.out.println(runtimes[i]);
		}
	}