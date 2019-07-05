package com.example.practica3;



import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;


public class Fragment_Crear extends Fragment {

    Spinner clas,nom;
    String a="",b="",c;
    EditText a1,a2,a3,a4,a6;
    CheckBox a5;
    Button g,e;
    private SQLlite sqlite;
    public Fragment_Crear(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_fragment__crear, container, false);

        clas= (Spinner) view.findViewById(R.id.sClasificacion);
        nom= (Spinner) view.findViewById(R.id.sEspecie);
        a1=(EditText)view.findViewById(R.id.txtId);
        a2=(EditText)view.findViewById(R.id.txtFecha);
        a3=(EditText)view.findViewById(R.id.txtHabitat);
        a4=(EditText)view.findViewById(R.id.txtAlimentacion);
        a6=(EditText)view.findViewById(R.id.editNombre);
        a5=(CheckBox) view.findViewById(R.id.chSexo);
        g=(Button) view.findViewById(R.id.bGuardar);
        e=(Button) view.findViewById(R.id.bLimpiar);
        a5.setVisibility(View.VISIBLE);
        sqlite=new SQLlite(getContext());
        sqlite.abrir();
        final ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getContext(), R.array.Opciones, android.R.layout.simple_spinner_item);
        clas.setAdapter(adapter);

        clas.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String opcion=String.valueOf(clas.getSelectedItemId());
                int op=Integer.parseInt(opcion);
                System.out.println(opcion);
                if (op==0){

                }
                if (op==1) {
                    final ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(getContext(), R.array.uno, android.R.layout.simple_spinner_item);
                    nom.setAdapter(adapter1);
                    a=adapter.getItem(1).toString();
                    nom.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            String opcion=String.valueOf(nom.getSelectedItemId());
                            int op=Integer.parseInt(opcion);
                            System.out.println(opcion);
                            if (op==0){

                            }
                            if (op==1) {
                                b=adapter1.getItem(1).toString();
                                Toast.makeText(getContext(),a+" "+b, Toast.LENGTH_SHORT).show();
                            }else if(op==2){
                                b=adapter1.getItem(2).toString();
                            }else if(op==3)
                            {
                                b=adapter1.getItem(3).toString();
                            }else if(op==4){
                                b=adapter1.getItem(4).toString();
                            }
                        }
                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }else if(op==2){
                    final ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(getContext(), R.array.dos, android.R.layout.simple_spinner_item);
                    nom.setAdapter(adapter2);
                    a=adapter.getItem(2).toString();
                    nom.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            String opcion=String.valueOf(nom.getSelectedItemId());
                            int op=Integer.parseInt(opcion);
                            System.out.println(opcion);
                            if (op==0){

                            }
                            if (op==1) {
                                b=adapter2.getItem(1).toString();
                            }else if(op==2){
                                b=adapter2.getItem(2).toString();
                            }else if(op==3)
                            {
                                b=adapter2.getItem(3).toString();
                            }else if(op==4){
                                b=adapter2.getItem(4).toString();
                            }
                        }
                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }else if(op==3)
                {
                    final ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(getContext(), R.array.tres, android.R.layout.simple_spinner_item);
                    nom.setAdapter(adapter3);
                    a=adapter.getItem(3).toString();
                    nom.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            String opcion=String.valueOf(nom.getSelectedItemId());
                            int op=Integer.parseInt(opcion);
                            System.out.println(opcion);
                            if (op==0){

                            }
                            if (op==1) {
                                b=adapter3.getItem(1).toString();
                            }else if(op==2){
                                b=adapter3.getItem(2).toString();
                            }else if(op==3)
                            {
                                b=adapter3.getItem(3).toString();
                            }else if(op==4){
                                b=adapter3.getItem(4).toString();
                            }
                        }
                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }else if(op==4){
                    final ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(getContext(), R.array.cuatro, android.R.layout.simple_spinner_item);
                    nom.setAdapter(adapter4);
                    a=adapter.getItem(4).toString();
                    nom.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            String opcion=String.valueOf(nom.getSelectedItemId());
                            int op=Integer.parseInt(opcion);
                            System.out.println(opcion);
                            if (op==0){

                            }
                            if (op==1) {
                                b=adapter4.getItem(1).toString();
                            }else if(op==2){
                                b=adapter4.getItem(2).toString();
                            }else if(op==3)
                            {
                                b=adapter4.getItem(3).toString();
                            }else if(op==4){
                                b=adapter4.getItem(4).toString();
                            }
                        }
                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a5.isChecked()){
                    c="MACHO";
                }else
                {
                    c="HEMBRA";
                }

                if(!a1.getText().toString().equals("")&&!a2.getText().toString().equals("")&&!a3.getText().toString().equals("")&&
                        !a4.getText().toString().equals("")&&!a.equals("")&&!b.equals("")) {
                    int t=Integer.parseInt(a1.getText().toString());
                    Toast.makeText(getContext(),t+" "+a+" "+b+" "+a6.getText().toString().toUpperCase()+" "+c+" "+a2.getText().toString()+" "+
                            a3.getText().toString().toUpperCase()+" "+a4.getText().toString().toUpperCase(), Toast.LENGTH_LONG).show();
                    if (sqlite.addRegistroProductos(t,a,b,a6.getText().toString().toUpperCase(),c,a2.getText().toString(),
                            a3.getText().toString().toUpperCase(),a4.getText().toString().toUpperCase())){
                        //recuperar id del ultimo registtro y pasa como parmetro

                        Toast.makeText(getContext(), "Registro añadido", Toast.LENGTH_SHORT).show();
                        a1.setText("");
                        a2.setText("");
                        a3.setText("");
                        a4.setText("");
                        a6.setText("");

                    } else {
                        Toast.makeText(getContext(), "Error: compruebe que los datos sean correctos", Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(getContext(), "Error: no puede haber campos vacios", Toast.LENGTH_SHORT).show();
                }
            }
        });



        return view;
    }


}