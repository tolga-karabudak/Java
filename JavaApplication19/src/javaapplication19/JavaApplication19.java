/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

/**
    QUESTİON-1
 * @author tolga
 */
import static java.lang.Integer.parseInt;
import java.util.Scanner;
public class JavaApplication19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter two strings and two integers:");
        Scanner inp = new Scanner(System.in);
        String str=inp.nextLine();
        String[] words=str.split(" ");
        
        if(words[0].substring(parseInt(words[3]), parseInt(words[2])).equalsIgnoreCase(words[1].substring(parseInt(words[3]), parseInt(words[2])))){
            System.out.println("The strings are equivalent");
            
        }
        else{
            System.out.println("The strings are not equivalent");
        }
    }
}