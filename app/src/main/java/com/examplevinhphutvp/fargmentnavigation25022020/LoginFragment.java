package com.examplevinhphutvp.fargmentnavigation25022020;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class LoginFragment extends Fragment {
    EditText mEdtTk,mEdtMk;
    Button mBtnForgot,mBtnLogin;
    View mView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       mView = inflater.inflate(R.layout.fragment_login, container, false);

       mBtnForgot = mView.findViewById(R.id.buttonForgot);
       mBtnLogin = mView.findViewById(R.id.buttonLogin);
       mEdtMk = mView.findViewById(R.id.edtPassword);
       mEdtTk = mView.findViewById(R.id.edtAccount);
        mBtnForgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment
                        .findNavController(LoginFragment.this)
                        .navigate(R.id.action_loginFragment_to_forgotPasswordFragment);

            }
        });

        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment
                        .findNavController(LoginFragment.this)
                        .navigate(R.id.action_loginFragment_to_logoutFragment);
            }
        });
       return mView;
    }
}