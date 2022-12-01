package tres;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Palabras {

    public static String contador(String frase) {

        int contador = 0;
        String respuesta = "";
        String fraseAjustada = frase.replaceAll("[,.()!¡?¿]", "").toLowerCase();
        String[] palabras = fraseAjustada.split("\\s+");
        Set<String> palabrasSinRepetir = new HashSet(Arrays.asList(palabras));

        for (String palabra: palabrasSinRepetir) {
            contador = 0;
            for(String pal : palabras) {
                contador = pal.equals(palabra) ? contador+1 : contador;
            }
            if (contador == 1) {
                respuesta += palabra + " - " + contador + " vez\n";
            } else {
                respuesta += palabra + " - " + contador + " veces\n";
            }
        }
        return respuesta;
    }
}
