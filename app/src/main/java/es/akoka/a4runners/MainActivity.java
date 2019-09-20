package es.akoka.a4runners;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

import es.akoka.a4runners.fragmentos.FragmentInicio;
import es.akoka.a4runners.interfaces.iComunicaFragments;

public class MainActivity extends AppCompatActivity
        implements FragmentInicio.OnFragmentInteractionListener, iComunicaFragments {

    Fragment v_frInicio = new FragmentInicio();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Mostramos el fragment con el menú ppal.
        getSupportFragmentManager().beginTransaction().replace(R.id.fl_contenedor_menu_principal,v_frInicio).commit();

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    public void IniciarJuego() {
        Toast.makeText(getApplicationContext(),"Se inicia el juego desde la actividad",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void llamaraAjustes() {

    }

    @Override
    public void consultarRanking() {

    }

    @Override
    public void consultarInstrucciones() {

    }

    @Override
    public void gestionarUsuarios() {

    }

    @Override
    public void consultarInformacion() {

    }
}
