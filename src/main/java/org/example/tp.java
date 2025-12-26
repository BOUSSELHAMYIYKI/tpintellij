package org.example;

public class tp {
    public static void main(String[] args) {

        int[] notes = {12, 15, 10, 18, 14};
        int somme = 0;

        for (int note : notes) {
            somme += note;
        }

        System.out.println("Somme des notes = " + somme);
    }

}
