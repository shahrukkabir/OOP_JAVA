// Write a Java program that uses two buttons to enlarge or shrink a: Circle, Rectangle, String message.

// Import required packages
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ShapeResizer extends JFrame {
    private int size = 50;
    private String shapeType = "Circle";

    public ShapeResizer() {
        setTitle("Shape Resizer");
        setSize(300, 300);
        setLayout(new FlowLayout());

        JButton enlargeButton = new JButton("Enlarge");
        JButton shrinkButton = new JButton("Shrink");

        enlargeButton.addActionListener(e -> {
            size += 10;
            repaint();
        });

        shrinkButton.addActionListener(e -> {
            size -= 10;
            if (size < 10) size = 10;
            repaint();
        });

        add(enlargeButton);
        add(shrinkButton);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLUE);
        if ("Circle".equals(shapeType)) {
            g.fillOval(100, 100, size, size);
        } else if ("Rectangle".equals(shapeType)) {
            g.fillRect(100, 100, size, size);
        }
        g.drawString("Shape: " + shapeType, 100, 50);
    }

    public static void main(String[] args) {
        ShapeResizer frame = new ShapeResizer();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
