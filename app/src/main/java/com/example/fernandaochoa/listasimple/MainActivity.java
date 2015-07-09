package com.example.fernandaochoa.listasimple;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import butterknife.Bind;
import butterknife.ButterKnife;
import android.widget.ArrayAdapter;
import java.util.List;
import android.support.design.widget.Snackbar;
import android.support.design.widget.CoordinatorLayout;


public class MainActivity extends AppCompatActivity {

    ListView listviews;
    ArrayAdapter adaptador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listviews=(ListView)findViewById(R.id.listView);

        adaptador = new DesalumnosArrayAdapter<DesAlumnos>(this,DataSource.desAlumnos);
        listviews.setAdapter(adaptador);

        //Coloco un escuchador 1.- Adaptador que le pasamos solo que generico 2.- view o elemento que seleccionamos osea la vista, 3.-posicion en el arrego, 4.- identificador
        listviews.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            DesAlumnos desalumnoselect = (DesAlumnos)adaptador.getItem(position);
                String ms = "Desalumno: "+desalumnoselect.getNombre();
                Toast.makeText(getApplicationContext(),ms,Toast.LENGTH_SHORT).show();

            }


        });

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

}
