package com.example.loginparcial;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    private TextView tvNombre;
    private TextView tvQ1, tvQ2, tvQ3, tvQ4, tvQ5, tvQ6, tvQ7, tvQ8;
    private Button btnVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tvNombre = findViewById(R.id.tvNombre);
        tvQ1 = findViewById(R.id.tvQ1);
        tvQ2 = findViewById(R.id.tvQ2);
        tvQ3 = findViewById(R.id.tvQ3);
        tvQ4 = findViewById(R.id.tvQ4);
        tvQ5 = findViewById(R.id.tvQ5);
        tvQ6 = findViewById(R.id.tvQ6);
        tvQ7 = findViewById(R.id.tvQ7);
        tvQ8 = findViewById(R.id.tvQ8);
        btnVolver = findViewById(R.id.btnVolver);

        String nombre = getIntent().getStringExtra("nombre");
        if (nombre == null || nombre.isEmpty()) nombre = "Tu Nombre";
        tvNombre.setText(nombre);


        tvQ1.setText("1) c) Android");
        tvQ2.setText("2) c) Android Studio");
        tvQ3.setText("3) c) Permite crear aplicaciones que funcionen en múltiples plataformas con un solo código base.");
        tvQ4.setText("4) b) Java");
        tvQ5.setText("5) c) Una aplicación nativa ofrece un rendimiento y una experiencia de usuario más optimizados.");
        tvQ6.setText("6) a) Una aplicación que combina características de aplicaciones web y nativas.");
        tvQ7.setText("7) c) Controller");
        tvQ8.setText("8) b) Un archivo XML que describe la estructura y los componentes de una aplicación Android.");

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
            }
        });
    }
}
