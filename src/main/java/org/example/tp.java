package org.example;

public class tp {

    // Méthode pour calculer la somme des notes
    public static int calculerSomme(int[] notes) {
        int somme = 0;
        for (int note : notes) {
            somme += note;
        }
        return somme;
        //jrjktgrjegit
    }

    public static void main(String[] args) {
        int[] notes = {12, 15, 10, 18, 14};
        int somme = calculerSomme(notes);
        System.out.println("Somme des notes = " + somme);
    }
}
