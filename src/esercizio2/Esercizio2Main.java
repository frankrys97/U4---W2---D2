package esercizio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Esercizio2Main {
    public static void main(String[] args) {


        invertiOrdineLista(generaListaNumeriCasuali(10));

        stampaValoriPari(generaListaNumeriCasuali(10), true);
        stampaValoriPari(generaListaNumeriCasuali(10), false);


        stampaValoriPari(invertiOrdineLista(generaListaNumeriCasuali(10)), true);
        stampaValoriPari(invertiOrdineLista(generaListaNumeriCasuali(10)), false);


    }

    public static List<Integer> generaListaNumeriCasuali(int N) {
        Random random = new Random();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(random.nextInt(0, 100));
        }
        Collections.sort(list);
        System.out.println(list);
        return list;
    }

    public static List<Integer> invertiOrdineLista(List<Integer> list) {
        List<Integer> listInvertita = new ArrayList<>(list);
        Collections.reverse(listInvertita);
        List<Integer> nuovalista = new ArrayList<>(list);
        nuovalista.addAll(listInvertita);
        System.out.println(nuovalista);
        return nuovalista;
    }

    public static void stampaValoriPari(List<Integer> list, boolean b) {
        if (b) {
            for (int i = 0; i < list.size(); i++) {
                if (i % 2 == 0) {
                    System.out.println(list.get(i));
                }
            }
        } else {
            for (int i = 0; i < list.size(); i++) {
                if (i % 2 != 0) {
                    System.out.println(list.get(i));
                }
            }
        }
    }
}
