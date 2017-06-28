package org.umg.curso;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by alumno on 26/06/2017.
 */
public class Banco {
    // escribir main + ctl J
    public static void main(String[] args) {

        Cliente c = new Cliente( );
        c.setEdad(12);
        c.setNombre("Diego");
        c.setSalario(1500);

        System.out.println("Estimado cliente: " + c.getNombre()+ " edad: " + c.getEdad() + " salario:" + c.getSalario());

        try {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Su nombre: ");
            c.setNombre(reader.readLine());
            System.out.println("Su Edad: ");
            c.setEdad(Integer.parseInt(  reader.readLine())) ;
            System.out.println("Salario: ");
            c.setSalario(Integer.parseInt(  reader.readLine())) ;




            System.out.println("Estimado cliente: " + c.getNombre()+ " edad: " + c.getEdad() + " salario:" + c.getSalario());


        }catch (Exception ex)
        {
            ex.printStackTrace();
        }






    }


}
