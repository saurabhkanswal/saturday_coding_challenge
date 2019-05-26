package com.myhexaville.login.login;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.myhexaville.login.R;

public class SignUpFragment extends Fragment implements OnSignUpListener{
    private static final String TAG = "SignUpFragment";
    public SignUpFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        return inflater.inflate(R.layout.fragment_signup, container, false);
    }

    @Override
    public void signUp() {
        Toast.makeText(getContext(), "Sign up", Toast.LENGTH_SHORT).show();
    }
}
