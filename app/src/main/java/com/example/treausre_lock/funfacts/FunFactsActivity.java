package com.example.treausre_lock.funfacts;

import android.graphics.Color;
import android.net.sip.SipSession;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {
    private FactBook factBook = new FactBook();
    private ColorWheel colorWheel = new ColorWheel()
;    // Declare our View variables
    private TextView factTextView;
    private Button showFactButton;
    private RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        //Assign the Views from the layout file to the corresponding variables
        factTextView = findViewById(R.id.factTextView);
        showFactButton = findViewById(R.id.showFactButton2);
        relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        //listens to button to be clicked
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fact = factBook.getFact();
                //Update the screen with our new fact
                factTextView.setText(fact);

                int color = colorWheel.getColor();
                relativeLayout.setBackgroundColor(color);
                showFactButton.setTextColor(color);
            }
        };

        showFactButton.setOnClickListener(listener);

        Toast.makeText(this, "Welcome To My App", Toast.LENGTH_LONG).show();
        //Log.d(TAG, "We're loggin from the onCreate() method!");
    }
}
