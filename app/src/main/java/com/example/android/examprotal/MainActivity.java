package com.example.android.examprotal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int rightAnswerCountrer;
    int wrongAnswerCounter;
    boolean isCheckedOne;
    /*
    Check which button is checked in the first question and compare to the right answer
     */
    public void Q1check(View view) {
        //will check with radio button is checked
        isCheckedOne = ((RadioButton) view).isChecked();
        //switch statment will go over all 4 answers an define which is the right
        switch (view.getId()) {
            case R.id.q1_a1_radio_button:
                if (isCheckedOne)
                    break;
            case R.id.q1_a2_radio_button:
                if (isCheckedOne) {
                    rightAnswerCountrer++;
                    break;
                }
            case R.id.q1_a3_radio_button:
                if (isCheckedOne)
                    break;
            case R.id.q1_a4_radio_button:
                if (isCheckedOne)
                    break;
        }
    }

    /*
    Check which button is checked in the second question and compare to the right answer
     */
    public void Q2check(View view) {
        //will check with radio button is checked
       boolean isChecked = ((RadioButton) view).isChecked();
        //switch statment will go over all 4 answers an define which is the right
        switch (view.getId()) {
            case R.id.q2_a1_radio_button:
                if (isChecked)
                    break;
            case R.id.q2_a2_radio_button:
                if (isChecked)
                    break;
            case R.id.q2_a3_radio_button:
                if (isChecked)
                    break;
            case R.id.q2_a4_radio_button:
                if (isChecked) {
                    rightAnswerCountrer++;
                    break;
                }
        }
    }

    /*
    Check which button is checked in the third question and compare to the right answer
     */
    public void Q3check(View view) {
        //will check with radio button is checked
       boolean isChecked = ((RadioButton) view).isChecked();
        //switch statment will go over all 4 answers an define which is the right
        switch (view.getId()) {
            case R.id.q3_a1_radio_button:
                if (isChecked)
                    break;
            case R.id.q3_a2_radio_button:
                if (isChecked)
                    break;
            case R.id.q3_a3_radio_button:
                if (isChecked) {
                    rightAnswerCountrer++;
                    break;
                }
            case R.id.q3_a4_radio_button:
                if (isChecked)
                    break;
        }
    }

    /*
    Check which button is checked in the forth question and compare to the right answer
     */
    public void Q4check(View view) {
        //will check with radio button is checked
        boolean isChecked = ((RadioButton) view).isChecked();
        //switch statment will go over all 4 answers an define which is the right
        switch (view.getId()) {
            case R.id.q4_a1_radio_button:
                if (isChecked) {
                    rightAnswerCountrer++;
                    break;
                }
            case R.id.q4_a2_radio_button:
                if (isChecked)
                    break;
            case R.id.q4_a3_radio_button:
                if (isChecked)
                    break;
            case R.id.q4_a4_radio_button:
                if (isChecked)
                    break;
        }
    }

    /*
  Check which button is checked in the fifth question and compare to the right answer
   */
    public void Q5check(View view) {
        //will check with radio button is checked
        boolean isChecked = ((RadioButton) view).isChecked();
        //switch statment will go over all 4 answers an define which is the right
        switch (view.getId()) {
            case R.id.q5_a1_radio_button:
                if (isChecked)
                    break;
            case R.id.q5_a2_radio_button:
                if (isChecked)
                    break;
            case R.id.q5_a3_radio_button:
                if (isChecked) {
                    rightAnswerCountrer++;
                    break;
                }
            case R.id.q5_a4_radio_button:
                if (isChecked)
                    break;
        }
    }

    /*
Check which button is checked in the sixth question and compare to the right answer
*/
    public void Q6check(View view) {
        //will check with radio button is checked
        boolean isChecked = ((RadioButton) view).isChecked();
        //switch statment will go over all 4 answers an define which is the right
        switch (view.getId()) {
            case R.id.q6_a1_radio_button:
                if (isChecked) {
                    rightAnswerCountrer++;
                    break;
                }
            case R.id.q6_a2_radio_button:
                if (isChecked)
                    break;
            case R.id.q6_a3_radio_button:
                if (isChecked)
                    break;
            case R.id.q6_a4_radio_button:
                if (isChecked)
                    break;
        }
    }

    public void q7Checkright (View view) {

        boolean isChecked = ((CheckBox) view).isChecked();

        view.getId();
        if(isChecked)
            rightAnswerCountrer++;

    }

//    public void q7Checkwrong (View view){
//
//        boolean isChecked = ((CheckBox) view).isChecked();
//
//        view.getId();
//        if(isChecked)
//            wrongAnswerCounter++;
//    }


    /*
    This method will check the answer of the free text view
     */
    public void freeTextEntry (){

        int wrongAnswerColor = getResources().getColor(R.color.Red);

        EditText moonLanding = findViewById(R.id.free_text_view);
        String theAnswer = String.valueOf(moonLanding.getText());
        Log.i("The Answer", theAnswer);
        if(theAnswer.equals("1969"))
            rightAnswerCountrer++;
        else{
            moonLanding.setTextColor(wrongAnswerColor);
            moonLanding.setText(theAnswer + " is wrong 1969 is the right Answer");
        }

    }

    /*
    will check the answers and return the number of right and wrong ones
     */
    public void submitAnswers(View view) {
        Q1check(view);
//        Q2check(view);
//        Q3check(view);
//        Q4check(view);
//        Q5check(view);
//        Q6check(view);
//        q7Checkright(view);

        freeTextEntry();
        if (rightAnswerCountrer == 9)
            Toast.makeText(this, "Congratulations you have all 9 questions right!!", Toast.LENGTH_LONG).show();
        else if (rightAnswerCountrer > 2 && rightAnswerCountrer < 9)
            Toast.makeText(this, "You need to work harder on your skills, you have " + rightAnswerCountrer + " right and " + (9 - rightAnswerCountrer) + " Wrong answers", Toast.LENGTH_LONG).show();
        else if (rightAnswerCountrer < 2)
            Toast.makeText(this, "Oh!! Sorry you have " + (9 - rightAnswerCountrer) + " answers wrong and " + rightAnswerCountrer + " answer right!", Toast.LENGTH_LONG).show();
        //calling method to change color
        ChangeColor();
        rightAnswerCountrer = 0;
    }


    /*
    Method will change the color of the RadioButton of which the answer is right
     */
    public void ChangeColor() {
        int mycolor = getResources().getColor(R.color.rightanswer);

        RadioButton questionOne = findViewById(R.id.q1_a2_radio_button);
        questionOne.setBackgroundColor(mycolor);

        RadioButton questionTwo = findViewById(R.id.q2_a4_radio_button);
        questionTwo.setBackgroundColor(mycolor);

        RadioButton questionThree = findViewById(R.id.q3_a3_radio_button);
        questionThree.setBackgroundColor(mycolor);

        RadioButton questionFour = findViewById(R.id.q4_a1_radio_button);
        questionFour.setBackgroundColor(mycolor);

        RadioButton questionFive = findViewById(R.id.q5_a3_radio_button);
        questionFive.setBackgroundColor(mycolor);

        RadioButton questionSix = findViewById(R.id.q6_a1_radio_button);
        questionSix.setBackgroundColor(mycolor);

        CheckBox questionSeven_a = findViewById(R.id.q7_a1_checkbox);
        questionSeven_a.setBackgroundColor(mycolor);

        CheckBox questionSeven_b = findViewById(R.id.q7_a3_checkbox);
        questionSeven_b.setBackgroundColor(mycolor);
    }


}
