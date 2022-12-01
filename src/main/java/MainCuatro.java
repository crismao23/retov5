import cuatro.Validar;

import javax.swing.JOptionPane;

public class MainCuatro {
    public static void main(String[] args) {

        String entradaUsuario = JOptionPane.showInputDialog("4-Introduzca una cadena:");
        System.out.println(entradaUsuario + " -> " + Validar.balanceo(entradaUsuario));

        //Ejemplos
        //System.out.println("[()()(){[][]}{([]{})}] -> " + Validar.balanceo("[()()(){[][]}{([]{})}]"));
        //System.out.println("([(]{)}) -> " + Validar.balanceo("([(]{)})"));
        //System.out.println("[()()(){[hola][onyx]}{([juan]{})}] -> " + Validar.balanceo("[()()(){[hola][onyx]}{([juan]{})}]"));
    }
}
