package com.example.majo.test02;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by majo on 30-Nov-14.
 */
public class SecondScreen extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.second_layout);

        Intent activityThatCalled = getIntent();

        String previusActivity = activityThatCalled.getExtras().getString("callingActivity");

        TextView tw = (TextView) findViewById(R.id.textView2);
        tw.setText(previusActivity);
    }

    public void button_onclick(View view) {

        EditText et = (EditText) findViewById(R.id.editText);
       String userName = String.valueOf(et.getText());

        Intent goingBack = new Intent();
        goingBack.putExtra("UsersName", userName);

        setResult(RESULT_OK, goingBack);

        finish();

    }
}
