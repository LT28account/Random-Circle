package view; 

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;

import controller.CircleEventListener;

import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.GridLayout;

public class CircleDrawingPanel {
    private JFrame window;
    private CircleCanvas canvas;
    private JRadioButton blueButton = new JRadioButton("Blue");
    private JRadioButton greenButton = new JRadioButton("Green");
    private JRadioButton greyButton = new JRadioButton("Grey");
    private JRadioButton orangeButton = new JRadioButton("Orange");
    private JRadioButton redButton = new JRadioButton("Red");
    private JRadioButton yellowButton = new JRadioButton("Yellow");
    private JButton clearButton = new JButton("Clear");
    private JButton exitButton = new JButton("Exit");

    public CircleDrawingPanel(JFrame window) {
        this.window = window;
    }

    public void init() {
        Container cp = window.getContentPane();

        JPanel southPanel = new JPanel();
        cp.add(BorderLayout.SOUTH, southPanel);

        southPanel.setLayout(new GridLayout(2, 1));
        JPanel radioPanel = new JPanel();
        radioPanel.add(blueButton);
        radioPanel.add(greenButton);
        radioPanel.add(greyButton);
        radioPanel.add(orangeButton);
        radioPanel.add(redButton);
        radioPanel.add(yellowButton);
        southPanel.add(radioPanel);

        // radio group
        ButtonGroup colorGroup = new ButtonGroup();
        colorGroup.add(blueButton);
        colorGroup.add(greenButton);
        colorGroup.add(greyButton);
        colorGroup.add(orangeButton);
        colorGroup.add(redButton);
        colorGroup.add(yellowButton);

        // titled border for radio
        TitledBorder title = BorderFactory.createTitledBorder("Color");
        radioPanel.setBorder(title);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(clearButton);
        buttonPanel.add(exitButton);
        southPanel.add(buttonPanel);

        canvas = new CircleCanvas(this);
        cp.add(BorderLayout.CENTER, canvas);

        // attach event listener
        CircleEventListener listener = new CircleEventListener(this);
        exitButton.addActionListener(listener);
        clearButton.addActionListener(listener);
        blueButton.addActionListener(listener);
        greenButton.addActionListener(listener);
        greyButton.addActionListener(listener);
        orangeButton.addActionListener(listener);
        redButton.addActionListener(listener);
        yellowButton.addActionListener(listener);
        canvas.addMouseListener(listener);
    }

    public JButton getExitButton() {
        return exitButton;
    }

    public JButton getClearButton() {
        return clearButton;
    }

    public JRadioButton getBlueButton() {
        return blueButton;
    }

    public JRadioButton getGreenButton() {
        return greenButton;
    }

    public JRadioButton getGreyButton() {
        return greyButton;
    }

    public JRadioButton getOrangeButton() {
        return orangeButton;
    }

    public JRadioButton getRedButton() {
        return redButton;
    }

    public JRadioButton getYellowButton() {
        return yellowButton;
    }

    public JFrame getWindow() {
        return window;
    }

    public CircleCanvas getCanvas() {
        return canvas;
    }
}
