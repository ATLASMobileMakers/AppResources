package jessie.tipcalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

<<<<<<< HEAD:AndroidTutorials/Calculator/TipCalculator/app/src/main/java/jessie/tipcalculator/MainActivity.java
    public void calculateTip(){
        EditText billAmount = (EditText) findViewById(R.id.bill);
        EditText percentTip = (EditText) findViewById(R.id.percent);

        String text1 = billAmount.getText().toString();
        int bill = Integer.parseInt(text1);

        String text2 = percentTip.getText().toString();
        int tip = Integer.parseInt(text2);

        int calc = bill*(tip/100);
        System.out.println(calc);

        String.valueOf(calc);
        TextView calculatedTip = (TextView) findViewById(R.id.tip);
        calculatedTip.setText(calc);
=======
    public void calculateTip(View view){

        //Find the elements from the GUI that we want to interact with
        EditText billAmount = (EditText) findViewById(R.id.billField);
        EditText percentTip = (EditText) findViewById(R.id.percentField);
        TextView calculatedTip = (TextView) findViewById(R.id.tipResult);

        //Get values from the EditText input fields
        String billText = billAmount.getText().toString();
        String tipPercentText = percentTip.getText().toString();

        //Parse the values from the EditTexts from strings into doubles
        double bill = Double.parseDouble(billText);
        double tipPercent = Double.parseDouble(tipPercentText);

        //Calculate the tip amount
        double calc = bill*(tipPercent/100);

        //Format the calculated tip amount to have 2 decimal places and cast it as a string
        String formattedCalc = String.format("%.2f", calc);

        //Set the text for the tipResult textView to be the calculated tip amount
        calculatedTip.setText(formattedCalc);
>>>>>>> 05d7c6a946a064b033c815a561fd383570939e2f:AndroidTutorials/TipCalculator/app/src/main/java/jessie/tipcalculator/MainActivity.java
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
