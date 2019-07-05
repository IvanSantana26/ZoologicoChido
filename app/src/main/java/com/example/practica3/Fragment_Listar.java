package com.example.practica3;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.database.Cursor;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;



public class Fragment_Listar extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_fragment__listar, container, false);

        ListView l=(ListView)view.findViewById(R.id.listVi) ;
        SQLlite sqlite;

        //base de datos
        sqlite = new SQLlite(getContext());
        sqlite.abrir();
        Cursor cursor = sqlite.getRegistroProductos();
        ArrayList<String> reg = sqlite.getPROD(cursor);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1,reg);
        l.setAdapter(adaptador);

        return view;
    }


}

