import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;


public class MainScreen implements ActionListener {

    static void screenDisplay()  {
          
           JFrame  frame = new JFrame( "That snake called sammy");
           frame.setLayout(new BorderLayout());
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           frame.setSize(400, 400);
           frame.setVisible(true);
          
          
          
    }

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
