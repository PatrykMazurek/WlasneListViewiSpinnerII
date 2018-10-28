package com.example.patryyyk21.wlasnelistviewispinnerii;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    SimpleAdapter countrySimpleAdapter;
    ArrayList<HashMap<String, String>> countryList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // przypisanie id kontrolek
        ListView listViewCountry = (ListView)findViewById(R.id.lv_ListCountry);
        Spinner spinnerCountry = (Spinner)findViewById(R.id.s_ListCountry);
        // przygotowanie danych
        Country[] tempCountry = {new Country("Francja)", R.drawable.flag_of_france),
                new Country("Hiszpania", R.drawable.flag_of_spain),
                new Country("Polska", R.drawable.flag_of_poland)};

        // przygotowywanie danych do wyświetlenia
        HashMap<String, String> item;
        for(int i =0; i<tempCountry.length;i++){
            item = new HashMap<String, String>();
            item.put("iv_Flag", tempCountry[i].getCountryFlag()+"");
            item.put("tv_Name", tempCountry[i].getCountryName());
            countryList.add(item);
        }

        countrySimpleAdapter = new SimpleAdapter(getApplicationContext(),
                countryList,  // dane do zamieszczenia w liście
                R.layout.my_view, // własny przygotowany widok
                new String[] {"iv_Flag", "tv_Name"}, // z których kluczy pobierać dane
                new int[] {R.id.iv_Flag, R.id.tv_Name} ); // do których komurek umieszczać dane

        // przypisanie adaptera do konkretnej kontrolki
        listViewCountry.setAdapter(countrySimpleAdapter);
        //spinnerCountry.setAdapter(countrySimpleAdapter);
    }
}
