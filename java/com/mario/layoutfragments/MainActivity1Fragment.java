package com.mario.layoutfragments;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivity1Fragment extends Fragment {

    public MainActivity1Fragment() {
    }

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View layFra=inflater.inflate(R.layout.fragment_main1, container, false);
        Button boton=(Button) layFra.findViewById(R.id.button);
        boton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(getResources().getBoolean(R.bool.landScape)){
                    Toast.makeText(getActivity(),"Esto es un LandScape con dos fragments", Toast.LENGTH_LONG).show();

                }else{
                Intent intent=new Intent(getActivity(),MainActivity2.class);
                intent.putExtra("hola","Mensaje desde la Activity1");
                startActivity(intent);}
            }


        });
        return layFra;
    }
}
