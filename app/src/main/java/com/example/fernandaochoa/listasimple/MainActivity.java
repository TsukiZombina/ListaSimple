package com.example.fernandaochoa.listasimple;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity {

    @Bind(R.id.listView)
    ListView listviews;

    public static String[] desAlumnos = {"Fernanda", "Salvador", "Emilio", "Angel", "Gerardo", "Sebastian"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setupListView();
    }

    private void setupListView() {
        //Me permite vaciar la coleccion de datos a mi lista  1.- contexto, 2.- item que uso para mi lista, 3.- la coleccion de datos
       //Para el estatico sin personalizar ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, desAlumnos);

        Adaptador miAdaptador = new Adaptador(this,0,desAlumnos);
        //Este adaptador se lo paso a mi listview

      //Para estatico sin personalizar  listviews.setAdapter(arrayAdapter);
        listviews.setAdapter(miAdaptador);

        //Coloco un escuchador 1.- Adaptador que le pasamos solo que generico 2.- view o elemento que seleccionamos osea la vista, 3.-posicion en el arrego, 4.- identificador
        listviews.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //Mostrar el elemento que seleccione, nombre, posicion y tiempo
                Toast.makeText(MainActivity.this,desAlumnos[position],Toast.LENGTH_SHORT).show();
            }
        });


    }
}
