package co.upb.edu.Tilt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Botones
        Button btnAcerca = (Button) findViewById(R.id.btnAcerca);
        Button btnCreditos = (Button) findViewById(R.id.btnEquipo);
        Button PruebaMascotas = (Button) findViewById(R.id.PruebaMascotas);

        inicializarBotones(PruebaMascotas, btnAcerca, btnCreditos);
    }

    private void inicializarBotones (Button mascotas, Button acerca, Button creditos){
        mascotas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Mascotas.class);
                startActivity(intent);
            }
        });
        acerca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AcercaDe.class);
                startActivity(intent);
            }
        });
        creditos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Creditos.class);
                startActivity(intent);
            }
        });


    }

}