import java.lang.Math;
import java.util.*;  
public class LineComparison{

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        
        //Read first co-ordinates
        System.out.println("Enter first co-ordinates (x,y) ");  
        System.out.print("Enter x : ");  
        int x1= sc.nextInt();  
        System.out.print("Enter y : "); 
        int y1= sc.nextInt(); 

        //Read second co-ordinates
        System.out.println("Enter second co-ordinates (x,y) ");  
        System.out.print("Enter x : ");  
        int x2= sc.nextInt();  
        System.out.print("Enter y : "); 
        int y2= sc.nextInt(); 

        // Calculate length
        double length =  Math.sqrt( Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2) );
        System.out.println(" Length of line : " + length);
        
    }
}