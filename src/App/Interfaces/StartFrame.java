package App.Interfaces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartFrame extends JFrame implements ActionListener {

    public StartFrame(){
        //ImageIcon icon=new ImageIcon("C:\\Users\\tarca\\IdeaProjects\\ProjectLabOPM\\src\\img.png");
        JButton button=new JButton();
        button.setBounds(100,100,100,50);
        button.addActionListener(this);
        button.setText("Start");
        button.setFocusable(false);
       // button.setIcon(icon);
        button.setFont(new Font("Comic Sans",Font.BOLD,25));
        this.setTitle("WELCOME");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(false);
        this.setSize(300,300);
        this.setVisible(true);
        this.add(button);
        ImageIcon image=new ImageIcon("C:\\Users\\tarca\\IdeaProjects\\ProjectLabOPM\\src\\512x512bb.jpg");
        /*this.setIconImage(image.getImage());
        StartLabel label=new StartLabel();
        this.add(label);
        this.pack();*/
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
