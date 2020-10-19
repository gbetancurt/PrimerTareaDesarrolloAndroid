package com.example.agenda_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ConfirmarDatos extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_datos);
        setOnClick();

        Bundle parametros = getIntent().getExtras();
        String nombre = parametros.getString("nombre");
        String fecha = parametros.getString("fecha");
        String telefono = parametros.getString("telefono");
        String email = parametros.getString("email");
        String descripcion = parametros.getString("descripcion");

        TextView tvNombre = (TextView) findViewById(R.id.nombrecargado);
        TextView tvFecha = (TextView) findViewById(R.id.fechacargada);
        TextView tvTelefono = (TextView) findViewById(R.id.telefonocargado);
        TextView tvEmail = (TextView) findViewById(R.id.emailcargado);
        TextView tvDescripcion = (TextView) findViewById(R.id.descripcioncargada);

        tvNombre.setText(nombre);
        tvFecha.setText(fecha);
        tvTelefono.setText(telefono);
        tvEmail.setText(email);
        tvDescripcion.setText(descripcion);
    }
    private void setOnClick(){
        final Button botonatras = (Button) findViewById(R.id.botonatras);
        botonatras.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ConfirmarDatos.this, MainActivity.class);
                finish();
            }
        });
    }
}



