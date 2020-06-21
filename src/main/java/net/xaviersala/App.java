package net.xaviersala;

import java.util.ArrayList;
import java.util.List;

/**
 * Llista els noms dels combatents
 *
 */
public class App {
    public static void main(final String[] args) {
        final List<String> lluitadors = new ArrayList<>();
        lluitadors.add("Tremendo");
        lluitadors.add("Matxacaboles");
        lluitadors.add("Mataparents");
        lluitadors.add("MartellDeCervells");
        lluitadors.add("Potadelefant");
        lluitadors.add("Furia Salvatge");
        lluitadors.add("Punys de foc");
        lluitadors.add("Arrencaqueixals");
        lluitadors.add("Trencarroques");
        lluitadors.add("Fabrica de sopes");
        lluitadors.add("Trinxador");
        lluitadors.add("Enmascarat");

        for (int i = 1; i < lluitadors.size(); i++) {
            System.out.println(lluitadors.get(i));
        }

        System.out.println("---------------");
    }
}
