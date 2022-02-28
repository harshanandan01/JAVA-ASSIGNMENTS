/* Firstly we will import file related methods and Scanner for taking inputs ,then address of files or folder where to search.
I have used do while to run the program again and again , then list of file is stored in string and we will be continously check each file or folder also then check the name of file present or not and store in boolean str1,
When coming to main method , object of Demo class is created and calling the findFile(). */
import java.io.File;
import java.util.Scanner;
public class JavaAssignment1{

	private void findFile()
	{
		File file = new File("c:/Users/harsh");
		String s ;
		Scanner sc = new Scanner(System.in);
		do{
			int x =0;
			System.out.print("Enter file/folder name");
			s =sc.nextLine();
			 String[] files = file.list();
			for (String string : files){
				 Boolean str1 = s.equals(string);
				if (str1){
				x = 1;
				System.out.print("File Found : ");
				System.out.println(string);
				System.out.println("Path : "+ file.getAbsolutePath());
				}			
			}
				if(x == 0)
				{
					System.out.println("File not find : Reenter the name of the file.");
				}
			} while(true);
	}
		public static void main(String[] args){
			JavaAssignment1 obj =new JavaAssignment1();
			obj.findFile();
		}	
}