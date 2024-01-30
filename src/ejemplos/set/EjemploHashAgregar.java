package ejemplos.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashAgregar {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();
        hs.add("uno");
        hs.add("dos");
        hs.add("tres");
        hs.add("cuatro");
        hs.add("cinco");
        System.out.println(hs); // aca vemos que no mantiene un orden.
        boolean b = hs.add("tres"); // no lo agrega porque no admite duplicados
        System.out.println("hs = " + hs);
        System.out.println("b = " + b); // b es false
        // los set no se pueden ordenar



    }
}
