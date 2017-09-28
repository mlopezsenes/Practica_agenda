package ar.edu.utn.fra.lab5.practica_agenda;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by lkdml on 27/09/2017.
 */

public class ConcactoVH extends RecyclerView.ViewHolder implements View.OnCreateContextMenuListener, View.OnLongClickListener {
    TextView nombre;
    TextView apellido;
    TextView telefono;
    TextView email;
    ImageView img;
    int posision;
    public ConcactoVH(View itemView) {
        super(itemView);
        nombre = (TextView) this.itemView.findViewById(R.id.nombre);
        apellido = (TextView) this.itemView.findViewById(R.id.apellido);
        telefono = (TextView) this.itemView.findViewById(R.id.telefono);
        email = (TextView) this.itemView.findViewById(R.id.email);
        img = (ImageView) this.itemView.findViewById(R.id.img);
        itemView.setOnCreateContextMenuListener(this);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        menu.setHeaderTitle("Elija una opcion");
        menu.add(Menu.NONE, v.getId(), Menu.NONE, "Llamar");
        menu.add(Menu.NONE, v.getId(), Menu.NONE, "Enviar Mail");
        menu.add(Menu.NONE, v.getId(), Menu.NONE, "Compartir");
    }




    @Override
    public boolean onLongClick(View v) {
        Log.d("LongClick:",String.valueOf(v.getId()));
        return false;
    }
}
