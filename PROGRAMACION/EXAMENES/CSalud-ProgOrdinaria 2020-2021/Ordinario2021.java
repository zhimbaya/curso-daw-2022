/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordinario2021;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Profesor
 */
public class Ordinario2021 {

    public static ArrayList<Paciente> pacientes = new ArrayList<Paciente>();

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

    public static int menu()
    {
        int op = 0;
        while (op<1 || op > 4)
        {
            System.out.println("1. Registrar paciente");
            System.out.println("2. Mostrar pacientes con dosis completa");
            System.out.println("3. Mostrar pacientes pendientes de segunda dosis");
            System.out.println("4. Salir");
            op = leerInt();
        }
        return op;
    }

    public static void registrarPaciente()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre y apellidos: ");
        String nombre = sc.nextLine();
        System.out.print("Telefono: ");
        String tel = sc.nextLine();
        String fecha="";
        while (!Fecha.valida(fecha))
        {
            System.out.print("Fecha de la primera dosis: ");
            fecha = sc.nextLine();
        }
        System.out.print("Nombre de la vacuna: ");
        String vac = sc.nextLine();
        int tipoVac=0;

        while (tipoVac!=1 && tipoVac!=2)
        {
            System.out.print("Monodosis(1) o Multidosis(2): ");
            tipoVac = leerInt();
        }
        Vacuna v = null;
        if (tipoVac==2)
        {
            System.out.print("Número de semanas para la segunda dosis: ");
            int sem = leerInt();
            v = new VMultidosis(vac, sem);
        }
        else
        {
            v = new VMonodosis(vac);
        }

        pacientes.add(new Paciente(nombre, tel, fecha, v));

    }

    public static void mostrarDosisCompleta()
    {
        Iterator<Paciente> it = pacientes.iterator();
        while (it.hasNext())
        {
            Paciente p = it.next();
            if (p.dosisCompleta())
              System.out.println(p);
        }
    }

public static void mostrarDosisPendiente()
    {
        Iterator<Paciente> it = pacientes.iterator();
        while (it.hasNext())
        {
            Paciente p = it.next();
            if (!p.dosisCompleta())
              System.out.println(p);
        }
    }

    public static void main(String[] args) {
        
        int op = menu();
        while (op!=4)
        {
            switch (op)
            {
                case 1: registrarPaciente(); break;
                case 2: mostrarDosisCompleta(); break;
                case 3: mostrarDosisPendiente(); break;
            }
            op = menu();
        }
    }

}
