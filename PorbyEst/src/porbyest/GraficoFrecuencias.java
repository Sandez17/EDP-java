package porbyest;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.Map;
import javax.swing.JPanel;

public class GraficoFrecuencias extends JPanel {

    private Map<Integer, Integer> frecuencias;
    private double media;
    private double mediana;

    public GraficoFrecuencias(
            Map<Integer, Integer> frecuencias,
            double media,
            double mediana) {

        this.frecuencias = frecuencias;
        this.media = media;
        this.mediana = mediana;
    }

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        g2.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        int anchoBarra = 50;
        int espacio = 20;

        int margenIzq = 80;
        int margenInf = 80;

        int baseY = getHeight() - margenInf;

        // Fondo
        g2.setColor(Color.WHITE);
        g2.fillRect(0, 0, getWidth(), getHeight());

        // Título
        g2.setColor(Color.BLACK);
        g2.setFont(new Font("Arial", Font.BOLD, 18));

        g2.drawString(
                "Histograma de No Docentes Presentes",
                150,
                30);

        // Cuadrícula horizontal
        g2.setColor(new Color(220, 220, 220));

        for (int i = 0; i <= 8; i++) {

            int y = baseY - i * 25;

            g2.drawLine(
                    margenIzq,
                    y,
                    getWidth() - 40,
                    y);

            g2.setColor(Color.BLACK);
            g2.drawString(
                    String.valueOf(i),
                    margenIzq - 25,
                    y + 5);

            g2.setColor(new Color(220, 220, 220));
        }

        // Ejes
        g2.setColor(Color.BLACK);

        g2.drawLine(
                margenIzq,
                50,
                margenIzq,
                baseY);

        g2.drawLine(
                margenIzq,
                baseY,
                getWidth() - 40,
                baseY);

        // Barras
        int x = margenIzq + 20;

        for (Map.Entry<Integer, Integer> entry : frecuencias.entrySet()) {

            int valor = entry.getKey();
            int frecuencia = entry.getValue();

            int altura = frecuencia * 25;

            // Barra azul
            g2.setColor(new Color(70, 130, 180));

            g2.fillRect(
                    x,
                    baseY - altura,
                    anchoBarra,
                    altura);

            // Borde negro
            g2.setColor(Color.BLACK);

            g2.drawRect(
                    x,
                    baseY - altura,
                    anchoBarra,
                    altura);

            // Frecuencia
            g2.drawString(
                    String.valueOf(frecuencia),
                    x + 18,
                    baseY - altura - 5);

            // Etiqueta eje X
            g2.drawString(
                    String.valueOf(valor),
                    x + 15,
                    baseY + 20);

            x += anchoBarra + espacio;
        }

        // ===== MEDIA =====
        int primerValor = frecuencias.keySet()
                .stream()
                .min(Integer::compareTo)
                .get();

        int inicioX = margenIzq + 20 + anchoBarra / 2;

        int paso = anchoBarra + espacio;

        double posicionMedia
                = inicioX
                + (media - primerValor) * paso;

        g2.setColor(Color.RED);

        g2.drawLine(
                (int) posicionMedia,
                50,
                (int) posicionMedia,
                baseY);

        g2.drawString(
                String.format("Media %.2f", media),
                (int) posicionMedia + 5,
                60);

        // ===== MEDIANA =====
        double posicionMediana
                = inicioX
                + (mediana - primerValor) * paso;

        g2.setColor(new Color(0, 150, 0));

        g2.drawLine(
                (int) posicionMediana,
                50,
                (int) posicionMediana,
                baseY);

        g2.drawString(
                String.format("Mediana %.0f", mediana),
                (int) posicionMediana + 5,
                80);

        // Etiquetas de ejes
        g2.setColor(Color.BLACK);

        g2.drawString(
                "Cantidad de no docentes",
                getWidth() / 2 - 60,
                getHeight() - 20);

        g2.drawString(
                "Frecuencia",
                10,
                45);
    }
}
