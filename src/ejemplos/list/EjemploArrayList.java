package ejemplos.list;

import ejemplos.set.modelo.Alumno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EjemploArrayList {
    public static void main(String[] args) {
        List<Alumno> la = new ArrayList<>();
        System.out.println(la + " , size: "+ la.size());
        la.add(new Alumno("JUAN", 5));
        la.add(new Alumno("PEDRO", 8));
        la.add(new Alumno("LUCIANO", 10));
        la.add(new Alumno("BENJA", 4));
        la.add(new Alumno("ALONSO", 6));
        System.out.println(la + " , size: "+ la.size());

        la.add(1,new Alumno("TORIBIO", 9));// SE AGREGA EN LA POSICION 1, MUEVE A PEDRO
        System.out.println(la + " , size: "+ la.size());
        la.set(2, new Alumno("SELINA", 4.5));// reemplaza a pedro en la posicion 2
        System.out.println(la + " , size: "+ la.size());

        // remover
        // aca hay que tener en cuenta que borra de acuerdo al metodo equals que utilizamos en alumno
        la.remove(new Alumno("ALONSO", 6));
        System.out.println(la + " , size: "+ la.size());

        // remover por indice:
        la.remove(0);
        System.out.println(la + " , size: "+ la.size());    
        
        boolean b = la.contains(new Alumno("SELINA", 4.5));
        System.out.println("b = " + b); // true
        b = la.contains(new Alumno("SELINA", 4));
        System.out.println("b = " + b); // false
        
        // convertir a un array de objetos:
        
        Object a[] = la.toArray();
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[i] = " + a[i]);
        }
    }
}
