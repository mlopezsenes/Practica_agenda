package ar.edu.utn.fra.lab5.practica_agenda;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lkdml on 27/09/2017.
 */

public class ControladorPrincipal {


    public List<Contacto> getContactos() {
        return contactos;
    }

    private List<Contacto> contactos;

    public ControladorPrincipal(Activity actividad) {
        contactos = new ArrayList<Contacto>();
        contactos.add(new Contacto("Mariano","lopez","4444-4444","a@a.com"));
        contactos.add(new Contacto("Mariano Ricardo","lopez","4444-4444","a@a.com"));
        contactos.add(new Contacto("Roberto","lopez","4444-4444","a@a.com"));
        contactos.add(new Contacto("Pancho lara","lopez","4444-4444","a@a.com"));
        contactos.add(new Contacto("Ernesto Casio","lopez","4444-4444","a@a.com"));
        contactos.add(new Contacto("Armando Luis","lopez","4444-4444","a@a.com"));
        contactos.add(new Contacto("Matias","lopez","4444-4444","a@a.com"));
        contactos.add(new Contacto("Lucia","lopez","4444-4444","a@a.com"));
        contactos.add(new Contacto("Diana","lopez","4444-4444","a@a.com"));
        this.scr = new ScrController(this,actividad,this.contactos);




    }

    private Activity actividad;

    public ScrController getScr() {
        return scr;
    }

    public void setScr(ScrController scr) {
        this.scr = scr;
    }

    private ScrController scr;

}
