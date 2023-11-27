package app;

import javax.swing.*;
import java.awt.*;

public class GeometricDrawer extends JPanel {
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Plano de fundo:
        this.setBackground(Color.decode("#36395e"));

        // Cabeça:
        fillPolygon(g,  // Formato do rosto:
                new int[]{
                        168,168,156,156,150,150,144,144,138,
                        138,132,132,126,126,120,120,114,114,
                        108,108,102,102,108,108,114,114,126,
                        126,132,132,144,144,138,138,132,132,
                        138,138,144,144,150,150,162,162,180,
                        180,228,228,240,240,246,246,252,252,
                        258,258,252,252,246,246,258,258,264,
                        264,276,276,282,282,288,288,282,282,
                        276,276,270,270,264,264,270,270,264,
                        264,258,258,252,252,240,240
                },
                new int[]{
                        198,192,192,186,186,180,180,168,168,
                        156,156,114,114,108,108,102,102, 96,
                        96, 84, 84, 42, 42, 30, 30, 24, 24,
                        30, 30, 24, 24, 36, 36, 42, 42, 72,
                        72, 78, 78, 84, 84, 78, 78, 72, 72,
                        66, 66, 72, 72, 78, 78, 72, 72, 66,
                        66, 36, 36, 30, 30, 18, 18, 24, 24,
                        18, 18, 24, 24, 36, 36, 78, 78, 90,
                        90, 96, 96,102,102,108,108,168,168,
                        180,180,186,186,192,192,198
                },
                "#d0e9f3"
        );

        // Olho esquerdo:
        fillRect(g, 168, 102, 186, 162, "#04001c");
        fillRect(g, 162, 108, 192, 156, "#04001c");
        fillRect(g, 156, 114, 198, 150, "#04001c");

        // Olho direito:
        fillRect(g, 234, 102, 252, 156, "#04001c");
        fillRect(g, 228, 108, 258, 144, "#04001c");
        fillRect(g, 234, 120, 264, 150, "#04001c");
        fillRect(g, 240, 102, 252, 162, "#04001c");
        fillRect(g, 234, 108, 258, 156, "#04001c");

        // Corpo:
        fillRect(g, 192, 186, 216, 192, "#04001c");
        fillRect(g, 180, 192, 228, 198, "#04001c");
        fillRect(g, 168, 198, 228, 204, "#04001c");
        fillRect(g, 156, 204, 234, 306, "#04001c");
        fillRect(g, 156, 204, 180, 312, "#04001c");
        fillRect(g, 156, 270, 174, 318, "#04001c");
        fillRect(g, 138, 204, 168, 228, "#04001c");

        // Perna esquerda:
        fillRect(g, 256, 270, 174, 318, "#04001c");
        fillRect(g, 150, 282, 168, 324, "#04001c");
        fillRect(g, 144, 294, 162, 330, "#04001c");
        fillRect(g, 138, 312, 156, 336, "#04001c");
        fillRect(g, 132, 330, 150, 342, "#04001c");
        fillRect(g, 126, 342, 144, 348, "#04001c");
        fillRect(g, 126, 348, 138, 354, "#04001c");

        // Perna direita:
        fillRect(g, 228, 282, 240, 354, "#04001c");
        fillRect(g, 210, 306, 246, 312, "#04001c");
        fillRect(g, 216, 312, 246, 324, "#04001c");
        fillRect(g, 222, 324, 246, 336, "#04001c");
        fillRect(g, 228, 336, 246, 342, "#04001c");

        // Braço:
        fillRect(g, 234, 210, 240, 252, "#04001c");
        fillRect(g, 240, 216, 246, 258, "#04001c");
        fillRect(g, 246, 222, 258, 264, "#04001c");
        fillRect(g, 252, 252, 264, 270, "#04001c");

