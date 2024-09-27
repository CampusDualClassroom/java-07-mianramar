package com.campusdual.classroom;
import java.util.ArrayList;
import java.util.List;

public class Exercise07 {

    public static void main(String[] args) {
        positionInAList(8);
        positionInAList(20);
        sumFirstNaturalNumbers(10);
        showFirstNaturalNumbers(20);
    }

    //TODO ↓
    // Crear una List<Integer> con los números del 10 al 1. Luego buscar el elemento
    // que se le pasa por parámetro.
    // Si lo encuentra, que imprima el siguiente mensaje → El elemento X se encuentra en la posición: Y
    // Si NO lo encuentra, que imprima el siguiente mensaje → El elemento X no se encuentra en la lista.
    public static void positionInAList(int num) {
        List<Integer> lista = new ArrayList<>();
        // Añadimos los números a la lista
        for (int i = 10; i >= 1; i--){
            lista.add(i);
        }
        //Creamos un booleano para indicar si se encuentra o no, al inicio estara en false
        boolean encontrado = false;
        for (int i = 0; i < lista.size(); i++){
            if(lista.get(i) == num) {
                System.out.print("El elemento " + num + " se encuentra en la posición: " + i);
                encontrado = true;
                break;
            }
        }

        if (!encontrado){
            System.out.println("El elemento " + num + " no se encuentra en la lista.");
        }
    }

    //TODO ↓
    // Que imprima como mensaje la suma de los primeros N números positivos
    public static void sumFirstNaturalNumbers(int num) {
        int suma = 0; //Creamos un entero para guardar el acumulativo
        for (int i = 1; i <= num; i++) {
            suma += i; //vamos acumulando el la variable
        }
        System.out.println(suma);
    }

    //TODO ↓
    // Que imprima por pantalla los N primeros números positivos
    public static void showFirstNaturalNumbers(int num) {
        for(int i = 1; i <= num; i++){
            System.out.print(i);
        }
    }

}
