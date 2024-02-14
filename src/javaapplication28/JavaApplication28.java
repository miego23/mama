/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication28;
import java.util.Scanner;
/**
 *
 * @author DASURECO 11
 */
public class JavaApplication28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        
        int fahrenheit;
        double celsius;
        
             System.out.println("Input Fahrenheit: ");
             fahrenheit = scn.nextInt();
             
             celsius = (((fahrenheit - 32.0)* 5/9.0));
             System.out.println(fahrenheit +" degree Fahrenheit is equal to "+celsius+" in Celsius");
    }
    
}
