package com.butts.rockpaperscissors;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends Activity implements OnClickListener {
	@Override
    public void onCreate(Bundle savedInstanceState) {
		Button playAgainButton;
		String userChoice = "";
		String androidChoice = "";
		String winner = "";
        userChoice = this.getIntent().getExtras().getString("userChoice");
        androidChoice = this.getIntent().getExtras().getString("androidChoice");
        winner = getWinner(androidChoice, userChoice);
		TextView resulttv;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        playAgainButton = (Button)findViewById(R.id.playagain);
        playAgainButton.setOnClickListener(this);
        resulttv = (TextView)findViewById(R.id.resulttv);
        resulttv.setText("User chose " + userChoice + ", Android chose " + androidChoice + "\n" + winner + " won!");
    }

	private String getWinner(String androidChoice, String userChoice) {
		String user = "You";
		String android = "Android";
		if (userChoice.equals(androidChoice)){
			return "Nobody";
		} else if (userChoice.equals("rock") && androidChoice.equals("paper")){
			return android;
		} else if (userChoice.equals("scissors") && androidChoice.equals("paper")){
			return user;
		} else if (userChoice.equals("paper") && androidChoice.equals("rock")){
			return user;
		} else if (userChoice.equals("scissors") && androidChoice.equals("rock")){
			return android;
		} else if (userChoice.equals("rock") && androidChoice.equals("scissors")){
			return user;
		} else if (userChoice.equals("paper") && androidChoice.equals("scissors")){
			return android;
		} else {
			return "error";
		}
	}

	public void onClick(View v) {
		finish();
	}
}
