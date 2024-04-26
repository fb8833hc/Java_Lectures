package Week_8.hello_gui_app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloGUI extends JFrame{
    private JPanel mainPanel;
    private JButton clickMeButton;
    private JLabel firstLabel;

    HelloGUI() {
        setContentPane(mainPanel); //sets the main panel
        setPreferredSize(new Dimension(500, 500)); //changes the window when you open the GUI
        pack();
        setVisible(true); //makes sure the GUI is visible when run
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //exits the program when you close the window

        clickMeButton.addActionListener(new ActionListener() { //event that makes clicking on the button do something
            @Override
            public void actionPerformed(ActionEvent e) {
                //code here = this will run when the button is clicked.
                firstLabel.setText("Hello"); //clicking the button changes the label to hello
            }
        });
    }

}
