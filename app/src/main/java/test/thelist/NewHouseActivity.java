package test.thelist;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.util.Date;

public class NewHouseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_house);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Button submit = (Button) findViewById(R.id.button);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final EditText textbox1 = (EditText) findViewById(R.id.editText);
                final EditText textbox2 = (EditText) findViewById(R.id.editText2);
                final EditText textbox3 = (EditText) findViewById(R.id.editText3);

                String text1 = textbox1.getText().toString();
                String text2 = textbox2.getText().toString();
                String text3 = textbox3.getText().toString();

                Intent formResult = new Intent();
                formResult.putExtra("edittextvalue", text1);
                formResult.putExtra("edittextvalue2",text2);
                formResult.putExtra("edittextvalue3",text3);
                setResult(RESULT_OK, formResult);

                finish();
            }
        });

    }

}
