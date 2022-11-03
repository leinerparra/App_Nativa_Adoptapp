package co.upb.edu.Tilt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Aves extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aves);

        //Botones
        Button btncontactar1 = (Button) findViewById(R.id.btncontactar1);
        Button btncontactar2 = (Button) findViewById(R.id.btncontactar2);
        Button btnVolverMascotas = (Button) findViewById(R.id.btnMascotas4);

        inicializarBotones(btncontactar1,btncontactar2,btnVolverMascotas);
    }

    private void inicializarBotones (Button contactar1, Button contactar2, Button volvermascota){
        contactar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Aves.this, Contacto.class);
                startActivity(intent);
            }
        });
        contactar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Aves.this, Contacto.class);
                startActivity(intent);
            }
        });
        volvermascota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Aves.this, Mascotas.class);
                startActivity(intent);
            }
        });


    }

}