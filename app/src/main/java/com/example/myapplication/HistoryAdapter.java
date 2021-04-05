package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HistoryAdapter extends RecyclerView.Adapter<HistoryAdapter.HistoryViewHolder>{

    private ArrayList<History> listHistory;

    public HistoryAdapter(ArrayList<History> listHistory) {
        this.listHistory = listHistory;
    }

    @NonNull
    @Override
    public HistoryAdapter.HistoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.history_keuangan, parent, false);
        return new HistoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HistoryAdapter.HistoryViewHolder holder, int position) {

        holder.tvPemasukkan.setText(listHistory.get(position).getPemasukkan());
        holder.tvPengeluaran.setText(listHistory.get(position).getPengeluaran());
        holder.tvKeterangan.setText(listHistory.get(position).getKeterangan());

    }

    @Override
    public int getItemCount() {
        return (listHistory!= null) ? listHistory.size() : 0;
    }

    public class HistoryViewHolder extends RecyclerView.ViewHolder {

        private TextView tvPemasukkan, tvPengeluaran, tvKeterangan;

        public HistoryViewHolder (View view){
            super(view);

            tvPemasukkan = view.findViewById(R.id.tvPemasukkan);
            tvPengeluaran = view.findViewById(R.id.tvPengeluaran);
            tvKeterangan = view.findViewById(R.id.tvKeterangan);


        }
    }
}
