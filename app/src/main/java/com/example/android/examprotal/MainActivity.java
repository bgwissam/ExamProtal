package com.example.android.examprotal;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public final static String LOG_TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int rightAnswerCountrer = 0;
    int wrongAnswerCounter =0;
    /*
    Check which button is checked in the first question and compare to the right answer
     */
    public void Q1check(View view) {
        //will check with radio button is checked
        RadioButton questionOne = findViewById(R.id.q1_a2_radio_button);
        //switch statment will go over all 4 answers an define which is the right
        if(questionOne.isChecked()){
            rightAnswerCountrer++;
        }
        else{
            wrongAnswerCounter++;
        }
    }

    /*
    Check which button is checked in the second question and compare to the right answer
     */
    public void Q2check(View view) {
        //will check with radio button is checked
       RadioButton questionTwo = findViewById(R.id.q2_a4_radio_button);
        //switch statment will go over all 4 answers an define which is the right
        if(questionTwo.isChecked()){
            rightAnswerCountrer++;
        }
        else{
            wrongAnswerCounter++;
        }
    }

    /*
    Check which button is checked in the third question and compare to the right answer
     */
    public void Q3check(View view) {
        //will check with radio button is checked
        RadioButton questionThree = findViewById(R.id.q3_a3_radio_button);
        //switch statment will go over all 4 answers an define which is the right
        if(questionThree.isChecked()){
            rightAnswerCountrer++;

        }
        else{
            wrongAnswerCounter++;

        }
    }

    /*
    Check which button is checked in the forth question and compare to the right answer
     */
    public void Q4check(View view) {
        //will check with radio button is checked
        RadioButton questionFour = findViewById(R.id.q4_a1_radio_button);

        if(questionFour.isChecked()){
            rightAnswerCountrer++;

        }
        else{
            wrongAnswerCounter++;
        }
    }

    /*
  Check which button is checked in the fifth question and compare to the right answer
   */
    public void Q5check(View view) {
        //will check with radio button is checked
        RadioButton questionFive = findViewById(R.id.q5_a3_radio_button);

        if(questionFive.isChecked()){
            rightAnswerCountrer++;
        }
        else{
            wrongAnswerCounter++;
        }
    }

    /*
Check which button is checked in the sixth question and compare to the right answer
*/
    public void Q6check(View view) {
        //will check with radio button is checked
        RadioButton questionSix = findViewById(R.id.q6_a1_radio_button);

        if(questionSix.isChecked()){
            rightAnswerCountrer++;

        }
        else{
            wrongAnswerCounter++;
        }
    }

    public void q7Checkright (View view) {

        CheckBox optionOne = findViewById(R.id.q7_a1_checkbox);
        CheckBox optionTwo = findViewById(R.id.q7_a2_checkbox);
        CheckBox optionThree = findViewById(R.id.q7_a3_checkbox);
        CheckBox optionFour = findViewById(R.id.q7_a4_checkbox);

        if(optionOne.isChecked() && optionThree.isChecked() && !optionTwo.isChecked() & !optionFour.isChecked() ){
            rightAnswerCountrer++;
        }
        else {
            wrongAnswerCounter++;
        }
    }

    /*
    This method will check the answer of the free text view
     */
    public void freeTextEntry (){

        int wrongAnswerColor = getResources().getColor(R.color.Red);

        EditText moonLanding = findViewById(R.id.free_text_view);
        String theAnswer = moonLanding.getText().toString().trim();

        if(theAnswer.equalsIgnoreCase("1969")) {
            rightAnswerCountrer++;
        }
        else{

            moonLanding.getText().clear();
            moonLanding.setTextColor(wrongAnswerColor);
            moonLanding.setText("1969 is the right Answer");
            wrongAnswerCounter++;
        }

    }

    /*
    will check the answers and return the number of right and wrong ones
     */
    public void submitAnswers(View view) {
        Q1check(view);
        Q2check(view);
        Q3check(view);
        Q4check(view);
        Q5check(view);
        Q6check(view);
        q7Checkright(view);
        freeTextEntry();

        if (rightAnswerCountrer == 8)
            Toast.makeText(this, "Congratulations you have all 8 questions right!!", Toast.LENGTH_LONG).show();
        else if (rightAnswerCountrer > 2 && rightAnswerCountrer < 8)
            Toast.makeText(this, "You need to work harder on your skills, you have " + rightAnswerCountrer + " right and " + wrongAnswerCounter + " Wrong answers", Toast.LENGTH_LONG).show();
        else if (rightAnswerCountrer < 2)
            Toast.makeText(this, "Oh!! Sorry you have " + wrongAnswerCounter + " answers wrong and " + rightAnswerCountrer + " answer right!", Toast.LENGTH_LONG).show();
        //calling method to change color
        ChangeColor();
        rightAnswerCountrer = 0;
        wrongAnswerCounter = 0;
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
