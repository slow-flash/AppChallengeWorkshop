package com.example.appchallengeexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car("Honda", "Civic", 2015));
        cars.add(new Car("Honda", "Accord", 2016));
        cars.add(new Car("Toyota", "Corrola", 2017));
        cars.add(new Car("Toyota", "Camry", 2003));
        cars.add(new Car("Hyundai", "Elantra", 2012));
        cars.add(new Car("Hyundai", "Sonata", 2018));


        CarAdapter carAdapter  = new CarAdapter(this, cars);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(carAdapter);
    }
}
