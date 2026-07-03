package porbyest;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

public class GraficoLineas extends JPanel {

    private String[] horarios = {
        "07-08", "08-09", "09-10", "10-11", "11-12",
        "12-13", "13-14", "14-15", "15-16", "16-17", "17-18"
    };

    private int[] personas = {
        95, 118, 121, 119, 117, 110, 55, 70, 72, 68, 64
    };

    private Color colorManana = new Color(42, 120, 214);  // azul
    private Color colorTarde = new Color(237, 161, 0);    // amarillo

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        int margenIzq = 80;
        int margenInf = 80;
        int margenSup = 60;
        int baseY = getHeight() - margenInf;
        int alturaMax = baseY - margenSup;
        int anchoGrafico = getWidth() - margenIzq - 40;
        int n = horarios.length;
        int pasoX = anchoGrafico / (n - 1);
        int valorMax = 140;

        // Fondo
        g2.setColor(Color.WHITE);
        g2.fillRect(0, 0, getWidth(), getHeight());

        // Título
        g2.setColor(Color.BLACK);
        g2.setFont(new Font("Arial", Font.BOLD, 16));
        g2.drawString("Horario vs Flujo de Personas", margenIzq, 35);

        // Cuadrícula y eje Y
        g2.setFont(new Font("Arial", Font.PLAIN, 11));
        for (int i = 0; i <= 7; i++) {
            int valor = i * 20;
            int y = baseY - (int) ((double) valor / valorMax * alturaMax);
            g2.setColor(new Color(220, 220, 220));
            g2.drawLine(margenIzq, y, getWidth() - 40, y);
            g2.setColor(Color.BLACK);
            g2.drawString(String.valueOf(valor), margenIzq - 35, y + 5);
        }

        // Ejes
        g2.setColor(Color.BLACK);
        g2.drawLine(margenIzq, margenSup, margenIzq, baseY);
        g2.drawLine(margenIzq, baseY, getWidth() - 40, baseY);

        // Etiquetas eje X
        for (int i = 0; i < n; i++) {
            int x = margenIzq + i * pasoX;
            g2.setColor(Color.BLACK);
            g2.setFont(new Font("Arial", Font.PLAIN, 10));
            g2.drawString(horarios[i], x - 15, baseY + 20);
        }

        // Línea mañana (07-13h, índices 0 a 5)
        g2.setColor(colorManana);
        g2.setStroke(new BasicStroke(2.5f));
        for (int i = 0; i < 5; i++) {
            int x1 = margenIzq + i * pasoX;
            int y1 = baseY - (int) ((double) personas[i] / valorMax * alturaMax);
            int x2 = margenIzq + (i + 1) * pasoX;
            int y2 = baseY - (int) ((double) personas[i + 1] / valorMax * alturaMax);
            g2.drawLine(x1, y1, x2, y2);
        }

        // Línea tarde (13-18h, índices 6 a 10)
        g2.setColor(colorTarde);
        for (int i = 6; i < n - 1; i++) {
            int x1 = margenIzq + i * pasoX;
            int y1 = baseY - (int) ((double) personas[i] / valorMax * alturaMax);
            int x2 = margenIzq + (i + 1) * pasoX;
            int y2 = baseY - (int) ((double) personas[i + 1] / valorMax * alturaMax);
            g2.drawLine(x1, y1, x2, y2);
        }

        // Puntos y etiquetas de valor
        g2.setStroke(new BasicStroke(1f));
        for (int i = 0; i < n; i++) {
            int x = margenIzq + i * pasoX;
            int y = baseY - (int) ((double) personas[i] / valorMax * alturaMax);

            // Color según turno
            if (i <= 5) {
                g2.setColor(colorManana);
            } else {
                g2.setColor(colorTarde);
            }

            // Punto
            g2.fillOval(x - 5, y - 5, 10, 10);
            g2.setColor(Color.BLACK);
            g2.drawOval(x - 5, y - 5, 10, 10);

            // Valor encima del punto
            g2.setFont(new Font("Arial", Font.BOLD, 10));
            g2.drawString(String.valueOf(personas[i]), x - 8, y - 10);
        }

        // Leyenda
        g2.setFont(new Font("Arial", Font.PLAIN, 12));
        g2.setColor(colorManana);
        g2.fillRect(margenIzq, getHeight() - 30, 14, 14);
        g2.setColor(Color.BLACK);
        g2.drawString("Turno mañana (07-13h)", margenIzq + 18, getHeight() - 19);

        g2.setColor(colorTarde);
        g2.fillRect(margenIzq + 220, getHeight() - 30, 14, 14);
        g2.setColor(Color.BLACK);
        g2.drawString("Turno tarde (13-18h)", margenIzq + 238, getHeight() - 19);

        // Etiquetas ejes
        g2.setFont(new Font("Arial", Font.PLAIN, 11));
        g2.drawString("Personas presentes", 5, margenSup - 10);
        g2.drawString("Horario", getWidth() / 2 - 20, getHeight() - 55);
    }
}
