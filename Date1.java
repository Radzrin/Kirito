import java.util.Date;

public class Date1 {

	public static void main(String[] arg){

		System.out.println("DateSample");

		Date birthday = new Date();
		
		int a = 5;

		Date today = new Date();

		System.out.println("Date today:" + today.toString());
		System.out.println("Date today:" + today.getTime());
		System.out.println("Date today:" + today.getYear());
		System.out.println("Date today:" + today.getMonth());
	}
}
