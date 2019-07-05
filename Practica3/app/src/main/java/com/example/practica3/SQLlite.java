package com.example.practica3;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.text.Editable;
import android.util.Log;

import java.util.ArrayList;

public class SQLlite {
    private sql sql;
    private SQLiteDatabase db;
    public SQLlite(Context context) {
        sql = new sql(context);

    }

    public  SQLlite(){

    }

    public void abrir()
    {
        Log.i("SQLite","se abre conexion a la base de datos"+ sql.getDatabaseName());
        db=sql.getWritableDatabase();
    }
    public void cerrar()
    {
        Log.i("SQLite","se cierra conexion a la base de datos"+ sql.getDatabaseName());
        sql.close();
    }

    public boolean addRegistroProductos(int id, String clas, String esp, String nom, String sexo, String fecha, String hab, String ali ){
        ContentValues cv=new ContentValues();
        cv.put("ID_PROD",id);
        cv.put("CLASIFICACION",clas);
        cv.put("ESPECIE",esp);
        cv.put("NOMBRE",nom);
        cv.put("SEXO",sexo);
        cv.put("FECHA_ING",fecha);
        cv.put("HABITAT",hab);
        cv.put("ALIMENTO",ali);
     return (db.insert("ANIMALES",null,cv)!=-1)?true:false;

    }
    public Cursor getRegistroProductos()
    {
        return db.rawQuery("SELECT * FROM ANIMALES", null);
    }

    public ArrayList<String> getPROD( Cursor cur)
    {
        ArrayList<String> listData= new ArrayList<String>();
        String item="";
        if (cur.moveToFirst())
        {
            do
                {
                    item+="ID: ["+cur.getInt(0)+"]\r\n";
                    item+="Clasificacion:"+ cur.getString(1)+ "\r\n";
                    item+="Especie:"+ cur.getString(2)+ "\r\n";
                    item+="Nombre:"+ cur.getString(3)+ "\r\n";
                    item+="Sexo:"+ cur.getString(4)+ "\r\n";
                    item+="Fecha_Ing:"+ cur.getString(5)+ "\r\n";
                    item+="Habitat:"+ cur.getString(6)+ "\r\n";
                    item+="Alimentacion:"+ cur.getString(7)+ "\r\n";
                    listData.add(item);
                    item="";
                }while(cur.moveToNext());
            } return listData;
        }

        public ArrayList<String> getID(Cursor cur)
        {
            ArrayList<String> listData=new ArrayList<String>();
            String item="";
            if(cur.moveToFirst()){
                do{
                    item+="ID: ["+cur.getInt(0)+"]\r\n";
                    item="";

                }while (cur.moveToNext());
            }return listData;
        }

    public String addUpdateProductos(int id, String clas, String esp, String nom, String sexo, String fecha, String hab, String ali ){
        ContentValues registro=new ContentValues();
        registro.put("ID_PROD",id);
        registro.put("CLASIFICACION",clas);
        registro.put("ESPECIE",esp);
        registro.put("NOMBRE",nom);
        registro.put("SEXO",sexo);
        registro.put("FECHA_ING",fecha);
        registro.put("HABITAT",hab);
        registro.put("ALIMENTO",ali);
        int cant=db.update("ANIMALES",
        registro,"ID_PROD="+id, null);
       if(cant==1)
       {
           return "Usuario Mod";

       }
       else
           return "Fallo algo";

    }
    public Cursor getCant(int id)
    {
        return db.rawQuery("SELECT * FROM ANIMALES WHERE ID_PROD="+id, null);
    }
    public int Eliminar(Editable id)
    {
        return db.delete("ANIMALES","ID_PROD="+id,null);
    }
    }



