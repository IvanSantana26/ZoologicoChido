package com.example.practica3;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class Fragment_Eliminar extends Fragment {

    Button eliminar;
    private SQLlite sqlite;
    EditText id;


    public Fragment_Eliminar() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View view =  inflater.inflate(R.layout.fragment_fragment__eliminar, container, false);

        eliminar = (Button) view.findViewById(R.id.bEliminar);
        id = (EditText) view.findViewById(R.id.txtId);

        eliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sqlite=new SQLlite(getContext());
                sqlite.abrir();

                System.out.print("Entraste");
                if(id.getText().toString()!=null){
                    sqlite.Eliminar(id.getText());
                    Toast.makeText(getContext(), "Registro Eliminado", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getContext(), "Llene el campo", Toast.LENGTH_SHORT).show();
                }

            }
        });

        return  view;



    }


}
