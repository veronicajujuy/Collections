package ejemplos.set;

import ejemplos.set.modelo.Alumno;

import java.util.*;

public class EjemploHashSetUnicidad {
    public static void main(String[] args) {
        Set<Alumno> sa = new HashSet<>();

        sa.add(new Alumno("Juan", 5));
        sa.add(new Alumno("Pedro", 8));
        sa.add(new Alumno("Luciano", 10));
        sa.add(new Alumno("Benja", 4));
        sa.add(new Alumno("Marina", 7));
        // si no quiero que dos elemenos iguales se agreguen tengo que cambiar el método equals en Alumno
        sa.add(new Alumno("Marina", 7)); // este no se agregará
        sa.add(new Alumno("Marina", 8)); // este si porque la nota es diferente

        System.out.println("sa = " + sa);
        
        // iterando

        System.out.println("iterando usando un foreach");
        for (Alumno a: sa ) {
            System.out.println("a.getNombre() = " + a.getNombre());
        }

        // iterando utilizando un while e iterator
        // tengo que llamar a un iterator

        System.out.println("Iterando usando un while y un iterator");

        Iterator<Alumno> it = sa.iterator();
        while(it.hasNext()){
            Alumno a = it.next();
            System.out.println(a.getNombre());
        }

        // Ejemplo con un List --------------------------------------------------
        List<Alumno> la = new ArrayList<>();

        la.add(new Alumno("JUAN", 5));
        la.add(new Alumno("PEDRO", 8));
        la.add(new Alumno("LUCIANO", 10));
        la.add(new Alumno("BENJA", 4));
        la.add(new Alumno("MARINA", 7));
        la.add(new Alumno("MARINA", 7)); // este no se agregará
        la.add(new Alumno("MARINA", 8)); // este si porque la nota es diferente
        System.out.println("Arraylist --------------------------------------------------------------");
        System.out.println("la = " + la);

        // iterando

        System.out.println("iterando usando un foreach");
        for (Alumno a: la ) {
            System.out.println("a.getNombre() = " + a.getNombre());
        }

        // iterando utilizando un while e iterator
        // tengo que llamar a un iterator

        System.out.println("Iterando usando un while y un iterator");

        it = la.iterator();
        while(it.hasNext()){
            Alumno a = it.next();
            System.out.println(a.getNombre());
        }
        // Arraylist acepta el tipo for:
        System.out.println("Iterando con un for normal");
        for (int i = 0; i < la.size(); i++) {
            Alumno a = la.get(i);
            System.out.println("a = " + a);
        }
    }
}
