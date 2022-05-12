package sg.edu.rp.c346.id20014027.thebillcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
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
        split = findViewById(R.id.buttonSplit);
        reset = findViewById(R.id.buttonReset);
        discount = findViewById(R.id.enterDiscount);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amt.setText("");
                numPax.setText("");
                discount.setText("");
                totalBill.setText("Total Bill: $");
                billSplit.setText("Each Pays: $");
            }
        });


    }
}