        // Capa (lado esquerdo):
        fillRect(g, 198, 204, 210, 222, "#10024c");
        fillRect(g, 198, 222, 204, 234, "#10024c");
        fillRect(g, 286, 228, 192, 240, "#10024c");
        fillRect(g, 180, 240, 186, 252, "#10024c");
        fillRect(g, 162, 240, 168, 258, "#10024c");
        fillRect(g, 150, 240, 156, 252, "#10024c");
        fillRect(g, 144, 252, 150 ,258, "#10024c");
        fillRect(g, 186, 210, 192, 216, "#10024c");
        fillRect(g, 168, 216, 192, 222, "#10024c");
        fillRect(g, 156, 222, 186, 228, "#10024c");
        fillRect(g, 150, 228, 180, 234, "#10024c");
        fillRect(g, 186, 228, 192, 240, "#10024c");
        fillRect(g, 192, 192, 198, 198, "#10024c");
        fillRect(g, 180, 198, 192, 204, "#10024c");
        fillRect(g, 168, 204, 186, 210, "#10024c");
        fillRect(g, 156, 210, 168, 216, "#10024c");
        fillRect(g, 144, 204, 156, 210, "#10024c");
        fillRect(g, 126, 210, 138, 216, "#10024c");
        fillRect(g, 102, 216, 156, 222, "#10024c");
        fillRect(g, 144, 222, 150, 228, "#10024c");
        fillRect(g, 138, 228, 144, 234, "#10024c");
        fillRect(g, 132, 234, 138, 246, "#10024c");
        fillRect(g, 126, 246, 132, 252, "#10024c");
        fillRect(g, 120, 222, 132, 228, "#10024c");
        fillRect(g, 114, 228, 126, 234, "#10024c");

        // Capa (lado direito):
        fillRect(g, 204, 192, 216, 204, "#10024c");
        fillRect(g, 216, 198, 222, 210, "#10024c");
        fillRect(g, 222, 204, 228, 222, "#10024c");
        fillRect(g, 228, 216, 234, 228, "#10024c");
        fillRect(g, 234, 210, 240 ,216, "#10024c");
        fillRect(g, 234, 222, 246, 234, "#10024c");
        fillRect(g, 246, 228, 258, 240, "#10024c");
        fillRect(g, 258, 222, 282, 228, "#10024c");
        fillRect(g, 282, 210, 288, 234, "#10024c");
        fillRect(g, 288, 228, 294, 234, "#10024c");

        fillRect(g, 246, 216, 270, 222, "#181d7b");
        fillRect(g, 270, 210, 276, 216, "#181d7b");
        fillRect(g, 276, 192, 282, 210, "#181d7b");
        fillRect(g, 288, 216, 300, 222, "#181d7b");
        fillRect(g, 294, 210, 306, 216, "#181d7b");
        fillRect(g, 300, 204, 306, 210, "#181d7b");
        fillRect(g, 258, 228, 282, 240, "#181d7b");
        fillRect(g, 282, 234, 288, 246, "#181d7b");
        fillRect(g, 288, 240, 294, 252, "#181d7b");

        fillRect(g, 270, 216, 282, 222, "#3a6abf");
        fillRect(g, 276, 210, 282, 216, "#3a6abf");
        fillRect(g, 282, 204, 288, 210, "#3a6abf");
        fillRect(g, 300, 216, 306, 222, "#3a6abf");
        fillRect(g, 288, 222, 300, 228, "#3a6abf");
        fillRect(g, 288, 234, 300, 240, "#3a6abf");
        fillRect(g, 294, 240, 306, 258, "#3a6abf");
        fillRect(g, 258, 240, 282, 246, "#3a6abf");
        fillRect(g, 270, 246, 288, 252, "#3a6abf");
        fillRect(g, 108, 234, 120, 240, "#10024c");
        fillRect(g, 102, 240, 114, 246, "#10024c");
        fillRect(g, 102, 246, 108, 252, "#10024c");
        fillRect(g,  96, 252, 102, 264, "#10024c");
        fillRect(g, 108, 222, 114, 228, "#10024c");
        fillRect(g, 102, 228, 108, 234, "#10024c");
        fillRect(g,  96, 234, 102, 240, "#10024c");
        fillRect(g,  78, 240,  96, 246, "#10024c");
        fillRect(g,  96, 210, 102, 216, "#10024c");
        fillRect(g, 66, 216, 96, 222, "#10024c");
        fillRect(g, 54, 222, 66, 228, "#10024c");
        fillRect(g, 72, 210, 78, 216, "#10024c");
        fillRect(g, 54, 204, 72, 210, "#10024c");
        fillRect(g, 60, 198, 66, 204, "#10024c");
        fillRect(g, 54, 192, 60, 198, "#10024c");
        fillRect(g, 42, 198, 54, 204, "#10024c");
        fillRect(g, 120, 204, 126, 210, "#10024c");
        fillRect(g, 114, 198, 120, 204, "#10024c");
        fillRect(g, 108, 186, 114, 198, "#10024c");
        fillRect(g, 102, 180, 108, 186, "#10024c");

