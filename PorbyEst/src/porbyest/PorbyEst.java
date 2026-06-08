package porbyest;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.JFrame;

public class PorbyEst {

    public static void main(String[] args) {
        int[] docentes = {39, 38, 40, 39, 39,
            41, 38, 37, 40, 39,
            42, 39, 38, 40, 39,
            36, 39, 41, 38, 40,
            37, 39, 41, 39, 40,
            37, 39, 42, 38, 40};

        Map<Integer, Integer> frecuencia = new TreeMap<>();

        for (int dato : docentes) {
            frecuencia.put(dato,
                    frecuencia.getOrDefault(dato, 0) + 1);
        }

        int acumulada = 0;
        int n = docentes.length;

        System.out.println("Xi\tFi\tFiAc\tHi\t\tHi%");

        for (Map.Entry<Integer, Integer> e : frecuencia.entrySet()) {

            acumulada += e.getValue();

            double relativa = (double) e.getValue() / n;

            System.out.printf(
                    "%d\t%d\t%d\t%.4f\t%.2f%%\n",
                    e.getKey(),
                    e.getValue(),
                    acumulada,
                    relativa,
                    relativa * 100
            );
        }
        // Media 
        double suma = 0;

        for (int dato : docentes) {
            suma += dato;
        }

        double media = suma / docentes.length;

        System.out.println("\nMedia = " + media);

        // Mediana 
        Arrays.sort(docentes);

        double mediana;

        if (docentes.length % 2 == 0) {
            mediana
                    = (docentes[docentes.length / 2]
                    + docentes[docentes.length / 2 - 1]) / 2.0;
        } else {
            mediana = docentes[docentes.length / 2];
        }

        System.out.println("Mediana = " + mediana);

        // Moda
        int moda = 0;
        int maxFrecuencia = 0;

        for (Map.Entry<Integer, Integer> e : frecuencia.entrySet()) {

            if (e.getValue() > maxFrecuencia) {
                maxFrecuencia = e.getValue();
                moda = e.getKey();
            }
        }

        System.out.println("Moda = " + moda);

        //Histograma textual
        System.out.println("\nHISTOGRAMA");

        for (Map.Entry<Integer, Integer> e : frecuencia.entrySet()) {

            System.out.print(e.getKey() + " | ");

            for (int i = 0; i < e.getValue(); i++) {
                System.out.print("*");
            }

            System.out.println();
        }

        JFrame ventana = new JFrame(
                "Análisis Estadístico");

        ventana.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);

        ventana.add(
                new GraficoFrecuencias(
                        frecuencia,
                        media,
                        mediana));

        ventana.setSize(800, 500);

        ventana.setLocationRelativeTo(null);

        ventana.setVisible(true);
    }
}
