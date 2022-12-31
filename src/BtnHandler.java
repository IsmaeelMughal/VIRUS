
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class BtnHandler implements ActionListener{

    GUI refg;
    GUI fake;
    
    int maxWidth;
    int maxHeight;
    
    BtnHandler(GUI gg)
    {
        refg = gg;
    }
 
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == refg.jb)
        {
            maxWidth = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().width - refg.fr.getSize().width;
            maxHeight = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().height - refg.fr.getSize().height;
 
            //while(true)
            for(int i = 0; i < 5; i++)
            {
                fake = new GUI();
                fake.fr.setLocation((int)Math.floor(Math.random()*maxWidth), (int)Math.floor(Math.random()*maxHeight));
            }
        }
    }
    
}
