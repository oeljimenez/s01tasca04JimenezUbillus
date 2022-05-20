package it.academy.java.sprint1.tasca4.n1exercisi3;

public class Exercisi3 {

    public Exercisi3() {
    }

    public void generateException() {
        //add ArrayIndexOutOfBoundsException Exception
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Last element: " + intArray[5]);
    }
}
