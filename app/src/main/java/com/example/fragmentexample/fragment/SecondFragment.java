package com.example.fragmentexample.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fragmentexample.R;


public class SecondFragment extends Fragment {

    private OnFragmentInteractionListener mListener;

    public SecondFragment() {
        // Required empty public constructor
    }


    public static SecondFragment newInstance(String param1, String param2) {
        SecondFragment fragment = new SecondFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        System.out.println( "======================== SecondFragment onCreate function ========================" );
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        System.out.println( "======================== SecondFragment onCreateView function ========================" );
        return inflater.inflate( R.layout.fragment_second, container, false );
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction( uri );
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach( context );
        System.out.println( "======================== SecondFragment onAttach function ========================" );
    }

    @Override
    public void onDetach() {
        super.onDetach();
        System.out.println( "======================== SecondFragment onDetach function ========================" );
        mListener = null;
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        System.out.println( "======================== SecondFragment onDestroy function ========================" );
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
