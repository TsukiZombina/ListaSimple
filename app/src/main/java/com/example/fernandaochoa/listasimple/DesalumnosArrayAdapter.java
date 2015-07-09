package com.example.fernandaochoa.listasimple;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Fernanda Ochoa on 07/07/2015.
 */
public class DesalumnosArrayAdapter<T> extends ArrayAdapter<DesAlumnos> {
    public DesalumnosArrayAdapter(Context context, List<DesAlumnos> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View listItemView = convertView;

        if (null == convertView) {
            listItemView = inflater.inflate(R.layout.image_item, parent, false);
        }
        TextView nombre = (TextView) listItemView.findViewById(R.id.nombre);
        TextView cinta = (TextView) listItemView.findViewById(R.id.cinta);
        ImageView icono = (ImageView) listItemView.findViewById(R.id.ninja);

        DesAlumnos item = getItem(position);

        nombre.setText(item.getNombre());
        cinta.setText(item.getCinta());
        icono.setImageResource(item.getIcono());

        return listItemView;
    }
}

