/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extra21;

import java.util.Scanner;

/**
 *
 * @author Profesor
 */
public class Util {

    public static int leerInt()
    {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            try
            {
                return sc.nextInt();
            }
            catch (Exception e)
            {
                sc.nextLine();
            }
        }
    }
    public static String leerLinea()
    {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static double leerDouble()
    {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            try
            {
                return sc.nextDouble();
            }
            catch (Exception e)
            {
                sc.nextLine();
            }
        }
    }
    
}
