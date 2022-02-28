import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;
import java.util.Scanner;
public class JavaAssignment3 {

  public static void runSystemCommand(String command) {

		try {
			Process p = Runtime.getRuntime().exec(command);
			BufferedReader inputStream = new BufferedReader(
					new InputStreamReader(p.getInputStream()));

			String s = "";
			while ((s = inputStream.readLine()) != null) {
				System.out.println(s);
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
		String ip;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter IP address : ");
		ip =sc.nextLine();
		runSystemCommand("ping " + ip);

	
	}
}