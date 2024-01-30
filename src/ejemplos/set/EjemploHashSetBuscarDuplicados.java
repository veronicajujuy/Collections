package ejemplos.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetBuscarDuplicados {
    public static void main(String[] args) {
        String[] peces = {"Corvina", "Lenguado", "Pejerrey", "Robalo", "Atún", "Lenguado"};

        Set<String> unicos = new HashSet<>();
        Set<String> duplicados = new HashSet<>();

        for (String pez: peces) {
            if(!unicos.add(pez)){
                duplicados.add(pez);
            }
        }
        System.out.println(unicos); // solamente agrega los que no están repetidos: [Corvina, Robalo, Atún, Lenguado, Pejerrey]
        System.out.println(duplicados); // [Lenguado]

        unicos.removeAll(duplicados);
        System.out.println(unicos); // acá borro lenguado
        System.out.println(duplicados); // [Lenguado]

    }
}
