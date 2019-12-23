package com.example.tugas2.Controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.tugas2.Adapter.nasabahAdapter;
import com.example.tugas2.Model.Nasabah;
import com.example.tugas2.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView namaNasabahLv;
    TextView ioTv;
    private List<Nasabah> ListNasabah;
    nasabahAdapter nasabahAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById();
        onClickGroup();
        initData();
    }
    void findViewById() {
        namaNasabahLv = (ListView) findViewById(R.id.namaNasabahLv);
        ioTv = (TextView) findViewById(R.id.ioTv);
    }

    void onClickGroup(){
        ioTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ListNasabah.clear();
                Nasabah newNasabah = new Nasabah();
                newNasabah.setNama("Cash");
                newNasabah.setTanggal("14 Des 2019");
                newNasabah.setUang("8,100,000");
                newNasabah.setProses("Outgoing");
                newNasabah.setPhoto(R.drawable.cash);
                ListNasabah.add(newNasabah);

                newNasabah = new Nasabah();
                newNasabah.setNama("CashBack MONYAY");
                newNasabah.setTanggal("2 Des 2019");
                newNasabah.setUang("+6,500");
                newNasabah.setProses("Incomming");
                newNasabah.setPhoto(R.drawable.cashback);
                ListNasabah.add(newNasabah);

                newNasabah = new Nasabah();
                newNasabah.setNama("Interest");
                newNasabah.setTanggal("1 Des 2019");
                newNasabah.setUang("+1");
                newNasabah.setProses("Incomming");
                newNasabah.setPhoto(R.drawable.social);
                ListNasabah.add(newNasabah);

                nasabahAdapter.notifyDataSetChanged();
            }
        });
    }
    void initData(){
        ListNasabah = new ArrayList();
        ListNasabah.clear();
        nasabahAdapter = new nasabahAdapter(getApplicationContext(), ListNasabah);
        namaNasabahLv.setAdapter(nasabahAdapter);
        nasabahAdapter.notifyDataSetChanged();
    }


}
