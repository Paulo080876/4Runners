package es.akoka.a4runners.actividades;

import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import es.akoka.a4runners.R;
import es.akoka.a4runners.actividades.ui.main.SectionsPagerAdapter;
import es.akoka.a4runners.fragmentos.FragmentPaso1;
import es.akoka.a4runners.fragmentos.FragmentPaso2;
import es.akoka.a4runners.fragmentos.FragmentPaso3;

public class Activity_Contenedor_instrucciones extends AppCompatActivity
        implements FragmentPaso1.OnFragmentInteractionListener,
        FragmentPaso2.OnFragmentInteractionListener,
        FragmentPaso3.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contenedor_instrucciones);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}