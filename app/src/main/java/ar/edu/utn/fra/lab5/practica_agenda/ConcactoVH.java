package ar.edu.utn.fra.lab5.practica_agenda;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by lkdml on 27/09/2017.
 */

public class ConcactoVH extends RecyclerView.ViewHolder implements View.OnCreateContextMenuListener, View.OnLongClickListener, View.OnClickListener{
    TextView nombre;
    TextView apellido;
    TextView telefono;
    TextView email;
    ImageView img;
    Button btn ;
    Escuchador listener;

    public ConcactoVH(View itemView, Escuchador listener) {
        super(itemView);
        nombre = (TextView) this.itemView.findViewById(R.id.nombre);
        apellido = (TextView) this.itemView.findViewById(R.id.apellido);
        telefono = (TextView) this.itemView.findViewById(R.id.telefono);
        email = (TextView) this.itemView.findViewById(R.id.email);
        img = (ImageView) this.itemView.findViewById(R.id.img);
        btn = (Button) this.itemView.findViewById(R.id.llamar);
        btn.setOnClickListener(this);
        this.listener = listener;
        itemView.setOnCreateContextMenuListener(this);
        //itemView.setOnClickListener(this);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        menu.setHeaderTitle("Elija una opcion");
        menu.add(0, getAdapterPosition(), 0, "Llamar");
        menu.add(1, getAdapterPosition(), 1, "Enviar Mail");
        menu.add(2, getAdapterPosition(), 2, "Compartir");

    }

    @Override
    public void onClick(View v) {
        listener.onItemClick(getAdapterPosition());
    }


    @Override
    public boolean onLongClick(View v) {
        listener.onItemClick(getAdapterPosition());
        Log.d("LongClick:",String.valueOf(v.getId()));
        return false;
    }

}
