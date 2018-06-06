package com.example.wel.dbit_mis_master;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.ListView;

/**
 * Created by Wel on 6/4/2018.
 */

@RequiresApi(api = Build.VERSION_CODES.M)
public class AttendanceFragment extends android.support.v4.app.Fragment{
    private ViewStructure intent;

    ListView list;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_attendance,container,false);







    }

//    Bundle b = getIntent().getExtras();
//
//    private ViewStructure getIntent() {
//        return null;
//    }
//
//    String fname = b.getString("Aname");
//    String fnumber = b.getString("Anumber");






}
