import javax.swing.JTextArea;
import javax.swing.JOptionPane;

public class TempConversion {
    public static void main(String[] args) {
      // declare an object representing a muiltiline text area that displays plain
      // text initial 5 rows and 10 columns
    JTextArea outputArea = new JTextArea(1,10);
    // build a string for outputArea
    String outputString = "Celsius\tFahrenheit\n";
    // get the max limit celsius temperatures to calculate their fahrenheit equivalent
    int maxLimit = Integer.parseInt(JOptionPane.showInputDialog("Enter the max limit"));
    float fahrenheit;

    for (int celsius = 10; celsius <= maxLimit; celsius+=10) {
        fahrenheit = Math.round(celsius * 9.0/5.0 + 32);
        outputString += "\n" + celsius + "\t" + farenheit;
    }
    // populate the text area with the output string you built
    outputArea.setText(outputString);
    // Show the text area inside a MessageDialog
    JOptionPane.showMessageDialog(null, outputArea, "Temperature Conversion Table", JOptionPane.INFORMATION_MESSAGE);
    }
} //end class TempConversion