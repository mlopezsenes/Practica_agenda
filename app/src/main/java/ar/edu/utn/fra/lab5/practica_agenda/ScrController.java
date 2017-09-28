package ar.edu.utn.fra.lab5.practica_agenda;

import android.app.Activity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

import java.util.List;

/**
 * Created by lkdml on 27/09/2017.
 */

public class ScrController implements View.OnClickListener, MenuItem.OnMenuItemClickListener {
    RecyclerView rv ;
    List<Contacto> contactos;
    ControladorPrincipal controlador;

    public ScrController(ControladorPrincipal controlador, Activity actividad,List<Contacto> listaContactos) {
        this.actividad = actividad;
        this.contactos = listaContactos;
        this.controlador = controlador;
        rv = (RecyclerView) actividad.findViewById(R.id.rv1);
        RecyclerView.LayoutManager rvLm = new LinearLayoutManager(actividad.getBaseContext());
        rv.setLayoutManager(rvLm);
        ContactoAdapter ca = new ContactoAdapter(this.controlador);
        rv.setAdapter(ca);

    }

    private Activity actividad;

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        Log.d("scrController:","se hace clic en item"+ item.toString());
        return false;
    }


    @Override
    public void onClick(View v) {
        Log.d("scrController:","se hace clic en item:"+ String.valueOf(v.getId()));
    }
}
