package com.example.fernandaochoa.listasimple;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Fernanda Ochoa on 06/07/2015.
 */


//Antes de crear mi renglon
//Heredamos de arrayadapter y le decimos que vamos a usar strings
public class Adaptador extends ArrayAdapter<String> {
    //Despues de crear mi renglon
//Creamos una variable que va a inflar mi layout
    private LayoutInflater inflater;

    //Uso Butterknife para traerme la vista
    @Bind(R.id.tv_renglon)
     TextView textView;

    //Creo una variable que guarde los objetos que le voy a pasar
    String[] desAlumnos;

    //Inicializo mi adaptador
    public Adaptador(Context context, int resource, String[] objects) {
        super(context, resource, objects);

        //Va a crear mi layout a partir del contexto que ya le asigne
        inflater = LayoutInflater.from(context);
        //El arreglo que va a contener todos los datos
        desAlumnos = objects;


    }

    //Mando llamar a getview ctrl o = getview
//Este metodo se encarga de inflar la vista, la llena de datos y la plasma
    //Parametros que pide: posiciones a la cual va a crear, vista reciclada (si es nulo no ha sido creado y sino hace un scroll 360), viewgroup la vista a la cual se va a incorporar
    // en este caso la lista recibe la vista
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Crear la vista para cada elemento, la inflamos y ya tenemos lo que va ir en la vista
        //Para inflar mi vista creo una vista
        View viewItem = inflater.inflate(R.layout.item_list, parent, false);

        ButterKnife.bind(this, viewItem);
        //Al textview le digo que coloque un nuevo texto

        textView.setText(desAlumnos[position]);
        return viewItem;

    }
}
