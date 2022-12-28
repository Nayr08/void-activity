/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package voidact;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Voidact {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] again = {0, 0, 3};
         
      
            
            
            String[] choose = {" "};
            String[] options = {" Area of a Circle ", " Volume of a cone ", " Surface area of a pyramid ", " Volume of a pyramid ", " Prime number checker "};
            
            do {
                again[2]=3;
                again[1] = JOptionPane.showOptionDialog(null, "What do you want to do? ", " 5 functions ", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
                switch (again[1]) {
                    
                    case 0:      
                        do {
                        again[2] = 2;
                        JOptionPane.showMessageDialog(null, Areaofcircle());
                        again[0] = JOptionPane.showConfirmDialog(null, "Do you want to choose another option?");
                    } while (again[0] == 1);
                    break;            
                    case 1:
                        do {
                        again[2] = 2;
                        JOptionPane.showMessageDialog(null, Volumeofcone());
                        again[0] = JOptionPane.showConfirmDialog(null, "Do you want to choose another option?");
                    } while (again[0] == 1);
                    break;
                    case 2:
                         do{
                        again[2] = 2;
                        JOptionPane.showMessageDialog(null, surfaceofpyramid());
                        again[0] = JOptionPane.showConfirmDialog(null, "Do you want to choose another option?");
                    } while (again[0] == 1);
                    break;
                    case 3:
                        do {
                        again[2] = 2;
                        JOptionPane.showMessageDialog(null, volumeofpyramid());
                        again[0] = JOptionPane.showConfirmDialog(null, "Do you want to choose another option?");
                    } while (again[0] == 1);
                    break;
                    case 4:
                        do {
                        again[2] = 2;
                        JOptionPane.showMessageDialog(null, primechecker());
                        again[0] = JOptionPane.showConfirmDialog(null, "Do you want to choose another option?");
                    } while (again[0] == 1);
                }
                 if (again[2] == 3) {
                break;
            }

        } while (again[0] == 0);
        
    }

    static double Areaofcircle() {
        double area;

        String choose = JOptionPane.showInputDialog(null, " Enter Radius: ");
        double radius = Integer.parseInt(choose);

        double answer = Math.PI * (Math.pow(radius, 2));
       
        return answer;
    }

    static double Volumeofcone() {
        double volume;

        String choose = JOptionPane.showInputDialog(null, " Enter Radius: ");
        double radius = Integer.parseInt(choose);

        String choose1 = JOptionPane.showInputDialog(null, " Enter Height: ");
        double height = Integer.parseInt(choose1);

        double answer = 0.33333 * Math.PI * (Math.pow(radius, 2) * height);

        return answer;
    }

    static double surfaceofpyramid() {
        String choose = JOptionPane.showInputDialog(null, " Enter Perimeter: ");
        double perimeter = Integer.parseInt(choose);
        String choose1 = JOptionPane.showInputDialog(null, " Enter Slant Height: ");
        double slant = Integer.parseInt(choose1);
        String choose2 = JOptionPane.showInputDialog(null, " Enter Base: ");
        double base = Integer.parseInt(choose2);
        double answer = 0.5 * perimeter * slant + base;
        
        return answer;
    }

    static double volumeofpyramid() {
        String choose = JOptionPane.showInputDialog(null, " Enter Base: ");
        double base = Integer.parseInt(choose);
        String choose1 = JOptionPane.showInputDialog(null, " Enter Height: ");
        double height = Integer.parseInt(choose1);
        double answer = 0.5 * base * height + base;
       
        return answer;
    }

    static double primechecker() {
   
       int temp;
	boolean isPrime=true;
	
	String choose = JOptionPane.showInputDialog(" Enter number to check: ");
         int num = Integer.parseInt(choose);
	for(int i=2;i<=num/2;i++)
	{
           temp=num%i;
	   if(temp==0)
	   {
	      isPrime=false;
	      break;
	   }
	}
	
	if(isPrime)
	 JOptionPane.showMessageDialog(null, num + " is a prime number ");
            
	else
	   JOptionPane.showMessageDialog(null, num + " is not a prime number ");
        
        int answer;
        answer=num;
     
    

     return answer;   
      
    }
}
