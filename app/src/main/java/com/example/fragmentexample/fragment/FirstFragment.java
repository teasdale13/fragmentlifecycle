package com.example.fragmentexample.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fragmentexample.R;


public class FirstFragment extends Fragment {

    private OnFragmentInteractionListener mListener;

    public FirstFragment() {
        // Required empty public constructor
    }

    public static FirstFragment newInstance() {
        FirstFragment fragment = new FirstFragment();
        return fragment;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        System.out.println( "======================== FirstFragment onDestroy function ========================" );
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        System.out.println( "======================== FirstFragment onCreate function ========================" );
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        System.out.println( "======================== FirstFragment onCreateView function ========================" );
        return inflater.inflate( R.layout.fragment_first, container, false );
    }

    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction( uri );
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach( context );
        System.out.println( "======================== FirstFragment onAttach function ========================" );
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
        System.out.println( "======================== FirstFragment onDetach function ========================" );
    }

    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(Uri uri);
    }
}
