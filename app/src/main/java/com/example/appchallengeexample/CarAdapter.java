package com.example.appchallengeexample;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Shahzaib on 10/20/2017.
 */

public class CarAdapter extends ArrayAdapter<Car>
{

    public CarAdapter(Activity context, ArrayList<Car> cars)
    {
        super(context, 0, cars);
    }


    public View getView(int position, View convertView, ViewGroup parent)
    {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Car currentCar = getItem(position);

        TextView modelTextView = (TextView) listItemView.findViewById(R.id.car_model_text_view);
        TextView makeTextView = (TextView) listItemView.findViewById(R.id.car_make_text_view);
        TextView yearTextView = (TextView) listItemView.findViewById(R.id.car_year_text_view);

        modelTextView.setText(currentCar.getModel());
        makeTextView.setText(currentCar.getMake());
        yearTextView.setText(String.valueOf(currentCar.getYear()));


        return listItemView;
    }

}
