package com.examplevinhphutvp.fargmentnavigation25022020;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class forgotPasswordFragment extends Fragment {
    View mView;
    EditText mEdtEmail;
    Button mBtnReset,mBtnExit;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_forgot_password, container, false);
        mEdtEmail = mView.findViewById(R.id.edtEmail);
        mBtnExit = mView.findViewById(R.id.edtExitForgot);
        mBtnReset = mView.findViewById(R.id.edtReset);

        mBtnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment
                        .findNavController(forgotPasswordFragment.this)
                        .popBackStack();
            }
        });

        mBtnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment
                        .findNavController(forgotPasswordFragment.this)
                        .popBackStack();
            }
        });
        return mView;
    }
}