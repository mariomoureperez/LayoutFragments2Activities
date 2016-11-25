package com.mario.layoutfragments;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivity1Fragment extends Fragment {

    public MainActivity1Fragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View layFra=inflater.inflate(R.layout.fragment_main1, container, false);
        Button boton=(Button) layFra.findViewById(R.id.button);
        boton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(getActivity(),MainActivity2.class);
                startActivity(intent);
            }


        });
        return layFra;
    }
}
