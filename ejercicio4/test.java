package ejercicio4;

import actividad1.ExceptionIsEmpty;

public class test {
    public static void main(String[] args) throws ExceptionIsEmpty {
        String[] pruebas = {
            "()()()([])()",
            "((()))[]",
            "([])[](",
            "([{)]}",
            "[",
            "[][][]{{{}}}"
        };

        for (String s : pruebas) {
            System.out.println("Entrada: " + s + " ----> " + simbolos.symbolBalancing(s));
        }
    }
}