        fillRect(g, 192, 222, 198, 240, "#181d7b");
        fillRect(g, 180, 228, 186, 240, "#181d7b");
        fillRect(g, 138, 234, 180, 240, "#181d7b");
        fillRect(g, 168, 240, 174, 246, "#181d7b");
        fillRect(g, 156, 240, 162, 246, "#181d7b");
        fillRect(g, 144, 228, 150, 234, "#181d7b");
        fillRect(g, 138, 240, 144, 246, "#181d7b");
        fillRect(g, 132, 222, 144, 228, "#181d7b");
        fillRect(g, 126, 228, 138, 234, "#181d7b");
        fillRect(g, 120, 234, 132, 240, "#181d7b");
        fillRect(g, 114, 240, 120 ,246, "#181d7b");
        fillRect(g, 108, 246, 114, 252, "#181d7b");
        fillRect(g, 102, 252, 108, 258, "#181d7b");
        fillRect(g, 114, 222, 120, 228, "#181d7b");
        fillRect(g, 108, 228, 114, 234, "#181d7b");
        fillRect(g, 102, 234, 108, 240, "#181d7b");
        fillRect(g, 72, 246, 90, 252, "#181d7b");
        fillRect(g, 66, 222, 78, 228, "#181d7b");
        fillRect(g, 72, 204, 78, 210, "#181d7b");
        fillRect(g, 78, 210, 84, 216, "#181d7b");
        fillRect(g, 54, 216, 66, 222, "#181d7b");
        fillRect(g,54, 210, 72, 216, "#181d7b");
        fillRect(g, 24, 204, 54, 210, "#181d7b");
        fillRect(g, 54, 198, 60, 204, "#181d7b");
        fillRect(g, 36, 192, 54, 198, "#181d7b");
        fillRect(g, 36, 186, 48, 192, "#181d7b");
        fillRect(g, 36, 180, 42, 186, "#181d7b");
        fillRect(g, 54, 174, 66, 192, "#181d7b");
        fillRect(g, 60, 168, 72, 180, "#181d7b");
        fillRect(g, 72, 168, 78, 174, "#181d7b");
        fillRect(g, 126, 174, 132, 192, "#181d7b");
        fillRect(g, 48, 222, 54, 228, "#181d7b");
        fillRect(g, 36, 228, 60, 234, "#181d7b");
        fillRect(g, 30, 222, 42, 228, "#181d7b");
        fillRect(g, 126, 192, 138, 198, "#181d7b");
        fillRect(g, 1262, 174, 132, 192, "#181d7b");
        fillRect(g, 120, 180, 126, 192, "#181d7b");
        fillRect(g, 114, 174, 120, 186, "#181d7b");
        fillRect(g, 108, 168, 114, 180, "#181d7b");
        fillRect(g, 96, 162, 108, 174, "#181d7b");
        fillRect(g, 90, 156, 96, 168, "#181d7b");
        fillRect(g, 84, 156, 90, 162, "#181d7b");
        fillRect(g, 102, 198, 114, 204, "#181d7b");
        fillRect(g, 90, 192, 108, 198, "#181d7b");
        fillRect(g, 96, 186, 108, 192, "#181d7b");
        fillRect(g, 78, 186, 90, 192, "#181d7b");
        fillRect(g, 78, 180, 84, 186, "#181d7b");
        fillRect(g, 282, 198, 288, 204, "#181d7b");

