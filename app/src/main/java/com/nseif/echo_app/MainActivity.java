package com.nseif.echo_app;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.TextView;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText src_editText;
    private TextView dest_textView;
    private ExtendedFloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        registerFAB();
    }

    private void init() {
        fab = findViewById(R.id.fab);
        dest_textView = findViewById(R.id.text_dest);
        src_editText = findViewById(R.id.text_src);
    }

    private void registerFAB() {
        fab.setOnClickListener(v -> handleFABClick());
    }

    private void handleFABClick() {
        dest_textView.setText(src_editText.getText());
    }
}