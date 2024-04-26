package Week_8.currency_converter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

public class CurrencyConverter extends JFrame{
    private JTextField dollarsTextField;
    private JButton convertButton;
    private JLabel euroResultLable;
    private JPanel mainPanel;
    private JComboBox<String> currencyComboBox;

    private final String EUROS = "Euros";
    private final String POUNDS = "Pounds";
    private Map<String, Double> exchangeRate = Map.of(EUROS, 0.84, POUNDS, 0.75);

    CurrencyConverter() {
        setContentPane(mainPanel);
        setPreferredSize(new Dimension(400, 300));
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        getRootPane().setDefaultButton(convertButton);

        currencyComboBox.addItem(EUROS);
        currencyComboBox.addItem(POUNDS);

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //what was typed in the JTextField dollarTextFiel
                String dollarString = dollarsTextField.getText();

                try {
                    //convert to a number
                    double dollars = Double.parseDouble(dollarString);
                    String toCurrency = (String) currencyComboBox.getSelectedItem();

                    double exchangeRates = exchangeRate.get(toCurrency);
                    //convert to other currency
                    double convertedValues = dollars * exchangeRates;
                    //display result to euroResultLabel JLabel
                    String resultString = String.format("%.2f dollars is equal to %.2f %s", dollars, convertedValues, toCurrency);
                    euroResultLable.setText(resultString);
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(CurrencyConverter.this, "Please enter any number without other characters");
                }
            }
        });
    }
}
