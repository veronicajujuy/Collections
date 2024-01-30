package ejemplos.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSet {
    public static void main(String[] args) {
        Set<String> ts = new TreeSet<>(Comparator.reverseOrder()); // agrego en el constructor para agregar en orden reverso
        ts.add("uno");
        ts.add("dos");
        ts.add("tres");
        ts.add("tres"); // no se agrega por estar duplicado
        ts.add("cuatro");
        ts.add("cinco");
        System.out.println("ts = " + ts); // ordena de forma alfabetica reversa: [uno, tres, dos, cuatro, cinco]

        Set<Integer> numeros = new TreeSet<>();
        numeros.add(1);
        numeros.add(8);
        numeros.add(6);
        numeros.add(12);
        numeros.add(9);
        System.out.println("numeros = " + numeros); // nos muestra ordenados: [1, 6, 8, 9, 12]

        // dentro del treeset, debemos incorporar objetos comparables o que tengan la interface compareTo

    }
}
