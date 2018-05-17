package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private final int BRANCH_1 = 1;
    private final int BRANCH_2 = 2;
    private final int BRANCH_3 = 3;
    private final int BRANCH_4 = 4;
    private final int BRANCH_6 = 5;
    private final int BRANCH_5 = 6;

    private int currentBranch = BRANCH_1;

    private TextView storyText;
    private Button buttonTop;
    private Button buttonBottom;
    private Button buttonReset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        storyText = (TextView) findViewById(R.id.storyTextView);
        buttonTop = (Button) findViewById(R.id.buttonTop);
        buttonBottom = (Button) findViewById(R.id.buttonBottom);
        buttonReset = (Button) findViewById(R.id.buttonReset);

        buttonReset.setVisibility(View.INVISIBLE);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:




        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:


    }

    public void topButtonClick(View view) {
        switch (currentBranch) {
            case BRANCH_1:
                storyText.setText(R.string.T3_Story);
                buttonTop.setText(R.string.T3_Ans1);
                buttonBottom.setText(R.string.T3_Ans2);
                currentBranch = BRANCH_3;
                break;
            case BRANCH_2:
                storyText.setText(R.string.T3_Story);
                buttonTop.setText(R.string.T3_Ans1);
                buttonBottom.setText(R.string.T3_Ans2);
                currentBranch = BRANCH_3;
                break;
            case BRANCH_3:
                storyText.setText(R.string.T6_End);
                buttonTop.setVisibility(View.INVISIBLE);
                buttonBottom.setVisibility(View.INVISIBLE);
                buttonReset.setVisibility(View.VISIBLE);
                currentBranch = BRANCH_6;
                break;
        }
    }

    public void bottomButtonClick(View view) {
        switch (currentBranch) {
            case BRANCH_1:
                storyText.setText(R.string.T2_Story);
                buttonTop.setText(R.string.T2_Ans1);
                buttonBottom.setText(R.string.T2_Ans2);
                currentBranch = BRANCH_2;
                break;
            case BRANCH_2:
                storyText.setText(R.string.T4_End);
                buttonTop.setVisibility(View.INVISIBLE);
                buttonBottom.setVisibility(View.INVISIBLE);
                buttonReset.setVisibility(View.VISIBLE);
                currentBranch = BRANCH_4;
                break;
            case BRANCH_3:
                storyText.setText(R.string.T5_End);
                buttonTop.setVisibility(View.INVISIBLE);
                buttonBottom.setVisibility(View.INVISIBLE);
                buttonReset.setVisibility(View.VISIBLE);
                currentBranch = BRANCH_5;
                break;
        }
    }

    public void resetGame(View view) {
        storyText.setText(R.string.T1_Story);
        buttonTop.setText(R.string.T1_Ans1);
        buttonTop.setVisibility(View.VISIBLE);
        buttonBottom.setText(R.string.T1_Ans2);
        buttonBottom.setVisibility(View.VISIBLE);
        buttonReset.setVisibility(View.INVISIBLE);
        currentBranch = BRANCH_1;
    }
}
