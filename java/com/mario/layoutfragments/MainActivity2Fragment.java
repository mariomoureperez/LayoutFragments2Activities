package com.mario.layoutfragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import static com.mario.layoutfragments.R.id.fragment2;
import static com.mario.layoutfragments.R.id.textView;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivity2Fragment extends Fragment {

    TextView textView;
    public MainActivity2Fragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View layFra2=inflater.inflate(R.layout.fragment_main2, container, false);
       /* if(getResources().getBoolean(R.bool.landScape)) {
            return layFra2;
        }
        else{

        TextView texto=(TextView) layFra2.findViewById(R.id.textView);
        String str=getActivity().getIntent().getStringExtra("hola");
        texto.setText(str);*/
        textView=(TextView) layFra2.findViewById(R.id.textView);
        return layFra2;//}

    }
    public void recibirTexto(String texto){
        textView.setText(texto);
    }

}