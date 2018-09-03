package me.adamwlarson.class3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
    }

    public void onCalculate(View view) {
        EditText eText = (EditText)findViewById(R.id.year);
        TextView tView = (TextView)findViewById(R.id.answer);
        String enteredYear = eText.getText().toString();
        int year = Integer.parseInt(enteredYear);
        tView.setText(Integer.toString(centuryFromYear(year)));
    }

    private int centuryFromYear(int year) {
        //TODO add your code yere
        return 0;
    }
}
