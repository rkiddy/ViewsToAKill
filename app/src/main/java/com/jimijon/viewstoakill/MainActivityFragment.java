package com.jimijon.viewstoakill;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        TextView button = (Button)rootView.findViewById(R.id.button_go);

        button.setOnClickListener(new Button.OnClickListener() {

            public void onClick(View v) {

                Fragment nextFragment = new NextActivityFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();

                transaction.replace(R.id.fragment_container, nextFragment);
                transaction.addToBackStack(null);

                transaction.commit();
            }
        });

        return rootView;
    }
}
