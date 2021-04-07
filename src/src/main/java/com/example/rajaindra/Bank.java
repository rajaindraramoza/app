package com.example.rajaindra;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Bank extends ListActivity {
    protected void onCreate (Bundle icircle){
        super.onCreate(icircle);
        String[] listBank = new String[] {"SMAN Plus Pekanbaru"};
        this.setListAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listBank));
    }

    protected void onListItemClick (ListView l,  View v, int position, long id){
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanpilihan(pilihan);
    }

    private void tampilkanpilihan(String pilihan) {
        try {
            Intent a = null;
            if (pilihan.equals("Bank BRI")){
                a = new Intent(this,BankBRI.class);

            }

            startActivity(a);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }


}