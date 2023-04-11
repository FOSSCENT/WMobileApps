package com.sulthanhanif.listviewactivity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity{
    ListView listView;
    Spinner combo;

    public String Nama_Negara[] = {"Australia", "Indonesia", "Sunda Empire", "Jepang", "Amerika Serikat", "Jerman"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listNegara);
        combo = (Spinner) findViewById(R.id.comboNegara);

        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,Nama_Negara);
        listView.setAdapter(adapter);
        combo.setAdapter(adapter);
    }
}