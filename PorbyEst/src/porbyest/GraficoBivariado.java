package porbyest;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

public class GraficoBivariado extends JPanel {

    // Categorías del eje X (niveles de personal)
    private String[] categorias = {
        "Doc. bajo (75-77)",
        "Doc. medio (78-79)",
        "Doc. alto (80-82)"
    };

    // Porcentajes por fila: cada fila es una categoría de personal
    // columnas: AC bajo (15-17), AC medio (18-20), AC alto (21-24)
    private double[][] porcentajes = {
        {66.7, 33.3, 0.0}, // Docentes bajo
        {28.6, 57.1, 14.3}, // Docentes medio
        {9.1, 63.6, 27.3}
    };

    private String[] leyenda = {
        "No doc. bajo (36-38)",
        "No doc. medio (39-40)",
        "No doc. alto (41-42)"
    };

    private Color[] colores = {
        new Color(42, 120, 214), // azul
        new Color(27, 175, 122), // verde
        new Color(237, 161, 0) // amarillo
    };

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        int margenIzq = 80;
        int margenInf = 100;
        int margenSup = 60;
        int anchoBarra = 100;
        int espacio = 60;

        int baseY = getHeight() - margenInf;
        int alturaMax = baseY - margenSup;

        // Fondo
        g2.setColor(Color.WHITE);
        g2.fillRect(0, 0, getWidth(), getHeight());

        // Título
        g2.setColor(Color.BLACK);
        g2.setFont(new Font("Arial", Font.BOLD, 16));
        g2.drawString(
                "Docentes vs No Docentes",
                margenIzq,
                35);

        // Cuadrícula y eje Y (0% a 100%)
        g2.setFont(new Font("Arial", Font.PLAIN, 11));
        for (int i = 0; i <= 10; i++) {
            int y = baseY - (alturaMax * i / 10);
            g2.setColor(new Color(220, 220, 220));
            g2.drawLine(margenIzq, y, getWidth() - 40, y);
            g2.setColor(Color.BLACK);
            g2.drawString(i * 10 + "%", margenIzq - 40, y + 5);
        }

        // Ejes
        g2.setColor(Color.BLACK);
        g2.drawLine(margenIzq, margenSup, margenIzq, baseY);
        g2.drawLine(margenIzq, baseY, getWidth() - 40, baseY);

        // Barras apiladas
        int x = margenIzq + 40;

        for (int i = 0; i < categorias.length; i++) {

            int yActual = baseY;

            for (int j = 0; j < 3; j++) {

                int altura = (int) (alturaMax * porcentajes[i][j] / 100.0);

                g2.setColor(colores[j]);
                g2.fillRect(x, yActual - altura, anchoBarra, altura);

                g2.setColor(Color.BLACK);
                g2.drawRect(x, yActual - altura, anchoBarra, altura);

                // Porcentaje dentro de la barra (solo si es visible)
                if (porcentajes[i][j] >= 5.0) {
                    g2.setColor(Color.WHITE);
                    g2.setFont(new Font("Arial", Font.BOLD, 11));
                    g2.drawString(
                            String.format("%.1f%%", porcentajes[i][j]),
                            x + 25,
                            yActual - altura / 2 + 5);
                }

                yActual -= altura;
            }

            // Etiqueta eje X
            g2.setColor(Color.BLACK);
            g2.setFont(new Font("Arial", Font.PLAIN, 11));
            g2.drawString(categorias[i], x + 5, baseY + 20);

            x += anchoBarra + espacio;
        }

        // Leyenda
        int leyX = margenIzq + 40;
        int leyY = getHeight() - 25;
        for (int j = 0; j < leyenda.length; j++) {
            g2.setColor(colores[j]);
            g2.fillRect(leyX, leyY - 12, 14, 14);
            g2.setColor(Color.BLACK);
            g2.drawRect(leyX, leyY - 12, 14, 14);
            g2.drawString(leyenda[j], leyX + 18, leyY);
            leyX += 160;
        }

        // Etiqueta eje Y
        g2.drawString("Porcentaje (%)", 5, margenSup - 20);
    }
}
