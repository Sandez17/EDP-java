package porbyest;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.JFrame;

public class PorbyEst {

    public static void main(String[] args) {
        int[] docentes = {18, 19, 17, 20, 18,
            22, 19, 16, 21, 18,
            24, 19, 17, 21, 18,
            15, 19, 22, 18, 21,
            16, 19, 22, 18, 21,
            16, 19, 24, 18, 21,
            18};

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

        //-----------------------------------------------------------------
        JFrame ventanaBivariado = new JFrame("Bivariado: Docentes vs No docentes");
        ventanaBivariado.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaBivariado.add(new GraficoBivariado());
        ventanaBivariado.setSize(700, 500);
        ventanaBivariado.setLocationRelativeTo(null);
        ventanaBivariado.setVisible(true);

        JFrame ventanaLineas = new JFrame("Horario vs Flujo");
        ventanaLineas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaLineas.add(new GraficoLineas());
        ventanaLineas.setSize(800, 500);
        ventanaLineas.setLocationRelativeTo(null);
        ventanaLineas.setVisible(true);

    }
}
