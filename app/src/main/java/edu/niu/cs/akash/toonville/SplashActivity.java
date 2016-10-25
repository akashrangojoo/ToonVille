/******************************************************************************
 * Project Name: ToonVille
 * Author : Akash Rangojoo
 * Z ID : Z1717009
 * Class Description : This is Splash Activity. It flashes for 2 seconds
 *                     before the main activity starts and displays app name
 *****************************************************************************/

package edu.niu.cs.akash.toonville;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {

    // method called when app opens and activity is created
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Timer task is created which has an intent that takes the control from splash activity
        // to main activity.
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                finish();
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
            }
        };

        Timer time = new Timer();
        time.schedule(task, 2000);// Number of milli seconds the splash screen is displayed.
    }
}
