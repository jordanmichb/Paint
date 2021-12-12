import java.util.Scanner;

public class Paint2 {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        double cansNeeded;

        final double squareFeetPerGallons = 350.0;
        final double gallonsPerCan = 1.0;

        // Get wall height
        do {
        	try {
	        	System.out.println("Enter wall height (feet): ");
	        	wallHeight = scnr.nextDouble();
	        	
	        	// Error check for negative numbers
	        	if (wallHeight <= 0) {
	        		throw new Exception();
	        	}
	        	
        	}
        	// Catch exception
        	catch (Exception excpt) {
        		System.out.println("Enter a valid number.");
        		// Move scanner to next line to clear buffer
        		scnr.nextLine();
        	}
        	
        } while (wallHeight <= 0.0);
        

        // Get wall width
        do {
        	try {
        		System.out.println("Enter wall width (feet): ");
	        	wallWidth = scnr.nextDouble();
	        	
	        	// Error check for negative numbers
	        	if (wallWidth <= 0) {
	        		throw new Exception();
	        	}
	        	
        	}
        	// Catch exception
        	catch (Exception excpt) {
        		System.out.println("Enter a valid number.");
        		// Move scanner to next line to clear buffer
        		scnr.nextLine();
        	}

        } while (wallWidth <= 0.0);

        // Calculate and output wall area
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area:  " + wallArea + " square feet");

        // Calculate and output the amount of paint in gallons needed to paint the wall
        gallonsPaintNeeded = wallArea / squareFeetPerGallons;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");

        // Calculate and output the number of paint cans needed to paint the wall,
        // rounded up to nearest integer
        // Use method ceil from class Math to round up
        cansNeeded = Math.ceil(gallonsPerCan * gallonsPaintNeeded);
        System.out.println("Cans needed: " + cansNeeded + " can(s)");
        
        // Close the scanner
        scnr.close();
    }
}
