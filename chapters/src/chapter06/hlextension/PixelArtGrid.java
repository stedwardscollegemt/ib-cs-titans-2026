package chapter06.hlextension;

import javax.swing.*;
import java.awt.*;

public class PixelArtGrid extends JFrame {
    private final int rows;
    private final int cols;
    private final int cellSize;
    private final Color[][] gridColors;

    public PixelArtGrid(int rows, int cols, int cellSize) {
        this.rows = rows;
        this.cols = cols;
        this.cellSize = cellSize;
        this.gridColors = new Color[rows][cols];

        // Initialize the grid with white color
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                gridColors[i][j] = Color.WHITE;
            }
        }

        // TODO: create your pixel art here by filling in the 2D array with colours!
        this.gridColors[0][0] = Color.RED;

        // Set up the JFrame
        setTitle("Pixel Art");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Add a panel for drawing
        add(new DrawingPanel());
        setSize(cols * cellSize, rows * cellSize);
    }

    private class DrawingPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            // Draw the grid with the current colors
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    g.setColor(gridColors[i][j]);
                    g.fillRect(j * cellSize, i * cellSize, cellSize, cellSize);
                    g.setColor(Color.BLACK);
                    g.drawRect(j * cellSize, i * cellSize, cellSize, cellSize);
                }
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PixelArtGrid pixelArtGrid = new PixelArtGrid(15, 15, 30);
            pixelArtGrid.setVisible(true);
        });
    }
}
