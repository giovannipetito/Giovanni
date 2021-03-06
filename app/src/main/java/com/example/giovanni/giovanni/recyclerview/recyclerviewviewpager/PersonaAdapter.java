package com.example.giovanni.giovanni.recyclerview.recyclerviewviewpager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.giovanni.giovanni.R;
import com.example.giovanni.giovanni.customview.CustomButton;
import com.example.giovanni.giovanni.bean.Persona;

import java.util.List;

public class PersonaAdapter extends RecyclerView.Adapter<PersonaAdapter.ViewHolder> {

    private List<Persona> list;
    private final OnItemViewClicked onItemViewClicked;

    PersonaAdapter(OnItemViewClicked onItemViewClicked, List<Persona> list) {
        this.onItemViewClicked = onItemViewClicked;
        this.list = list;
    }

    public void setList(List<Persona> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(viewType, parent, false);
        return new ViewHolder(view);
    }

    // In holder è passato l'oggetto viewHolder del metodo onCreateViewHolder().
    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        final Persona persona = list.get(position);
        String name = persona.getNome() + " " + persona.getCognome();
        String msisdn = String.valueOf(persona.getNumero());
        holder.nome.setText(name);
        holder.numero.setText(msisdn);

        // Se scrivo holder.customButton, il listener è associato solo al CustomButton.
        // Se scrivo holder.nome, il listener è associato solo al nome.
        // Se scrivo holder.numero, il listener è associato solo al numero.
        // Se scrivo holder.itemView, il listener è associato all'intero item della RecyclerView.
        holder.customButton.setOnClickListener(v -> {
            // onItemClicked() è il metodo dell'interfaccia OnItemViewClicked
            onItemViewClicked.onItemClicked(persona, position);
        });
    }

    @Override
    public int getItemViewType(int position) {
        return R.layout.row_persona;
    }

    @Override
    public int getItemCount() {
        if (list == null) {
            return 0;
        } else {
            return list.size();
        }
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private final CustomButton customButton;
        private final TextView nome;
        private final TextView numero;

        public ViewHolder(View view) {
            super(view);
            customButton = view.findViewById(R.id.custombutton);
            nome = view.findViewById(R.id.text_nome);
            numero = view.findViewById(R.id.text_numero);
        }
    }
}