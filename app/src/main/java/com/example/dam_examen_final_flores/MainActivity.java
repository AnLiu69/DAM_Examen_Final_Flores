package com.example.dam_examen_final_flores;

import android.os.Bundle;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Configurar el Spinner con un ArrayAdapter
        String[] opciones = {"Opción 1", "Opción 2", "Opción 3", "Opción 4"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, opciones);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        // Botón Ingresar
        Button loginButton = findViewById(R.id.loginButton);
        loginButton.setOnClickListener(v ->
                Toast.makeText(this, "Botón Ingresar presionado", Toast.LENGTH_SHORT).show()
        );

        // Botón Generar Clave
        Button generateKeyButton = findViewById(R.id.generateKeyButton);
        generateKeyButton.setOnClickListener(v ->
                Toast.makeText(this, "Botón Generar Clave presionado", Toast.LENGTH_SHORT).show()
        );
    }
}