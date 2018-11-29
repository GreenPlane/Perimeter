import java.util.Scanner;

public class Main {
    public static double perimeter (int[] a){

        //double distance1to2 = Math.sqrt(Math.pow((x2 - x1), 2) + (Math.pow((y2-y1), 2)));
        //double distance2to3 = Math.sqrt(Math.pow((x2 - x3), 2) + (Math.pow((y2-y3), 2)));
        //double distance3to4 = Math.sqrt(Math.pow((x3 - x4), 2) + (Math.pow((y3 - y4), 2)));
        //double distance1to4 = Math.sqrt(Math.pow((x4 - x1), 2) + (Math.pow((y4-y1), 2)));

        //double perimeter = distance1to2+distance2to3+distance1to4+distance3to4;

        //return (int) perimeter;
    }
    public static void main (String[] args){
        Scanner scan = new Scanner;

        System.out.println("Enter 4 coordinate points (A, B, C, D) to find the perimeter of a quadrilateral:");
        int [][] a = new int [4][2];
        for (int i = 0; i < a.length; i++){
            a[i] = scan.nextInt();
        }
        perimeter(a);
    }
}
