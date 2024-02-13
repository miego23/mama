/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sangsang;
import java.util.Scanner;


public class Sangsang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner scn = new Scanner(System.in);

    System.out.print("Enter Last Name:");
     String lName = scn.nextLine();

    System.out.print("Enter First Name:");
    String fName = scn.nextLine();

    System.out.print("Enter Middle Name:");
    String mName = scn.nextLine();

    System.out.print("Enter Age:");
     int age = scn.nextInt();

                scn.nextLine();
        
        System.out.print("Enter Gender:");
        String gName = scn.nextLine();

        System.out.print("Enter Birthdate:");
        String bName = scn.nextLine();

        System.out.println(" ");
            System.out.println("YOUR DATA:" );

        System.out.println("Last Name: " + lName);        
        System.out.println("First Name: " + fName);       
        System.out.println("Middle Name: " + mName);       
        System.out.println("Age: " + age);      
        System.out.println("Gender: " + gName);
        System.out.println("Birthdate: " + bName);

                scn.close();
        



    }
    
}
