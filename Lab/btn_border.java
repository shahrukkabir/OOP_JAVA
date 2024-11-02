// Write a Java program that adds five buttons into a frame using Border Layout and set different colors for each button.

import javax.swing.*;
import java.awt.*;

public class ColoredButtons {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Colored Buttons with Border Layout");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Create buttons with different colors
        JButton northButton = new JButton("North");
        northButton.setBackground(Color.RED);

        JButton southButton = new JButton("South");
        southButton.setBackground(Color.GREEN);

        JButton eastButton = new JButton("East");
        eastButton.setBackground(Color.BLUE);

        JButton westButton = new JButton("West");
        westButton.setBackground(Color.YELLOW);

        JButton centerButton = new JButton("Center");
        centerButton.setBackground(Color.ORANGE);

        // Add buttons to frame using BorderLayout positions
        frame.add(northButton, BorderLayout.NORTH);
        frame.add(southButton, BorderLayout.SOUTH);
        frame.add(eastButton, BorderLayout.EAST);
        frame.add(westButton, BorderLayout.WEST);
        frame.add(centerButton, BorderLayout.CENTER);

        // Set the frame visibility to true
        frame.setVisible(true);
    }
}
