package com.example.practica3;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.database.Cursor;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;


public class Fragment_Modificar extends Fragment {

    private EditText a1,a2,a3,a4,a6;
    private Spinner clas,nom;
    private String a="",b="",c;
    private CheckBox a5;
    private Button g,e;
    private SQLlite sqlite;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_fragment__modificar, container, false);

        a1=(EditText)view.findViewById(R.id.tId);
        clas= (Spinner) view.findViewById(R.id.sClas);

        nom= (Spinner) view.findViewById(R.id.sEspeci);

        a2=(EditText)view.findViewById(R.id.txtFech);

        a3=(EditText)view.findViewById(R.id.txtHa);

        a4=(EditText)view.findViewById(R.id.txtAli);

        a6=(EditText)view.findViewById(R.id.txtNo);

        a5=(CheckBox) view.findViewById(R.id.chSex);

        g=(Button) view.findViewById(R.id.bGuardar);

        e=(Button) view.findViewById(R.id.bBuscar);

        clas.setVisibility(View.INVISIBLE);
        a5.setVisibility(View.INVISIBLE);
        nom.setVisibility(View.INVISIBLE);
        a2.setVisibility(View.INVISIBLE);
        a3.setVisibility(View.INVISIBLE);
        a3.setVisibility(View.INVISIBLE);
        a4.setVisibility(View.INVISIBLE);
        a6.setVisibility(View.INVISIBLE);
        a5.setVisibility(View.INVISIBLE);
        g.setVisibility(View.INVISIBLE);
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

        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (!a1.getText().toString().equals("")){
                    if(sqlite.getCant(Integer.parseInt(a1.getText().toString())).getCount()==1) {
                        clas.setVisibility(View.VISIBLE);
                        nom.setVisibility(View.VISIBLE);
                        a2.setVisibility(View.VISIBLE);
                        a3.setVisibility(View.VISIBLE);
                        a4.setVisibility(View.VISIBLE);
                        a5.setVisibility(View.VISIBLE);
                        a6.setVisibility(View.VISIBLE);
                        g.setVisibility(View.VISIBLE);
                        int f = Integer.parseInt(a1.getText().toString());
                        Cursor cursor = sqlite.getCant(f);
                        String g1 = null, g2 = null, g3 = null, g4 = null;
                        if (cursor.moveToFirst()) {
                            do {
                                g1 = cursor.getString(3);
                                g2 = cursor.getString(5);
                                g3 = cursor.getString(6);
                                g4 = cursor.getString(7);
                            } while (cursor.moveToNext());
                        }
                        a2.setText(g2.toString());
                        a3.setText(g3.toString());
                        a4.setText(g4.toString());
                        a6.setText(g1.toString());
                    }else
                        Toast.makeText(getContext(), "Error: No existe ese ID" +
                                "", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getContext(), "Error: No has puesto un ID" +
                            "", Toast.LENGTH_SHORT).show();
                }
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
                    sqlite.addUpdateProductos(t,a,b,a6.getText().toString().toUpperCase(),c,a2.getText().toString(),
                            a3.getText().toString().toUpperCase(),a4.getText().toString().toUpperCase());
                    //recuperar id del ultimo registtro y pasa como parmetro

                    Toast.makeText(getContext(), "Registro añadido", Toast.LENGTH_SHORT).show();
                    a1.setText("");
                    a2.setText("");
                    a3.setText("");
                    a4.setText("");
                    a6.setText("");

                }else{
                    Toast.makeText(getContext(), "Error: no puede haber campos vacios", Toast.LENGTH_SHORT).show();
                }
            }
        });
        return view;





    }


}
