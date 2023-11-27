package app;

import javax.swing.*;
import java.awt.*;

public class DrawingApp extends JFrame {
    public DrawingApp(String title) throws HeadlessException {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(450, 450);
        GeometricDrawer gd = new GeometricDrawer();
        this.add(gd);
        this.setVisible(true);
    }
}
