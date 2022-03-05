package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JPanel;

import model.Circle;

public class CircleCanvas extends JPanel {
    private CircleDrawingPanel panel; 
    private ArrayList<Circle> circles = new ArrayList<>();

    public CircleCanvas(CircleDrawingPanel panel) {
        this.panel = panel;
        setPreferredSize(new Dimension(500, 500));
        setBackground(Color.DARK_GRAY);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        for (var c : circles) {
            c.render(g2);
        }
    }

    public ArrayList<Circle> getCircles() {
        return circles;
    }

}
