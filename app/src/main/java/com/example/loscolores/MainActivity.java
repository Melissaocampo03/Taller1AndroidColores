package com.example.loscolores;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout= (ConstraintLayout)findViewById(R.id.fnd1);
    }

    public  void CambiarFondo (View view){

        layout.setBackgroundResource(R.color.Rosado);
    }

    public  void CambiarFondo2 (View view){

        layout.setBackgroundResource(R.color.Azul);
    }

    public  void CambiarFondo3 (View view){

        layout.setBackgroundResource(R.color.Verde);
    }

    public  void CambiarFondo4 (View view){

        layout.setBackgroundResource(R.color.Naranja);
    }

    public  void RestablecerFondo (View view){

        layout.setBackgroundResource(R.color.RestablecerFondo);
    }
}