        fillRect(g, 120, 198, 150, 204, "#3a6abf");
        fillRect(g, 114, 192, 126, 198, "#3a6abf");
        fillRect(g, 114, 186, 120, 192, "#3a6abf");
        fillRect(g, 108, 180, 114, 186, "#3a6abf");
        fillRect(g, 102, 174, 108, 180, "#3a6abf");
        fillRect(g, 114, 210, 126, 216, "#3a6abf");
        fillRect(g, 96, 204, 120, 210, "#3a6abf");
        fillRect(g, 84, 198, 102, 204, "#3a6abf");
        fillRect(g, 84, 192, 90, 198, "#3a6abf");
        fillRect(g, 66, 198, 72, 204, "#3a6abf");
        fillRect(g, 60, 192, 72, 198, "#3a6abf");
        fillRect(g, 18, 210, 54, 216, "#3a6abf");
        fillRect(g, 96, 216, 102, 222, "#3a6abf");
        fillRect(g, 78, 222, 108, 228, "#3a6abf");
        fillRect(g, 60, 228, 102, 234, "#3a6abf");
        fillRect(g, 90, 234, 96, 240, "#3a6abf");
        fillRect(g, 42, 234, 66, 240, "#3a6abf");
        fillRect(g, 30, 228, 36, 234, "#3a6abf");
        fillRect(g, 24, 222, 30, 228, "#3a6abf");
        fillRect(g, 96, 240, 102, 252, "#3a6abf");
        fillRect(g, 90, 246, 96, 258, "#3a6abf");
        fillRect(g, 78, 252, 90, 264, "#3a6abf");
        fillRect(g, 54, 252, 78, 258, "#3a6abf");
        fillRect(g, 120, 240, 132, 246, "#3a6abf");
        fillRect(g, 114, 246, 126, 252, "#3a6abf");
        fillRect(g, 108, 252, 120, 258, "#3a6abf");
        fillRect(g, 102, 258, 114, 264, "#3a6abf");
        fillRect(g, 96, 264, 108, 270, "#3a6abf");
        fillRect(g, 96, 270, 102, 276, "#3a6abf");
        fillRect(g, 144, 240, 150, 246, "#3a6abf");
        fillRect(g, 132, 246, 150, 252, "#3a6abf");
        fillRect(g, 126, 252, 138, 258, "#3a6abf");
        fillRect(g, 156, 246, 162, 258, "#3a6abf");
        fillRect(g, 150, 252, 156, 264, "#3a6abf");
        fillRect(g, 144, 258, 150, 270, "#3a6abf");
        fillRect(g, 138, 264, 144, 276, "#3a6abf");
        fillRect(g, 132, 270, 138, 276, "#3a6abf");
        fillRect(g, 168, 246, 180, 252, "#3a6abf");
        fillRect(g, 174, 240, 180, 246, "#3a6abf");
        fillRect(g, 186, 240, 192, 246, "#3a6abf");

        // Espada:
        fillRect(g, 246, 264, 252, 270, "#aec4e1");
        fillRect(g, 252, 270, 264, 276, "#aec4e1");
        fillRect(g, 264, 264, 282, 288, "#aec4e1");
        fillRect(g, 270, 270, 288, 294, "#aec4e1");
        fillRect(g, 276, 276, 294, 300, "#aec4e1");
        fillRect(g, 282, 282, 300, 306, "#aec4e1");
        fillRect(g, 294, 288, 306, 312, "#aec4e1");
        fillRect(g, 306, 294, 312, 318, "#aec4e1");
        fillRect(g, 312, 300, 318, 306, "#aec4e1");

        fillRect(g, 312, 306, 324, 324, "#f6ffff");
        fillRect(g, 324, 318, 336, 330, "#f6ffff");
        fillRect(g, 330, 324, 342, 336, "#f6ffff");
        fillRect(g, 276, 294, 282, 300, "#f6ffff");
        fillRect(g, 282, 282, 288, 306, "#f6ffff");
        fillRect(g, 288, 288, 294, 306, "#f6ffff");
        fillRect(g, 294, 294, 300, 300, "#f6ffff");
        fillRect(g, 300, 300, 306, 312, "#f6ffff");
        fillRect(g, 252, 270, 258, 276, "#f6ffff");
        fillRect(g, 258, 276, 264, 282, "#f6ffff");

