package com.example.tugas2.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tugas2.Model.Nasabah;
import com.example.tugas2.R;

import java.util.List;

public class nasabahAdapter extends BaseAdapter {
    Context context;
    private List<Nasabah> list;

    public nasabahAdapter(Context context, List<Nasabah> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
    if(convertView == null){
        LayoutInflater inflater = LayoutInflater.from(this.context);
        convertView = inflater.inflate(R.layout.itemnasabah_activity,null);
    }
    Nasabah nasabah = list.get(position);
    TextView namaTextView =(TextView) convertView.findViewById(R.id.Tvnama);
    TextView lokasiTextView =(TextView) convertView.findViewById(R.id.Tvtanggal);
    TextView uangTextView =(TextView) convertView.findViewById(R.id.Tvuang);
    TextView prosesTextView =(TextView) convertView.findViewById(R.id.Tvproses);
        ImageView photoImageView=(ImageView) convertView.findViewById(R.id.img);

        namaTextView.setText(nasabah.getNama());
        lokasiTextView.setText(nasabah.getTanggal());
        uangTextView.setText(nasabah.getUang());
        prosesTextView.setText(nasabah.getProses());
        photoImageView.setImageResource(nasabah.getPhoto());

        return convertView;

}
}
