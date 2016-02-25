package jessie.tipcalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

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
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
