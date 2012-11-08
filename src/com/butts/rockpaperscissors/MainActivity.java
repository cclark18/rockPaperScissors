package com.butts.rockpaperscissors;

import java.util.Random;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {
	Button mRockButton, mPaperButton, mScissorsButton;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRockButton = (Button)findViewById(R.id.rockbutton);
        mPaperButton = (Button)findViewById(R.id.paperbutton);
        mScissorsButton = (Button)findViewById(R.id.scissorsbutton);
        mRockButton.setOnClickListener(this);
        mPaperButton.setOnClickListener(this);
        mScissorsButton.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

	public void onClick(View buttonChosen) {
		Intent i = new Intent(this, ResultActivity.class);
		Random r = new Random();
		int androidChoice = r.nextInt(3); //returns value from 0 to 2
		if (buttonChosen == mRockButton){
			i.putExtra("userChoice", "rock");
		} else if (buttonChosen == mPaperButton){
			i.putExtra("userChoice", "paper");
		} else if (buttonChosen == mScissorsButton){
			i.putExtra("userChoice", "scissors");
		}
		if (androidChoice == 0){
			i.putExtra("androidChoice", "rock");
		} else if (androidChoice == 1){
			i.putExtra("androidChoice", "paper");
		} else if (androidChoice == 2){
			i.putExtra("androidChoice", "scissors");
		}
		this.startActivity(i);
	}
}
