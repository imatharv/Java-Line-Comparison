import java.util.Scanner;
import java.lang.*;

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
		System.out.println("Length of first line is: " + firstLineLength);

		System.out.println("Enter co-ordinates for second line: ");
		double secondLineLength = object.lineLength();
		System.out.println("Length of second line is: " + secondLineLength);

		Double obj1 = new Double(firstLineLength);
      		Double obj2 = new Double(secondLineLength);

		if (obj1.equals(obj2)) 
		{
			System.out.println("Both the lines are equal.");
		} 
		else 
		{
			System.out.println("Both the lines are not equal.");

      			int outcome =  obj1.compareTo(obj2);
			
			if (outcome > 0) 
			{
				System.out.println("First line is longer than second one.");
			} 
			else if(outcome < 0) 
			{
				System.out.println("Second line is longer than first one.");
			}
		}
	}
}
