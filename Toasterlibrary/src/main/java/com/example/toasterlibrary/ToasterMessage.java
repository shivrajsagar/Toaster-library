package com.example.toasterlibrary;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class ToasterMessage extends Activity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.pintab);


        EditText et_text = findViewById(R.id.et_text);
        Toast.makeText(this, ""+ et_text.getText().toString(), Toast.LENGTH_SHORT).show();
    }

    public static void s(Context context, String Message){
        Toast.makeText(context, Message, Toast.LENGTH_SHORT).show();

    }
}
