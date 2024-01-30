package ejemplos.list;

import ejemplos.set.modelo.Alumno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EjemploListComparableComparator {
    public static void main(String[] args) {
        List<Alumno> la = new ArrayList<>();

        la.add(new Alumno("JUAN", 5));
        la.add(new Alumno("PEDRO", 8));
        la.add(new Alumno("LUCIANO", 10));
        la.add(new Alumno("BENJA", 4));
        la.add(new Alumno("MARINA", 7));
        la.add(new Alumno("MARINA", 7)); // este no se agregará
        la.add(new Alumno("ALONSO", 6));
        System.out.println("la = " + la);

        // Ordenando
        Collections.sort(la);

        System.out.println("Iterando utilizando un Stream foreach con collections");
        la.forEach(System.out::println);

        // Ordenando con sort

        la.sort(Comparator.comparing((Alumno a) -> a.getNota()));

        // iterando

        System.out.println("Iterando utilizando un Stream foreach con comparator");
        la.forEach(System.out::println);
        // ordenando pero al reves pero por nombre
        la.sort(Comparator.comparing((Alumno a) -> a.getNombre()).reversed());

        // iterando

        System.out.println("Iterando utilizando un Stream foreach con comparator");
        la.forEach(System.out::println);

        System.out.println("la = " + la);
    }
}
