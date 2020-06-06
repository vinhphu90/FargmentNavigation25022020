package com.examplevinhphutvp.fargmentnavigation25022020;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class LogoutFragment extends Fragment {
View mView;
Button mBtnLogout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         mView=inflater.inflate(R.layout.fragment_logout, container, false);
         mBtnLogout = mView.findViewById(R.id.buttonLogout);
        return mView;
    }
}