        fillRect(g, 264, 264, 276, 276, "#2e375a");
        fillRect(g, 270, 276, 282, 294, "#2e375a");
        fillRect(g, 264, 282, 270, 288, "#2e375a");
        fillRect(g, 294, 282, 300, 294, "#2e375a");
        fillRect(g, 300, 294, 306, 300, "#2e375a");
        fillRect(g, 306, 300, 312, 306, "#2e375a");
        fillRect(g, 342, 336, 348, 342, "#2e375a");

        fillRect(g, 318, 306, 324, 312, "#aec4e1");
        fillRect(g, 324, 312, 330, 318, "#aec4e1");
        fillRect(g, 330, 318, 336, 324, "#aec4e1");
        fillRect(g, 336, 324, 342, 330, "#aec4e1");
        fillRect(g, 342, 330, 348, 336, "#aec4e1");
        fillRect(g, 348, 336, 354, 342, "#aec4e1");
        fillRect(g, 354, 342, 360, 348, "#aec4e1");

        // Brilhos e sombras finais:
        // Cabeça:
        fillRect(g, 186, 66, 222, 72, "#f6ffff");
        fillRect(g, 228, 72, 240, 78, "#f6ffff");
        fillRect(g, 168, 72, 180, 78, "#f6ffff");
        fillRect(g, 132, 24, 144, 36, "#f6ffff");
        fillRect(g, 126, 36, 138, 42, "#f6ffff");
        fillRect(g, 120, 42, 132, 72, "#f6ffff");
        fillRect(g, 102, 48, 108, 66, "#f6ffff");
        fillRect(g, 108, 78, 114, 96, "#f6ffff");
        fillRect(g, 126, 72, 138, 78, "#f6ffff");
        fillRect(g, 132, 78, 144, 84, "#f6ffff");
        fillRect(g, 138, 84, 144, 90, "#f6ffff");
        fillRect(g, 120, 102, 126, 108, "#f6ffff");
        fillRect(g, 126, 108, 132, 114, "#f6ffff");
        fillRect(g, 132, 120, 138, 150, "#f6ffff");
        fillRect(g, 138, 156, 144, 168, "#f6ffff");
        fillRect(g, 144, 168, 150, 180, "#f6ffff");
        fillRect(g, 150, 180, 156, 186, "#f6ffff");
        fillRect(g, 156, 186, 168, 192, "#f6ffff");
        fillRect(g, 174, 192, 180, 198, "#f6ffff");
        fillRect(g, 198, 180, 222, 186, "#f6ffff");
        fillRect(g, 216, 186, 252, 192, "#f6ffff");
        fillRect(g, 228, 192, 234, 198, "#f6ffff");
        fillRect(g, 234, 180, 258, 186, "#f6ffff");
        fillRect(g, 240, 174, 264, 180, "#f6ffff");
        fillRect(g, 246, 162, 264, 174, "#f6ffff");
        fillRect(g, 258, 156, 270, 162, "#f6ffff");
        fillRect(g, 264, 108, 270, 156, "#f6ffff");
        fillRect(g, 258, 90, 264, 114, "#f6ffff");
        fillRect(g, 252, 102, 258, 108, "#f6ffff");
        fillRect(g, 252, 84, 258, 90, "#f6ffff");
        fillRect(g, 264, 84, 270, 102, "#f6ffff");
        fillRect(g, 270, 72, 276, 96, "#f6ffff");
        fillRect(g, 276, 60, 282, 90, "#f6ffff");
        fillRect(g, 282 ,36, 288, 78, "#f6ffff");
        fillRect(g, 276, 24, 282, 30, "#f6ffff");
        fillRect(g, 264, 18, 276, 24, "#f6ffff");

