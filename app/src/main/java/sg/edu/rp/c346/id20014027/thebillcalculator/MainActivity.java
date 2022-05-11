package sg.edu.rp.c346.id20014027.thebillcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    EditText amt;
    EditText numPax;
    ToggleButton svs;
    ToggleButton gst;
    TextView totalBill;
    TextView billSplit;
    Button split;
    Button reset;
    EditText discount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amt = findViewById(R.id.enterAmount);
        numPax = findViewById(R.id.enterPax);
        svs = findViewById(R.id.serviceCharge);
        gst = findViewById(R.id.gst);
        totalBill = findViewById(R.id.textViewTotalBill);
        billSplit = findViewById(R.id.textViewEachPays);
        split = findViewById(R.id.toggleButtonSplit);
        reset = findViewById(R.id.toggleButtonReset);
        discount = findViewById(R.id.enterDiscount);



    }
}