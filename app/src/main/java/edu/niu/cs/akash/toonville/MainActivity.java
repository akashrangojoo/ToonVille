/******************************************************************************
 * Project Name: ToonVille
 * Author : Akash Rangojoo
 * Z ID : Z1717009
 * Class Description : This is main class. It displays the Six image buttons,
 *                     which when clicked will play a related audio.
 *****************************************************************************/

package edu.niu.cs.akash.toonville;

import android.media.Image;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    // Declaring ImageButtons, which hold the images and acts as buttons
    private ImageButton tomNJerryBtn,popeyeBtn,flintstonesBtn,scoobyBtn,johnnyBtn,addamsBtn;
    //Declaring MediaPlayers, which are played when an imageis clicked
    private MediaPlayer tomMP,popeyeMP,scoobyMP,flintMP,johhnyMP,addamsMP;

    // method called when application is started
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Connecting the ImageButtons created above to ImageButtons on the screen
        tomNJerryBtn = (ImageButton) findViewById(R.id.tomImageButton);
        popeyeBtn = (ImageButton) findViewById(R.id.popeyeImageButton);
        scoobyBtn = (ImageButton) findViewById(R.id.scoobyImageButton);
        flintstonesBtn = (ImageButton) findViewById(R.id.flintImageButton);
        johnnyBtn = (ImageButton) findViewById(R.id.johnnyImageButton);
        addamsBtn = (ImageButton) findViewById(R.id.addamsFamilyImageButton);

        // Initializing the MediaPlayers with corresponding audio files
        tomMP = new MediaPlayer().create(this, R.raw.tom_n_jerry);
        popeyeMP = new MediaPlayer().create(this,R.raw.popeye);
        johhnyMP = new MediaPlayer().create(this,R.raw.johnny_bravo);
        scoobyMP = new MediaPlayer().create(this,R.raw.scooby_doo);
        flintMP = new MediaPlayer().create(this,R.raw.yabba_dabba_doo);
        addamsMP = new MediaPlayer().create(this,R.raw.addams_family);
    }

    /***********************************************************
     *Description : Method called when Tom and Jerry is clicked
     *Arguments   : View
    ************************************************************/

    public void playTom(View view){
        if(tomMP.isPlaying()){  // If Tom and Jerry is playing, pause it
           tomMP.pause();
           tomNJerryBtn.setImageResource(R.drawable.tom_n_jerry_bw);
        }
        else{  // else seek all MediaPlayers to beginning, pause them and start playing Tom and Jerry
            if(popeyeMP.isPlaying()) {popeyeMP.seekTo(0);popeyeMP.pause();popeyeBtn.setImageResource(R.drawable.popye_bw);}
            if(scoobyMP.isPlaying()) {scoobyMP.seekTo(0);scoobyMP.pause();scoobyBtn.setImageResource(R.drawable.scooby_doo_bw);}
            if(johhnyMP.isPlaying()) {johhnyMP.seekTo(0);johhnyMP.pause();johnnyBtn.setImageResource(R.drawable.johnny_bravo_bw);}
            if(flintMP.isPlaying()) {flintMP.seekTo(0);flintMP.pause();flintstonesBtn.setImageResource(R.drawable.flintstones_bw);}
            if(addamsMP.isPlaying()) {addamsMP.seekTo(0);addamsMP.pause();addamsBtn.setImageResource(R.drawable.the_addams_family_bw);}
            tomNJerryBtn.setImageResource(R.drawable.tom_n_jerry);
            tomMP.start();
        }
    }

    /***********************************************************
     *Description : Method called when Scooby Doo is clicked
     *Arguments   : View
     ************************************************************/
    public void playScooby(View view){
        if(scoobyMP.isPlaying()){ // If Scooby Doo is playing, pause it
            scoobyMP.pause();
            scoobyBtn.setImageResource(R.drawable.scooby_doo_bw);
        }
        else{  // else seek all MediaPlayers to beginning, pause them and start playing Scooby Doo
            if(popeyeMP.isPlaying()) {popeyeMP.seekTo(0);popeyeMP.pause();popeyeBtn.setImageResource(R.drawable.popye_bw);}
            if(tomMP.isPlaying()) {tomMP.seekTo(0);tomMP.pause();tomNJerryBtn.setImageResource(R.drawable.tom_n_jerry_bw);}
            if(johhnyMP.isPlaying()) {johhnyMP.seekTo(0);johhnyMP.pause();johnnyBtn.setImageResource(R.drawable.johnny_bravo_bw);}
            if(flintMP.isPlaying()) {flintMP.seekTo(0);flintMP.pause();flintstonesBtn.setImageResource(R.drawable.flintstones_bw);}
            if(addamsMP.isPlaying()) {addamsMP.seekTo(0);addamsMP.pause();addamsBtn.setImageResource(R.drawable.the_addams_family_bw);}
            scoobyMP.start();
            scoobyBtn.setImageResource(R.drawable.scooby_doo);
        }
    }

    /***********************************************************
     *Description : Method called when Flintstones is clicked
     *Arguments   : View
     ************************************************************/
    public void playFlintstones(View view){
        if(flintMP.isPlaying()){ // If Flintstones is playing, pause it
            flintMP.pause();
            flintstonesBtn.setImageResource(R.drawable.flintstones_bw);
        }
        else{  // else seek all MediaPlayers to beginning, pause them and start playing Flintstones
            if(popeyeMP.isPlaying()) {popeyeMP.seekTo(0);popeyeMP.pause();popeyeBtn.setImageResource(R.drawable.popye_bw);}
            if(scoobyMP.isPlaying()) {scoobyMP.seekTo(0);scoobyMP.pause();scoobyBtn.setImageResource(R.drawable.scooby_doo_bw);}
            if(johhnyMP.isPlaying()) {johhnyMP.seekTo(0);johhnyMP.pause();johnnyBtn.setImageResource(R.drawable.johnny_bravo_bw);}
            if(tomMP.isPlaying()) {tomMP.seekTo(0);tomMP.pause();tomNJerryBtn.setImageResource(R.drawable.tom_n_jerry_bw);}
            if(addamsMP.isPlaying()) {addamsMP.seekTo(0);addamsMP.pause();addamsBtn.setImageResource(R.drawable.the_addams_family_bw);}
            flintMP.start();
            flintstonesBtn.setImageResource(R.drawable.flintstones);
        }
    }

    /***********************************************************
     *Description : Method called when Popeye is clicked
     *Arguments   : View
     ************************************************************/
    public void playPopeye(View view){
        if(popeyeMP.isPlaying()){ // If Popeye is playing, pause it
            popeyeMP.pause();
            popeyeBtn.setImageResource(R.drawable.popye_bw);
        }
        else{ // else seek all MediaPlayers to beginning, pause them and start playing Popeye
            if(tomMP.isPlaying()) {tomMP.seekTo(0);tomMP.pause();tomNJerryBtn.setImageResource(R.drawable.tom_n_jerry_bw);}
            if(scoobyMP.isPlaying()) {scoobyMP.seekTo(0);scoobyMP.pause();scoobyBtn.setImageResource(R.drawable.scooby_doo_bw);}
            if(johhnyMP.isPlaying()) {johhnyMP.seekTo(0);johhnyMP.pause();johnnyBtn.setImageResource(R.drawable.johnny_bravo_bw);}
            if(flintMP.isPlaying()) {flintMP.seekTo(0);flintMP.pause();flintstonesBtn.setImageResource(R.drawable.flintstones_bw);}
            if(addamsMP.isPlaying()) {addamsMP.seekTo(0);addamsMP.pause();addamsBtn.setImageResource(R.drawable.the_addams_family_bw);}
            popeyeMP.start();
            popeyeBtn.setImageResource(R.drawable.popye);
        }
    }

    /***********************************************************
     *Description : Method called when Johnny Bravo is clicked
     *Arguments   : View
     ************************************************************/
    public void playJohnny(View view){
        if(johhnyMP.isPlaying()){  // If Johnny Bravo is playing, pause it
            johhnyMP.pause();
            johnnyBtn.setImageResource(R.drawable.johnny_bravo_bw);
        }
        else{  // else seek all MediaPlayers to beginning, pause them and start playing Johnny Bravo
            if(popeyeMP.isPlaying()) {popeyeMP.seekTo(0);popeyeMP.pause();popeyeBtn.setImageResource(R.drawable.popye_bw);}
            if(scoobyMP.isPlaying()) {scoobyMP.seekTo(0);scoobyMP.pause();scoobyBtn.setImageResource(R.drawable.scooby_doo_bw);}
            if(tomMP.isPlaying()) {tomMP.seekTo(0);tomMP.pause();tomNJerryBtn.setImageResource(R.drawable.tom_n_jerry_bw);}
            if(flintMP.isPlaying()) {flintMP.seekTo(0);flintMP.pause();flintstonesBtn.setImageResource(R.drawable.flintstones_bw);}
            if(addamsMP.isPlaying()) {addamsMP.seekTo(0);addamsMP.pause();addamsBtn.setImageResource(R.drawable.the_addams_family_bw);}
            johhnyMP.start();
            johnnyBtn.setImageResource(R.drawable.johnny_bravo);
        }
    }

    /***********************************************************
     *Description : Method called when Addams Family is clicked
     *Arguments   : View
     ************************************************************/
    public void playAddams(View view){
        if(addamsMP.isPlaying()){ // If Addams Family is playing, pause it
            addamsMP.pause();
            addamsBtn.setImageResource(R.drawable.the_addams_family_bw);
        }
        else{ // else seek all MediaPlayers to beginning, pause them and start playing Addams Family
            if(popeyeMP.isPlaying()) {popeyeMP.seekTo(0);popeyeMP.pause();popeyeBtn.setImageResource(R.drawable.popye_bw);}
            if(scoobyMP.isPlaying()) {scoobyMP.seekTo(0);scoobyMP.pause();scoobyBtn.setImageResource(R.drawable.scooby_doo_bw);}
            if(johhnyMP.isPlaying()) {johhnyMP.seekTo(0);johhnyMP.pause();johnnyBtn.setImageResource(R.drawable.johnny_bravo_bw);}
            if(flintMP.isPlaying()) {flintMP.seekTo(0);flintMP.pause();flintstonesBtn.setImageResource(R.drawable.flintstones_bw);}
            if(tomMP.isPlaying()) {tomMP.seekTo(0);tomMP.pause();tomNJerryBtn.setImageResource(R.drawable.tom_n_jerry_bw);}
            addamsMP.start();
            addamsBtn.setImageResource(R.drawable.the_addams_family);
        }
    }

    // method called when the application is exited
    @Override
    protected void onStop(){
        super.onStop();
        // Stop all the players that are playing
        if(popeyeMP.isPlaying()) {popeyeMP.stop();}
        if(tomMP.isPlaying()) {tomMP.stop();}
        if(scoobyMP.isPlaying()) {scoobyMP.stop();}
        if(johhnyMP.isPlaying()) {johhnyMP.stop();}
        if(flintMP.isPlaying()) {flintMP.stop();}
        if(addamsMP.isPlaying()) {addamsMP.stop();}

    }
}
