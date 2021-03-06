package ar.edu.utn.fra.lab5.practica_agenda;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by lkdml on 27/09/2017.
 */

public class ContactoAdapter extends RecyclerView.Adapter<ConcactoVH> {
    Escuchador listener;
    public ContactoAdapter(ControladorPrincipal controlador,Escuchador listener) {
        this.contactos = controlador.getContactos();
        this.controlador = controlador;
        this.listener = listener;
    }

    List<Contacto> contactos;
    ControladorPrincipal controlador;

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    private int position;


    @Override
    public ConcactoVH onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.contacto_holder,parent,false);
        ConcactoVH vh = new ConcactoVH(v,this.listener);

        return vh;
    }

    @Override
    public void onBindViewHolder(final ConcactoVH holder, int position) {
        Contacto c = contactos.get(position);
        holder.nombre.setText(c.getNombre());
        holder.apellido.setText(c.getApellido());
        holder.email.setText(c.getEmail());
        holder.telefono.setText(c.getTelefono());
        //holder.itemView.setOnClickListener(listener);
    }

    @Override
    public int getItemCount() {
        return this.contactos.size();
    }
}
