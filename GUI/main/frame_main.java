package GUI.main;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;

import GUI.menu.menuGUI;
import GUI.setting_frame.setting;

public class frame_main extends JFrame {
    setting set = new setting();
    JPanel jpan_menu;

    public frame_main() {
        init();
    }

    private void init() {
        this.setSize(set.width_main, set.height_main);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // them phan menu vo phia tay main chinh
        jpan_menu = new menuGUI();
        this.add(jpan_menu, BorderLayout.WEST);

        this.setVisible(true);
    }

    public static void main(String[] args) {
        new frame_main().setVisible(true);

    }
}
