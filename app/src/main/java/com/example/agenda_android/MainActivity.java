package com.example.agenda_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setOnClick();
    }
    private void setOnClick(){
        Button button = (Button) findViewById(R.id.button);
        final TextInputLayout nombre = (TextInputLayout) findViewById(R.id.etNombre);
        final DatePicker fecha = (DatePicker) findViewById(R.id.simpleDatePicker);
        final TextInputLayout telefono = (TextInputLayout) findViewById(R.id.etTelefono);
        final TextInputLayout email = (TextInputLayout) findViewById(R.id.etEmail);
        final TextInputLayout descripcion = (TextInputLayout) findViewById(R.id.etDescripcionContacto);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ConfirmarDatos.class);
                intent.putExtra("nombre", nombre.getEditText().getText().toString());
                intent.putExtra("fecha", fecha.getDayOfMonth() + "/" + (fecha.getMonth() +1) + "/" + fecha.getYear());
                intent.putExtra("telefono", telefono.getEditText().getText().toString());
                intent.putExtra("email", email.getEditText().getText().toString());
                intent.putExtra("descripcion", descripcion.getEditText().getText().toString());
                startActivity(intent);
            }
        });
    }
}