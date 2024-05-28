package esercizio1;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Esercizio1Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il numero di parole da inserire: ");
        int N = Integer.parseInt(scanner.nextLine());


        Set<String> parole = new HashSet<>();
        List<String> paroleDuplicate = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            System.out.println("Inserisci una parola: ");
            String parola = scanner.nextLine();
            if (!parole.contains(parola)) {
                parole.add(parola);
            } else {
                paroleDuplicate.add(parola);
            }

        }

        System.out.println("Le parole duplicate sono:");
        for (String parola : paroleDuplicate) {
            System.out.println(parola);
        }

        System.out.println();

        System.out.println("Il numero di parole distinte è: " + parole.size());

        System.out.println();

        for (String parola : parole) {
            System.out.println(parola);
        }
    }
}