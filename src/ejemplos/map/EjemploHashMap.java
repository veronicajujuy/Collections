package ejemplos.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemploHashMap {
    public static void main(String[] args) {
        Map<String, String > persona = new HashMap<>();
        persona.put(null,"12345");
        persona.put("nombre","Juan");
        persona.put("apellido","Perez");
        persona.put("edad","30");
        persona.put("email","jperez@gmail.com");
        persona.put("email","email@email.com"); // no se pueden tener dos keys con el mismo valor acá sobreescribe
        System.out.println("persona = " + persona);
        
        String nombre= persona.get("nombre");
        System.out.println("nombre = " + nombre);

        String p = persona.remove("edad"); // elimina por key
        boolean b = persona.remove("email","jperez@gmail.com"); // elimina por key y valor

        System.out.println("b = " + b);
        System.out.println("persona = " + persona);
        
        boolean b1 = persona.containsKey("edad");
        System.out.println("b1 = " + b1);

        b1 = persona.containsValue("Juan");
        System.out.println("Contiene juan? = " + b1);
        
        // pasar los valores a una collection

        Collection<String> valores = persona.values();

        for (String v: valores) {
            System.out.println("v = " + v); // imprime los valores
        }
        System.out.println("===============================================");
        Set<String> llaves = persona.keySet();
        for (String l: llaves) {
            System.out.println("l = " + l); // imprime los keys
        }
        System.out.println("===============================================");
        // con un método interno de Map
        for(Map.Entry<String, String> par: persona.entrySet()){
            System.out.println(par.getKey()+" => "+ par.getValue());
        }

        // Otra forma de iterar

        System.out.println("===============================================");
        for(String llave: persona.keySet()){
            String valor = persona.get(llave);
            System.out.println(llave+" => "+ valor);
        }
        // otros metodos
//        persona.size();
//        persona.isEmpty();
//        persona.replace("nombre", "Lucio");



        
    }
}
