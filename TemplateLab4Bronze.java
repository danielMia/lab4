/**
 * Template
 * COMP 1020 Summer 2016
 * Lab 4 Bronze Exercise
 */
import java.io.*; //Required for most I/O operations
import java.util.Scanner;

public class TemplateLab4Bronze {
  
  static final String INPUT_FILE = "testLab4Bronze.txt";
  static final String OUTPUT_FILE = "outputLab4Bronze.txt";
  static String line = null;
  static int count = 0;
  public static void main(String[] args) {
    try {
    	FileReader inputfile = new FileReader("E:\\workspace\\lab4\\src\\"+INPUT_FILE);
    	BufferedReader buff = new BufferedReader(inputfile);
//    	Scanner lineReader = new Scanner(buff.readLine());
    	FileWriter outputFile = new FileWriter("E:\\workspace\\lab4\\src\\"+OUTPUT_FILE,true);
    	PrintWriter outputPrint = new PrintWriter(outputFile);
    	while ((line = buff.readLine()) !=  null){
    		count++;
    		System.out.println(line);
    		outputPrint.println(""+count+":"+line);
    	}
    	buff.close();
    	outputPrint.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println("no file found");

	}
    
    System.out.println("\nEnd of processing.\nProgrammed by Stew Dent.");
  }//main
  
}//TemplateLab4Bronze
