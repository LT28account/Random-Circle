package controller; 

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import model.Circle;
import view.CircleDrawingPanel;

public class CircleEventListener implements ActionListener, MouseListener {
    private CircleDrawingPanel panel;
    private Color color = Color.white;
    private Circle circle;

    public CircleEventListener(CircleDrawingPanel panel) {
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object sourse = e.getSource();
        if (sourse == panel.getExitButton()) {
            System.exit(0);
        } else if (sourse == panel.getClearButton()) {
            panel.getCanvas().getCircles().clear();
            panel.getCanvas().repaint();
        } else if (sourse == panel.getBlueButton()) {
            color = Color.blue;
        } else if (sourse == panel.getGreenButton()) {
            color = Color.green;
        } else if (sourse == panel.getGreyButton()) {
            color = Color.gray;
        } else if (sourse == panel.getOrangeButton()) {
            color = Color.orange;
        } else if (sourse == panel.getRedButton()) {
            color = Color.red;
        } else if (sourse == panel.getYellowButton()) {
            color = Color.yellow;
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        circle = new Circle();
        circle.setPos(0, e.getX(), e.getY());
        circle.setColor(color);
        panel.getCanvas().getCircles().add(circle);
        panel.getCanvas().repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
