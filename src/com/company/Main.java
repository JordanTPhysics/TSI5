package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter wall height:");
        double wallheight = myObj.nextDouble();
        System.out.println("Enter wall width:");
        double wallwidth = myObj.nextDouble();
        double Area = wallheight * wallwidth;
        System.out.println(Area);

       System.out.println("Enter cost (£) per Litre:");
       double £pL = myObj.nextDouble();
        double £pm2 = £pL * (Area/6); // Assume 1L covers 6m^2
        System.out.println("Total cost will be: £" + £pm2 );
    }
}
