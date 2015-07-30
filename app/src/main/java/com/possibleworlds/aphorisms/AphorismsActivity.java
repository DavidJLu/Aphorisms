package com.possibleworlds.aphorisms;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class AphorismsActivity extends ActionBarActivity {
    public static final String TAG = AphorismsActivity.class.getSimpleName();
    private ColorWheel mColorWheel = new ColorWheel();
    private AphorismBook mFactBook = new AphorismBook();    // Construct new FactBook object using default constructor

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // create activity
        setContentView(R.layout.activity_aphorisms);    // Use activity_fun_facts xml layout for the content view

        // Declare our View variables and assign the Views from the layout file
        final TextView factLabel = (TextView) findViewById(R.id.aphorismTextView);  // Attach to view by id
        final Button showFactButton = (Button) findViewById(R.id.showAphorismButton);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        //Create OnClickListener
        View.OnClickListener listener = new View.OnClickListener() {        //create listener for button
            @Override
            public void onClick(View view) {    // When button is tapped...
                int color = mColorWheel.getColor();
                relativeLayout.setBackgroundColor(color);
                showFactButton.setTextColor(color);
                String fact = mFactBook.getAphorism();
                factLabel.setText(fact);
            }
        };
        showFactButton.setOnClickListener(listener);    // Attach onclock listener to button

        //Toast.makeText(this, "Yay! Our Activity was created!", Toast.LENGTH_LONG).show();
        Log.d(TAG, "We're logging from the onCreate() method!");
    }
}
