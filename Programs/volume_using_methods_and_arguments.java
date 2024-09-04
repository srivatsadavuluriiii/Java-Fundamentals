// Program to find the volume of a box using methods and arguments
// Tue June 04 2024

import java.util.Scanner;

class cuboid_volume_finder {
    void vol(int l, int b, int h) {
        int volume = l * b * h;
        System.out.print("Volume of a Cuboid : " + volume + " cm3.");
    }
}


public class volume_using_methods_and_arguments {
    public static void main(String[] args) {
        try(Scanner object = new Scanner(System.in)){
        System.out.print("Enter the length : ");
        int length = object.nextInt();  
        System.out.print("Enter the breadth : ");
        int breadth = object.nextInt();  
        System.out.print("Enter the height : ");
        int height = object.nextInt();  

        cuboid_volume_finder volume_object = new cuboid_volume_finder();
        volume_object.vol(length, breadth, height);
        }

    }
    
}



