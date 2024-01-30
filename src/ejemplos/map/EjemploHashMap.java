package ejemplos.map;

import java.util.HashMap;
import java.util.Map;

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
        
    }
}
