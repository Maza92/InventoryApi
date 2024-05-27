/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jackson.imp;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;
import java.awt.*;

public class NewClass extends JFrame {

    public NewClass(String title) {
        super(title);

        // Crear la serie de datos
        XYSeries series = new XYSeries("Inventario");
        series.add(10, 500); // Ejemplo: 10 unidades, $500
        series.add(15, 300); // Ejemplo: 15 unidades, $300
        series.add(20, 800); // Ejemplo: 20 unidades, $800
        // Añadir más datos según sea necesario

        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);

        // Crear el gráfico
        JFreeChart chart = ChartFactory.createScatterPlot(
                "Cantidad en Inventario vs Precio",
                "Cantidad en Inventario", "Precio",
                dataset,
                PlotOrientation.VERTICAL,
                true, true, false);

        // Personalizar el gráfico
        XYPlot plot = (XYPlot) chart.getPlot();
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        renderer.setSeriesLinesVisible(0, false);
        renderer.setSeriesShapesVisible(0, true);
        plot.setRenderer(renderer);

        // Mostrar el gráfico en un panel
        ChartPanel panel = new ChartPanel(chart);
        panel.setPreferredSize(new Dimension(800, 600));
        setContentPane(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            NewClass example = new NewClass("Gráfico de Dispersión de Inventario");
            example.setSize(800, 600);
            example.setLocationRelativeTo(null);
            example.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            example.setVisible(true);
        });
    }
}

