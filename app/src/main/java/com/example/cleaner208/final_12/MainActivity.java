package com.example.cleaner208.final_12;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.cleaner208.final_12.Words.WordsContent;

public class MainActivity extends AppCompatActivity implements ItemFragment.OnListFragmentInteractionListener,DetailFragment.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public void onListFragmentInteraction(WordsContent.WordItem wordItem) {
        Bundle arguments =new Bundle();
        arguments.putString("id",wordItem.id);
        DetailFragment fragment=new DetailFragment();
        fragment.setArguments(arguments);
        getFragmentManager().beginTransaction().replace(R.id.worddetail,fragment).commit();

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
