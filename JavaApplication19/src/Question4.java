
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
public class Question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter sentence");
        String cumle = input.nextLine();
        System.out.println("Replace what?");
        String degisen = input.nextLine();
        System.out.println("Replace with:");
        String yerinegelen = input.nextLine();
        System.out.println(cumle.replaceAll(degisen, yerinegelen));
    }
    
}
