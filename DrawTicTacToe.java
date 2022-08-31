import java.awt.*;
import javax.swing.*;

public class DrawTicTacToe extends Canvas
{
    public int xRow, xCol;
    public int oRow, oCol;

    public void paint(Graphics g)
    {
        g.drawLine(150, 50, 150, 350);
        g.drawLine(250, 50, 250, 350);
        g.drawLine(50, 150, 350, 150);
        g.drawLine(50, 250, 350, 250);

        if (xRow == 0) {
            if (xCol == 0) {
                g.setColor(Color.RED);
                g.drawLine(135, 65, 65, 135);
                g.drawLine(65, 65, 135, 135);
            }
            if (xCol == 1) {
                g.setColor(Color.RED);
                g.drawLine(235, 65, 165, 135);
                g.drawLine(165, 65, 235, 135);
            }
            if (xCol == 2) {
                g.setColor(Color.RED);
                g.drawLine(335, 65, 265, 135);
                g.drawLine(265, 65, 335, 135);
            }
        }
        if (xRow == 1) {
            if (xCol == 0) {
                g.setColor(Color.RED);
                g.drawLine(135, 165, 65, 235);
                g.drawLine(65, 165, 135, 235);
            }
            if (xCol == 1) {
                g.setColor(Color.RED);
                g.drawLine(235, 165, 165, 235);
                g.drawLine(165, 165, 235, 235);
            }
            if (xCol == 2) {
                g.setColor(Color.RED);
                g.drawLine(335, 165, 265, 235);
                g.drawLine(265, 165, 335, 235);
            }
        }
        if (xRow == 2) {
            if (xCol == 0) {
                g.setColor(Color.RED);
                g.drawLine(135, 265, 65, 335);
                g.drawLine(65, 265, 135, 335);
            }
            if (xCol == 1) {
                g.setColor(Color.RED);
                g.drawLine(235, 265,165, 335);
                g.drawLine(165, 265, 235, 335);
            }
            if (xCol == 2) {
                g.setColor(Color.RED);
                g.drawLine(335, 265,265, 335);
                g.drawLine(265, 265, 335, 335);
            }
        }

        int diameter = 70;
        
        if (oRow == 0) {
            if (oCol == 0) {
                g.setColor(Color.BLUE);
                g.drawOval(65, 65, diameter, diameter);
            }
            if (oCol == 1) {
                g.setColor(Color.BLUE);
                g.drawOval(165, 65, diameter, diameter);
            }
            if (oCol == 2) {
                g.setColor(Color.BLUE);
                g.drawOval(265, 65, diameter, diameter);
            }
        }
        if (oRow == 1) {
            if (oCol == 0) {
                g.setColor(Color.BLUE);
                g.drawOval(65, 165, diameter, diameter);
            }
            if (oCol == 1) {
                g.setColor(Color.BLUE);
                g.drawOval(165, 165, diameter, diameter);
            }
            if (oCol == 2) {
                g.setColor(Color.BLUE);
                g.drawOval(265, 165, diameter, diameter);
            }
        }
        if (oRow == 2) {
            if (oCol == 0) {
                g.setColor(Color.BLUE);
                g.drawOval(65, 265, diameter, diameter);
            }
            if (oCol == 1) {
                g.setColor(Color.BLUE);
                g.drawOval(165, 265, diameter, diameter);
            }
            if (oCol == 2) {
                g.setColor(Color.BLUE);
                g.drawOval(265, 265, diameter, diameter);
            }
        }
    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DrawTicTacToe drawing = new DrawTicTacToe();
        drawing.xRow = Integer.parseInt(args[0]);
        drawing.xCol = Integer.parseInt(args[1]);
        drawing.oRow = Integer.parseInt(args[2]);
        drawing.oCol = Integer.parseInt(args[3]);
        drawing.setSize(400, 400);
        frame.add(drawing);
        frame.pack();
        frame.setVisible(true);
    }
}