package interview_programs;

import java.util.Scanner;

public class Swap2NumNo3rdVarUsrIP {	
	//Referred from: https://www.javatpoint.com/program-to-swap-two-numbers-without-using-the-third-variable
	public static void main(String a[])   
    {   
        System.out.println("Enter the value of x and y");  
        Scanner sc = new Scanner(System.in);  
        /*Define variables*/  
        int x = sc.nextInt();  
       int y = sc.nextInt();  
       
        System.out.println("before swapping: "+x +" "+ y);  
       /*Swapping*/  
        x = x + y;   
        y = x - y;   
        x = x - y;   
        System.out.println("After swapping: "+x +"  " + y);   
    }   

}

//Swapping Logic:
//X= 25 (First number), Y= 23 (second number)

//X = X + Y = 25 +23 = 48
//Y = X - Y = 48 - 23 = 25
//X = X -Y = 48 - 25 = 23
//and the numbers are swapped as X =23 and Y =25. 

//Algorithm:
//STEP 1: START
//STEP 2: ENTER x, y
//STEP 3: PRINT x, y
//STEP 4: x = x + y
//STEP 5: y= x - y
//STEP 6: x =x - y
//STEP 7: PRINT x, y
//STEP 8: END
