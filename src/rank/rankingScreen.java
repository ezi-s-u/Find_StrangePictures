package rank;

import global.Controller;
import global.ImagePanel;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class rankingScreen extends JFrame {
    static ImagePanel panel = new ImagePanel("../image/rankPage.png");
    public rankingScreen(){
        
        setTitle("이상한 그림 찾기");
        setSize(1209,738);
        panel.setLayout(null);
        panel.setBounds(0,0,1209,738);
        add(panel);

        Controller read=new Controller();

        JTable table = new JTable();
        DefaultTableModel model =(DefaultTableModel) table.getModel(); ;

        model.addColumn("이름");
        model.addColumn("점수");

        table.setShowGrid(false);
        table.getTableHeader().setReorderingAllowed(false);
        table.getTableHeader().setResizingAllowed(false);



        read.readData(model);

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(400,200, 500, 400);
        add(scrollPane);

        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new rankingScreen();
    }
}
