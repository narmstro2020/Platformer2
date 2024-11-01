package main;

import inputs.KeyboardInputs;
import inputs.MouseInputs;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    private int xDelta = 100;
    private int yDelta = 100;
    private MouseInputs mouseInputs;

    public GamePanel() {
        mouseInputs = new MouseInputs(this);
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
        addKeyListener(new KeyboardInputs(this));
    }

    public void changeXDelta(int value){
        xDelta += value;
        repaint();
    }

    public void changeYDelta(int value){
        yDelta += value;
        repaint();
    }

    public void setRectPos(int x, int y){
        xDelta += x;
        yDelta += y;
        repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillRect(xDelta,  yDelta, 200, 50);

    }
}
