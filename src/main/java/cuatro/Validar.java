package cuatro;

import java.util.Stack;

public class Validar {

    public static String balanceo(String cadena) {

        Stack<Character> pila = new Stack<>();

        for (int f = 0; f < cadena.length(); f++) {

            if (cadena.charAt(f) == '(' || cadena.charAt(f) == '[' || cadena.charAt(f) == '{') {
                pila.push(cadena.charAt(f));
            } else {
                if (cadena.charAt(f) == ')') {
                    if (pila.isEmpty()) {
                        return "incorrecto";
                    } else if (pila.pop() != '(') {
                        return "incorrecto";
                    }
                } else {
                    if (cadena.charAt(f) == ']') {
                        if (pila.isEmpty()) {
                            return "incorrecto";
                        } else if (pila.pop() != '[') {
                            return "incorrecto";
                        }
                    } else {
                        if (cadena.charAt(f) == '}') {
                            if (pila.isEmpty()) {
                                return "Incorrecto";
                            } else if (pila.pop() != '{') {
                                return "incorrecto";
                            }
                        }
                    }
                }
            }

        }

        if (pila.isEmpty()) {
            return "correcto";
        } else {
            return "incorrecto";
        }
    }
}
