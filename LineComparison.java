import java.lang.Math;
import java.util.*;  
import java.lang.*;
public class LineComparison{

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter co-ordinates of First line"); 
        //Read first co-ordinates of Line 1
        System.out.println("Enter first co-ordinates (x,y) ");  
        System.out.print("Enter x : ");  
        int x1= sc.nextInt();  
        System.out.print("Enter y : "); 
        int y1= sc.nextInt(); 

        //Read second co-ordinates of Line 1
        System.out.println("Enter second co-ordinates (x,y) ");  
        System.out.print("Enter x : ");  
        int x2= sc.nextInt();  
        System.out.print("Enter y : "); 
        int y2= sc.nextInt(); 

        // Calculate length of first Line 
        Double length1 =  Math.sqrt( Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2) );
        System.out.println("Length of first line : " + length1);
        
        System.out.println("Enter co-ordinates of Second line"); 
        //Read first co-ordinates of Line 2
        System.out.println("Enter first co-ordinates (x,y) ");  
        System.out.print("Enter x : ");  
        x1= sc.nextInt();  
        System.out.print("Enter y : "); 
        y1= sc.nextInt(); 

        //Read second co-ordinates of Line 2
        System.out.println("Enter second co-ordinates (x,y) ");  
        System.out.print("Enter x : ");  
        x2= sc.nextInt();  
        System.out.print("Enter y : "); 
        y2= sc.nextInt(); 

        // Calculate length of second line
        Double length2 =  Math.sqrt( Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2) );
        System.out.println("Length of second line : " + length2);

        //Compare first and second line
        int result =  length1.compareTo(length2);
    
        if(result > 0) {
            System.out.println("First line is greater than second line");
        } else if(result < 0) {
            System.out.println("Second line is greater than First line");
        } else {
            System.out.println("Lines are equal");
        }

    }
}