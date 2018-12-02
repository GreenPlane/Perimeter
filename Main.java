import java.util.Scanner;

class Main {
  public static double distance (int x1, int x2, int y1, int y2){
    return (Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2))));  //Calculates the distance between two points and returns.
  }
  public static double perimeter (double d1, double d2, double d3, double d4){
    return (d1 + d2 + d3 + d4);  //Calculates the total perimeter and returns.
  }
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    System.out.println("Enter 4 coordinate points (A,B,C,D) to find the perimter of a quadrilateral:");
    int flag = 1; //Declares first side and will increment by 1 every single time a set of coordinates are entered.
    double d1,d2,d3,d4; //Initializes the distances for each side.  Stored inside while loop.
    d1 = 0; 
    d2 = 0;
    d3 = 0;
    d4 = 0;
    
    boolean runAgain = true; //Assumes that the user wants to rerun the program over and over again 
                            //(to, obviously, enter in all 4 sides of a quadrilateral) 
                            //UNTIL flag > 4 (which means that more than 4 sides have been entered) 
                            //and the user enters "N" OR the boolean condition "runAgain" is set to false (which ends the while loop).
    while (runAgain == true){
      int x1,x2,y1,y2;
    
      x1 = scan.nextInt(); //These variables are reusable because of the while loop. Once the initial coordinates are stored in d1,d2,d3,or d4, then it is safe to reuse.
      y1 = scan.nextInt();
      x2 = scan.nextInt();
      y2 = scan.nextInt();
      
      if (flag == 1){
        d1 = distance(x1,x2,y1,y2);
      }
      else if (flag == 2){
        d2 = distance(x1,x2,y1,y2);
      }
      else if (flag == 3){
        d3 = distance(x1,x2,y1,y2);
      }
      else{
        d4 = distance(x1,x2,y1,y2);
      }
      flag++;
      
      if (flag > 4){  //When 4 sides of the quadrilateral are completed...
          System.out.println("The perimeter is: " + perimeter(d1,d2,d3,d4));
          System.out.println("Would you like to find the perimeter of another quadrilateral? (Y or N)");
        
          String userInputRunAgain = scan.next(); //Scans to see if user wants to enter another quadrilateral.
          userInputRunAgain = userInputRunAgain.toUpperCase(); //In case user enters in a lowercase value.
        
          if (userInputRunAgain.equals("Y")){ //If user wants to rerun the loop...
            flag = 1; //Makes sure that the user can enter 4 sides again (since flag is stored as 5 at the end of the first quadrilateral calculations.)
            System.out.println("Enter 4 coordinate points (A, B, C, D) to find the perimeter of a quadrilateral:");
          }
          else if (userInputRunAgain.equals("N")){ //If user wants to end...
            runAgain = false; //Boolean condition runAgain determines the ENTIRE while loop, so will immediately stop.
            System.out.println("The program has been completed and will now stop. :)");
          }
          else{ //If user enters something other than Y or N...
            System.out.println("Invalid response."); //Ends the program. User can rerun the program.
            runAgain = false; //Ends the ENTIRE while loop.
          }
      }
        else{ //If in the middle of entering the 4 sides of the quadrilateral, then it just repeats the loop.
          System.out.println("Enter 4 coordinate points (A, B, C, D) to find the perimeter of a quadrilateral:");
        }
    }
  }
}
