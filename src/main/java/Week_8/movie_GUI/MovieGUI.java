package Week_8.movie_GUI;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MovieGUI extends JFrame{
    private JTextField movieTitleTextField;
    private JSlider ratingSilder;
    private JCheckBox wouldSeeAgainCheckBox;
    private JPanel mainPanel;
    private JLabel silderValueLabel;
    private JLabel movieOpinionLabel;
    private JButton quitButton;

    MovieGUI() {
        setContentPane(mainPanel);
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        configureEventHandlers();
    }

    private void configureEventHandlers(){
        ratingSilder.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                updateOpinion();
            }
        });

        wouldSeeAgainCheckBox.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                String valueLabelText = ratingSilder.getValue() + " stars";
                silderValueLabel.setText(valueLabelText);
                updateOpinion();
            }
        });

        movieTitleTextField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateOpinion();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateOpinion();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });

        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (JOptionPane.showConfirmDialog(MovieGUI.this, "Are you sure you want to quit?", "Quit",
                        JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
                    dispose();
                }
            }
        });
    }

    private void updateOpinion(){
        String movieName = movieTitleTextField.getText().strip();

        if (movieName.isEmpty()) {
            movieOpinionLabel.setText("Movie Opinion");
            return;
        } else {

            int rating = ratingSilder.getValue();
            boolean seeAgain = wouldSeeAgainCheckBox.isSelected();

            String template = "You rated %s %d stars. You %s see again.";
            String seeAgainString = "would";
            if (seeAgain == false) {
                seeAgainString = "would not";
            }

            String opinion = String.format(template, movieName, rating, seeAgainString);
            movieOpinionLabel.setText(opinion);
        }
    }
}
