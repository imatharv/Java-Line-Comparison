import java.util.Scanner;

public class lineComparison
{
	public double lineLength()
	{
   		Scanner scanner = new Scanner(System.in);
      		double x1;
      		double y1;
      		double x2;
      		double y2;
      		
      		System.out.println("Enter value for x1: ");
      		x1 = scanner.nextDouble();

		System.out.println("Enter value for y1: ");
      		y1 = scanner.nextDouble();

		System.out.println("Enter value for x2: ");
      		x2 = scanner.nextDouble();

		System.out.println("Enter value for y2: ");
      		y2 = scanner.nextDouble();

      		return Math.sqrt((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2)));
   	}
	public static void main(String[] args)
	{
  		System.out.println("Welcome to the line comparison problem");

		lineComparison object = new lineComparison();

		System.out.println("Enter co-ordinates for first line: ");
      		double firstLineLength = object.lineLength();
      		System.out.println("Length of first line is: " +firstLineLength);

      		System.out.println("Enter co-ordinates for second line: ");
      		double secondLineLength = object.lineLength();
      		System.out.println("Length of second line is: " +secondLineLength);
	}
}
