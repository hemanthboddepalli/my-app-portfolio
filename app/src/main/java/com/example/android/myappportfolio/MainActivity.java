package com.example.android.myappportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getBaseContext(), "This button will launch my Spotify Streamer!", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM |Gravity.CENTER, 0, 0);
                toast.show();
            }
        });

        Button btn2 = (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getBaseContext(), "This button will launch my Scores App!", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM |Gravity.CENTER, 0, 0);
                toast.show();
            }
        });

        Button btn3 = (Button) findViewById(R.id.button3);
        btn3.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getBaseContext(), "This button will launch my Library App!", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM |Gravity.CENTER, 0, 0);
                toast.show();
            }
        });

        Button btn4 = (Button) findViewById(R.id.button4);
        btn4.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getBaseContext(), "This button will launch my Build It Bigger!", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM |Gravity.CENTER, 0, 0);
                toast.show();
            }
        });

        Button btn5 = (Button) findViewById(R.id.button5);
        btn5.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getBaseContext(), "This button will launch my XYZ Reader!", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM |Gravity.CENTER, 0, 0);
                toast.show();
            }
        });

        Button btn6 = (Button) findViewById(R.id.button6);
        btn6.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getBaseContext(), "This button will launch my Capstone App!", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM |Gravity.CENTER, 0, 0);
                toast.show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
