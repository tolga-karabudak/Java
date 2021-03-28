
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tolga
 */
public class Question2 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a SSN: ");
        String ssn = in.next();
        
        for (int i = 0; i < ssn.length(); i++)
        {
            char ssnDigit = ssn.charAt(i);
            
            if (i == 3 || i == 6)
            {
                if (ssnDigit != '-')        
                {
                    System.out.printf("%s is an invalid social security number%n", ssn);   
                    System.exit(1);
                }   
            }
            else
            {
                if (!Character.isDigit(ssnDigit))
                {
                    System.out.printf("%s is an invalid social security number%n", ssn);   
                    System.exit(1);
                }
            }
        }
        
        System.out.printf("%s is a valid social security number.%n", ssn);
    }
}
    


