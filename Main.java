import java.util.Scanner;

class Main {
  public static double distance (int x1, int y1, int x2, int y2){
    return (Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2))));  //Calculates the distance using distance formula between two points and returns.
  }
  public static double perimeter (double d1, double d2, double d3, double d4){
    return (d1 + d2 + d3 + d4);  //Calculates the total perimeter and returns.
  }
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    System.out.println("Enter 4 coordinate points (A,B,C,D) to find the perimter of a quadrilateral:");
    double d1,d2,d3,d4; //Initializes the distances for each side. Stored inside while loop.
    
    int [] coordinates = new int [8]; //array for user input
    
    boolean runAgain = true; 
    while (runAgain == true){ //Assumes that loop will be run again user quits.
      
      for (int i = 0; i < coordinates.length; i++){
        coordinates[i] = scan.nextInt(); //asks for User input 
      }
      
      d1 = distance(coordinates[0], coordinates[1], coordinates[2], coordinates[3]); //Calculates distances
      d2 = distance(coordinates[2], coordinates[3], coordinates[4], coordinates[5]);
      d3 = distance(coordinates[4], coordinates[5], coordinates[6], coordinates[7]);
      d4 = distance(coordinates[0], coordinates[1], coordinates[6], coordinates[7]);
      
      System.out.println("The perimeter is: " + perimeter(d1,d2,d3,d4));
      System.out.println("Would you like to find the perimeter of another quadrilateral? (Y or N)");
        
      String userInputRunAgain = scan.next(); //Scans to see if user wants to enter another quadrilateral.
      userInputRunAgain = userInputRunAgain.toUpperCase(); //In case user enters in a lowercase value.
        
      if (userInputRunAgain.equals("Y")){ //If user wants to rerun the loop...
        System.out.println("Enter 4 coordinate points (A, B, C, D) to find the perimeter of a quadrilateral:");
      }
      else if (userInputRunAgain.equals("N")){ //If user wants to end...
        runAgain = false; //sets boolean condition runAgain to false, will stop loop.
        System.out.println("The program has been completed and will now stop. :)");
      }
      else{ //If user enters something other than Y or N...
        System.out.println("Invalid response."); //Ends the program. User can rerun the program.
        runAgain = false; //Ends the while loop.
      }
    }
  }
}