        fillRect(g, 108, 54, 114, 78, "#aec4e1");
        fillRect(g, 114, 78, 120, 102, "#aec4e1");
        fillRect(g, 120, 90, 126, 96, "#aec4e1");
        fillRect(g, 132, 102, 138, 114, "#aec4e1");
        fillRect(g, 138, 102, 144, 150, "#aec4e1");
        fillRect(g, 144, 96, 150, 168, "#aec4e1");
        fillRect(g, 144, 84, 150, 90, "#aec4e1");
        fillRect(g, 150, 90, 156, 102, "#aec4e1");
        fillRect(g, 144, 96, 150, 168, "#aec4e1");
        fillRect(g, 150, 114, 156, 180, "#aec4e1");
        fillRect(g, 156, 156, 162, 186, "#aec4e1");
        fillRect(g, 162, 168, 168, 186, "#aec4e1");
        fillRect(g, 168, 174, 174, 186, "#aec4e1");
        fillRect(g, 174, 180, 180, 192, "#aec4e1");
        fillRect(g, 180, 186, 186, 192, "#aec4e1");
        fillRect(g, 246, 72, 252, 84, "#aec4e1");
        fillRect(g, 252, 66, 258, 78, "#aec4e1");
        fillRect(g, 258, 30, 264, 72, "#aec4e1");
        fillRect(g, 264, 42, 270, 66, "#aec4e1");
        fillRect(g, 252, 24, 258, 36, "#aec4e1");
        fillRect(g, 246, 18, 252, 30, "#aec4e1");

        // Corpo:
        fillRect(g, 234, 282, 240, 294, "#f6ffff");
        fillRect(g, 240, 306, 246, 324, "#f6ffff");
        fillRect(g, 186, 300, 204, 306, "#f6ffff");
        fillRect(g, 174, 306, 180, 312, "#f6ffff");
        fillRect(g, 144, 294, 150, 306, "#f6ffff");
        fillRect(g, 138, 312, 144, 324, "#f6ffff");
        fillRect(g, 132, 330, 138, 336, "#d0e9f3");

        // Sombra do corpo:
        fillRect(g, 48, 354, 54, 360, "#242543");
        fillRect(g, 72, 354, 84, 360, "#242543");
        fillRect(g, 90, 354, 270, 360, "#242543");
        fillRect(g, 282, 354, 300, 360, "#242543");
        fillRect(g, 312, 354, 318, 360, "#242543");

        // Luz da capa:
        fillRect(g, 126, 204, 138, 210, "#f6ffff");
        fillRect(g, 102, 210, 114, 216, "#f6ffff");
        fillRect(g, 90,204, 96, 210, "#f6ffff");
        fillRect(g, 66, 234, 90, 240, "#f6ffff");
        fillRect(g, 36, 234, 42, 240, "#f6ffff");
        fillRect(g, 66, 258, 78, 264, "#f6ffff");
        fillRect(g, 102, 270, 108, 282, "#f6ffff");
        fillRect(g, 126, 258, 132, 264, "#f6ffff");
        fillRect(g, 156, 258, 162, 270, "#f6ffff");
        fillRect(g, 150, 264, 156, 276, "#f6ffff");
        fillRect(g, 144, 270, 150, 276, "#f6ffff");
        fillRect(g, 258, 246, 270, 252, "#f6ffff");
        fillRect(g, 264, 252, 282, 258, "#f6ffff");
        fillRect(g, 294, 258, 300, 264, "#f6ffff");

        // Luz dos olhos:
        fillRect(g, 180, 102, 186, 108, "#334566");
        fillRect(g, 192, 114, 198, 120, "#334566");
        fillRect(g, 192, 144, 198, 150, "#334566");
        fillRect(g, 180, 156, 186, 162, "#334566");
        fillRect(g, 168, 156, 174, 162, "#334566");
        fillRect(g, 156, 144, 162, 150, "#334566");
        fillRect(g, 156, 114, 162, 120, "#334566");
        fillRect(g, 168, 102, 174, 108, "#334566");

        fillRect(g, 246, 102, 252, 108, "#334566");
        fillRect(g, 252, 108, 258, 114, "#334566");
        fillRect(g, 258, 144, 264, 150, "#334566");
        fillRect(g, 240, 156, 246, 162, "#334566");
        fillRect(g, 234, 150, 228, 138, "#334566");
        fillRect(g, 228, 108, 234, 120, "#334566");
        fillRect(g, 234, 102, 240, 108, "#334566");

    }

    private void fillRect(Graphics g, int x, int y, int x_, int y_, String color) {
        g.setColor(Color.decode(color));
        g.fillRect(x, y, x_ - x, y_ - y);
    }

    private void fillPolygon(Graphics g, int[] x, int[]y, String color) {
        g.setColor(Color.decode(color));
        g.fillPolygon(new Polygon(x, y, x.length));
    }
}
