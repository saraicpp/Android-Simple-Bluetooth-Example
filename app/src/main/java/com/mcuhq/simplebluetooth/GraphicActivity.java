package com.mcuhq.simplebluetooth;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class GraphicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graphic);

        Fragment newFragment = new RealtimeGraphic();
        FragmentTransaction transaction = getFragmentManager().beginTransaction(); //mi fa muovere
        transaction.replace(R.id.graphic_fragment, newFragment);
        transaction.commit();
    }
}
