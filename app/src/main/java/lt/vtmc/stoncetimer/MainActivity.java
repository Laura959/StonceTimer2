package lt.vtmc.stoncetimer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Chronometer chronometer;
    private boolean timeRunning;
    private long pause;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.laikmatis);

        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        chronometer = findViewById(R.id.chronometer);
        chronometer.setFormat("0:%s");
        chronometer.setBase(SystemClock.elapsedRealtime());
    }
        public void startChronometer(View v){
            if(!timeRunning) {
                chronometer.setBase(SystemClock.elapsedRealtime() - pause);
                chronometer.start();
                timeRunning = true;
            }

        }

        public void pauseChronometer(View v){
            if(timeRunning) {
                chronometer.stop();
                pause = SystemClock.elapsedRealtime() - chronometer.getBase();
                timeRunning = false;
            }

        }

        public void resetChronometer(View v){
            chronometer.setBase(SystemClock.elapsedRealtime());
            pause = 0;

        }






}

