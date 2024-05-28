package esercizio3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Esercizio3Main {

    public static void main(String[] args) {


        Map<String, String> rubrica = new HashMap<>();
        aggiungiNumeroInRubrica(rubrica);
        aggiungiNumeroInRubrica(rubrica);
        aggiungiNumeroInRubrica(rubrica);

        System.out.println("I tuoi contatti sono: " + rubrica);

        rimuoviNumeroInRubrica(rubrica);


        ricercaNumeroInRubrica(rubrica);


        ricercaNomeInRubrica(rubrica);


        System.out.println(rubrica);

        stampaRubrica(rubrica);

    }

    public static void aggiungiNumeroInRubrica(Map<String, String> rubrica) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il nome che vuoi aggiungere: ");
        String nome = scanner.nextLine();
        System.out.println("Inserisci il numero che vuoi aggiungere: ");
        String telefono = scanner.nextLine();
        rubrica.put(nome, telefono);
    }

    public static void rimuoviNumeroInRubrica(Map<String, String> rubrica) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il nome che vuoi eliminare: ");
        String nome = scanner.nextLine();
        if (rubrica.containsKey(nome)) {
            rubrica.remove(nome);
            System.out.println("Contatto rimosso dalla rubrica");
        } else {
            System.out.println("Contatto non presente nella rubrica");
        }
    }

    public static void ricercaNumeroInRubrica(Map<String, String> rubrica) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il numero da cercare: ");
        String numero = scanner.nextLine();

        for (Map.Entry<String, String> entry : rubrica.entrySet()) {
            if (entry.getValue().equals(numero)) {
                System.out.println("Il contatto per il numero cercato è quello di " + entry.getKey());
            }
        }


    }

    public static void ricercaNomeInRubrica(Map<String, String> rubrica) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il nome da cercare: ");
        String nome = scanner.nextLine();

        System.out.println("Il numero per il nome cercato è: " + rubrica.get(nome));
    }


    public static void stampaRubrica(Map<String, String> rubrica) {

        for (Map.Entry<String, String> entry : rubrica.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

}


