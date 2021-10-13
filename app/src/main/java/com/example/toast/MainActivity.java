package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   Button button1;
   Button button2;
   TextView affichage;
   int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        affichage=(TextView)findViewById(R.id.affichage);
        Log.d("question1","La deuxième activité est ajoutée en tant que classe Java, le fichier " +
                "de présentation (layout) XML est créé et le fichier AndroidManifest.xml est modifié pour déclarer une deuxième activité.");
Log.d("question2","Le bouton Up (Haut) de la barre d'applications n'apparaît plus dans la deuxième activité " +
        "pour renvoyer l'utilisateur à l'activité parent.");
Log.d("Question3","new Intent(String action, Uri uri)");
Log.d("question 4","Comme extra d'intention (Intent)");
Log.d("question5","Obtenez la valeur actuelle du comptage de l'intention");
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i++;
                String j=Integer.toString(i);
                affichage.setText(j);
            }
        });

        final Intent in=new Intent(this,second.class);
      button1.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              String affi=affichage.getText().toString();
              in.putExtra("nombre",affi);
              startActivity(in);


          }
      });

    }}
