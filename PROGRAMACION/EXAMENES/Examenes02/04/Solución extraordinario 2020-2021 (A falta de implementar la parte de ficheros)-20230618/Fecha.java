/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordinario2021;

import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;


/**
 *
 * @author Profesor
 */
public class Fecha {


    public static boolean esBisiesto(int a)
    {
        return (a%4==0 && !(a%100==0 && a%400!=0));
    }
    public static boolean valida(String f)
    {
        if (f.length()!=10) return false;
        if (f.charAt(2)!='/' || f.charAt(5)!='/') return false;
        try
        {
            int dia = Integer.valueOf(f.substring(0, 2));
            int mes = Integer.valueOf(f.substring(3, 5));
            int anio = Integer.valueOf(f.substring(6));
            if (mes < 1 || mes > 12) return false;
            int[] dias = {31,28,31,30,31,30,31,31,30,31,30,31};
            if (esBisiesto(anio))
                dias[1]++;
            if (dia <1 || dia>dias[mes-1]) return false;
            return true;

        }
        catch (NumberFormatException e)
        {
            return false;
        }
    }

    public static int getDia(String f)
    {
        if (!valida(f)) return 0;
        else
            return Integer.valueOf(f.substring(0, 2));
    }

    public static int getMes(String f)
    {
        if (!valida(f)) return 0;
        else
            return Integer.valueOf(f.substring(3, 5));
    }

    public static int getAnio(String f)
    {
        if (!valida(f)) return 0;
        else
            return Integer.valueOf(f.substring(6));
    }
    
    public static String sumaDias(int d, int m, int a, int dias)
    {
        Date fecha = Date.valueOf(a+"-"+(m+1)+"-"+d);
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(fecha);
        cal.add(Calendar.DATE, dias);
        int dia = cal.get(Calendar.DAY_OF_MONTH);
        int mes = cal.get(Calendar.MONTH);
        int anio = cal.get(Calendar.YEAR);
        return ((dia<10)?"0":"")+dia+"/"+ ((mes<10)?"0":"")+mes+"/"+anio;
    }

    public static String sumaSemanas(String pDosis,int sem)
    {
        if (!valida(pDosis)) return null;
        return sumaDias(getDia(pDosis),getMes(pDosis),getAnio(pDosis),sem*7);
    }

    public static boolean fechaAlcanzada(String f)
    {
        if (!valida(f)) return false;
        Calendar cal= Calendar.getInstance();
        int diaHoy = cal.get(Calendar.DAY_OF_MONTH);
        int mesHoy = cal.get(Calendar.MONTH)+1;
        int anioHoy= cal.get(Calendar.YEAR);
        int dia = getDia(f);
        int mes = getMes(f);
        int anio = getAnio(f);
        if (anioHoy > anio) return true;
        else if (anioHoy < anio) return false;
        else
        {
            if (mesHoy > mes) return true;
            else if (mesHoy < mes) return false;
            else return (diaHoy>=dia);
        }


   
    }
}