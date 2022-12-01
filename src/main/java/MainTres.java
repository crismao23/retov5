import tres.Palabras;

import javax.swing.*;

public class MainTres {
    public static void main(String[] args) {

        String entradaUsuario = JOptionPane.showInputDialog("3-Introduzca una frase:");
        System.out.println(Palabras.contador(entradaUsuario));

        //Ejemplo
        //System.out.println(Palabras.contador("hello world, big WoRld"));
    }
}
