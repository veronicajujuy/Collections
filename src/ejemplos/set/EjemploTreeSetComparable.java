package ejemplos.set;

import ejemplos.set.modelo.Alumno;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSetComparable {
    public static void main(String[] args) {
        Set<Alumno> sa = new TreeSet<>();

        sa.add(new Alumno("Juan",5));
        sa.add(new Alumno("Pedro",8));
        sa.add(new Alumno("Luciano",10));
        sa.add(new Alumno("Benja",4));
        sa.add(new Alumno("Marina",7));

        System.out.println("sa = " + sa);
        // cuando aplicamos comparable por nombre retorna
        // [nombre='Benja, nota=4.0, nombre='Juan, nota=5.0, nombre='Luciano, nota=10.0, nombre='Marina, nota=7.0, nombre='Pedro, nota=8.0]
        // cuando aplicamos comparable por nota retorna:
        // [nombre='Benja, nota=4.0, nombre='Juan, nota=5.0, nombre='Marina, nota=7.0, nombre='Pedro, nota=8.0, nombre='Luciano, nota=10.0]

        // singularidad
        // En el caso que quiera agregar dos elementos iguales, se va a agregar o no teniendo en cuenta el compare to:

        sa.add(new Alumno("Luisa",7));
        sa.add(new Alumno("Pedro",5.5));
        sa.add(new Alumno("Juan",5));
        System.out.println("sa = " + sa);
    }   

}
