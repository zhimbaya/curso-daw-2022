/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donmarciano;

import java.util.Scanner;

/**
 *
 * @author anusk
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
                System.out.println("Número no válido");
            }
        }
    }
    
    
    public static int leerSiNo()
    {
        System.out.println("1. Sí\n2. No");
        int r = leerInt();
        while (r!=1 && r!=2)
        {
            System.out.println("Número no válido");    
            r = leerInt();
        }
        return r;
    }
}
