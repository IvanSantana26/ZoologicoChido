package com.example.practica3;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class sql extends SQLiteOpenHelper {
    private static final String  DATABASE="ZOOLOGICO";
    private static final int VERSION=1 ;

    private static final String tprod="CREATE TABLE ANIMALES(ID_PROD INTEGER PRIMARY KEY,"+
            "CLASIFICACION TEXT NOT NULL, ESPECIE TEXT NOT NULL , NOMBRE TEXT NOT NULL,"+
            "SEXO TEXT NOT NULL,FECHA_ING TEX NOT NULL,"+
            "HABITAT TEXT NOT NULL, ALIMENTO TEXT NOT NULL)";

    public sql(Context context)
    {
        super(context,DATABASE,null,VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
   db.execSQL(tprod);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if(newVersion>oldVersion)
        {
            db.execSQL("DROP TABLE IF EXISTS ANIMALES");
            db.execSQL(tprod);
        }

    }
}
