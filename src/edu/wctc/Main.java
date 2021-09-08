package edu.wctc;

import java.util.Scanner;

public class Main {
    private Scanner keyboard;
    private Triplet triplet;


    //Create a Main class that creates at least three objects that would require three pieces of data about them.
    //A person's first, middle, and last names
//    The three dimensions of a cube
//    A time's hours, minutes, and seconds

    public Main(){
        keyboard = new Scanner(System.in);
        Triplet<String> person = new Triplet("Mariana", "S", "Marlis");
        Triplet<Integer> cube = new Triplet(13,13,13);
        Triplet<Boolean> time = new Triplet(true, true, false);

        System.out.println(person.getFirst());
        System.out.println(cube.getFirst());
        System.out.println(time.getFirst());
    }


    public static void main(String[] args) {
        new Main();


    }
}
