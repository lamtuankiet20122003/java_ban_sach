package GUI.menu;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

import GUI.setting_frame.icon;
import GUI.setting_frame.setting;

public class menuGUI extends JPanel {
    // goi cac thu vien
    setting set = new setting();
    icon icon = new icon();
    // goi cac doi tuong
    JLabel lab_logo;
    JPanel pan_chucnang;
    JScrollPane thanhcuon_menu;

    // khoi tao ham menuGUI
    public menuGUI() {
        init();
    }

    // khoi tao cac doi tuong
    private void init() {
        // temp
        ArrayList<String> ds_chucnang = new ArrayList<>();
        ds_chucnang.add("Chuc nang 1");
        ds_chucnang.add("Chuc nang 2");
        ds_chucnang.add("Chuc nang 3");
        ds_chucnang.add("Chuc nang 4");
        ds_chucnang.add("Chuc nang 5");
        ds_chucnang.add("Chuc nang 6");
        ds_chucnang.add("Chuc nang 7");
        // ----------------------------------------
        this.setPreferredSize(new Dimension(set.width_menu, set.height_menu));
        this.setBackground(set.color_blue_2);
        this.setLayout(new FlowLayout());
        this.setVisible(true);
        // set logo book store
        lab_logo = new JLabel(icon.book_store);
        // lab_logo.setBounds(0, 0, set.width_menu, 170);
        lab_logo.setPreferredSize(new Dimension(set.width_menu, 170));
        this.add(lab_logo);
        // khoi tao noi de cac nut chuc nang
        pan_chucnang = new JPanel();
        pan_chucnang.setLayout(new FlowLayout(0, 0, 0));
        pan_chucnang.setBackground(set.color_blue_2);
        // pan_chucnang.setBounds(0, 180, 250, set.height_menu - 280);
        pan_chucnang.setPreferredSize(new Dimension(250, 420));
        // tao thanh cuong doc cho pan_chucnang
        thanhcuon_menu = new JScrollPane(pan_chucnang);
        thanhcuon_menu.setPreferredSize(new Dimension(250, 420));
        this.add(thanhcuon_menu);
        // khoi tao cacn nut chuc nang long vao pna_chucnang
        for (int i = 0; i < ds_chucnang.size(); i++) {
            JLabel lab = new JLabel(ds_chucnang.get(i));
            lab.setOpaque(true);
            lab.setBackground(set.color_blue_2);
            lab.setPreferredSize(new Dimension(set.width_menu-50, 50));
            lab.setFont(set.font_time_romans);
            lab.setForeground(Color.white);
            pan_chucnang.add(lab);
        }
    }
}
