package edu.wctc;


//Create a class called Triplet that holds three variables (first, second, and third) of type T.

public class Triplet <T> {
    private T first;
    private T second;
    private T third;

//Create the required methods to get and set these values and include at least one constructor.


    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    public T getThird() {
        return third;
    }

    public void setThird(T third) {
        this.third = third;
    }

    //constructors


    @Override
    public String toString() {
        return "Triplet{" + "first =" + first + ", second =" + second + ", third =" + third + '}';}

    public Triplet(T first, T second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }
}



