
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class GUI {
    JFrame fr;
    JLabel jl;
    JButton jb;
    BtnHandler btnhnd;
    
    
    public GUI()
    {
        initGUI();
    }
    
    public void initGUI()
    {
        fr = new JFrame("VIRUS");
        jl = new JLabel("30km's Away : ");
        jb = new JButton("Now!");
        btnhnd = new BtnHandler(this);
        
        fr.setLayout(new FlowLayout());
        
        fr.add(jl);
        fr.add(jb);
        
        jb.addActionListener(btnhnd);
        
        fr.setSize(300, 300);
        fr.setLocationRelativeTo(null);
        
        //fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
}
