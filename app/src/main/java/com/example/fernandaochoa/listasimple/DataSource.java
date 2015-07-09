package com.example.fernandaochoa.listasimple;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by Fernanda Ochoa on 07/07/2015.
 */
public class DataSource {
    static List desAlumnos = new ArrayList<DesAlumnos>();

    static {
        desAlumnos.add(new DesAlumnos("Fernanda Ochoa","Cinta Negra Android",R.drawable.ic_ninja));
        desAlumnos.add(new DesAlumnos("Angel Gladin","Cinta Negra Android",R.drawable.ic_ninja));
        desAlumnos.add(new DesAlumnos("Gerardo Gerry","Cinta Negra Android",R.drawable.ic_ninja));
        desAlumnos.add(new DesAlumnos("Sebastian Sebas","Cinta Negra Android",R.drawable.ic_ninja));
        desAlumnos.add(new DesAlumnos("Salvador chava","Cinta Negra Android",R.drawable.ic_ninja));
        desAlumnos.add(new DesAlumnos("Emilio ","Cinta Negra Android",R.drawable.ic_ninja));

    }
 }
