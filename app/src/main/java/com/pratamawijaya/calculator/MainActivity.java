package com.pratamawijaya.calculator;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    EditText inputAngka1, inputOperator, inputAngka2;
    Button btnHitung;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputAngka1 = (EditText) findViewById(R.id.inputAngka1);
        inputAngka2 = (EditText) findViewById(R.id.inputAngka2);
        inputOperator = (EditText) findViewById(R.id.inputOperator);
        btnHitung = (Button) findViewById(R.id.btnHitung);
        txtHasil = (TextView) findViewById(R.id.txtHasil);

        // mengeset event untuk btnHitung
        btnHitung.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        // disini nantinya akan ada event untuk klik button hitung
        int angka1 = 0;
        int angka2 = 0;
        int hasil = 0;
        String operator;

        angka1 = Integer.parseInt(inputAngka1.getText().toString());
        angka2 = Integer.parseInt(inputAngka2.getText().toString());
        operator = inputOperator.getText().toString();

        if (operator.equals("+")) {
            hasil = angka1 + angka2;
        } else if (operator.equals("-")) {
            hasil = angka1 - angka2;
        } else if (operator.equals("x")) {
            hasil = angka1 * angka2;
        } else if (operator.equals("/")) {
            hasil = angka1 / angka2;
        } else {
            // operator tidak ditemukan
//            txtHasil.setText("operator tidak ditemukan :" + hasil);
        }

        txtHasil.setText("Hasil :" + hasil);


    }
}
