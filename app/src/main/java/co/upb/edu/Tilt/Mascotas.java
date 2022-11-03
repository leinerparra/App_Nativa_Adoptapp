package co.upb.edu.Tilt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mascotas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotas);

        //Botones
        Button btnMascotas1 = (Button) findViewById(R.id.btnMascotas1);
        Button btnMascotas2 = (Button) findViewById(R.id.btnMascotas2);
        Button btnMascotas3 = (Button) findViewById(R.id.btnMascotas3);

        inicializarBotones(btnMascotas1,btnMascotas2,btnMascotas3);
    }

    private void inicializarBotones (Button mascotas1, Button mascotas2, Button mascotas3){
        mascotas1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Mascotas.this, Perros.class);
                startActivity(intent);
            }
        });
        mascotas2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Mascotas.this, Gatos.class);
                startActivity(intent);
            }
        });
        mascotas3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Mascotas.this, Aves.class);
                startActivity(intent);
            }
        });

    }

}
