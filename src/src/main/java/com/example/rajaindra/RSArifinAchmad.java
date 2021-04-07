package com.example.rajaindra;

import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RSArifinAchmad extends ListActivity {
    protected void onCreate (Bundle icircle){
        super.onCreate(icircle);
        String[] listAct = new String[] {"Call Center","SMS Center", "Driving Direction","Website","Info di Google","Exit"};
        this.setListAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listAct));
    }

    protected void onListItemClick (ListView j, View v, int position, long id){
        super.onListItemClick(j, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanpilihan(pilihan);
    }

    private void tampilkanpilihan(String pilihan) {
        try {
            Intent a = null;
            switch (pilihan) {
                case "Call Center":
                    String nomortel = "tel:(0761) 21618";
                    a = new Intent(Intent.ACTION_DIAL, Uri.parse(nomortel));

                    break;
                case "SMS Center":
                    String sms = "Assalammualaikum";
                    a = new Intent(Intent.ACTION_VIEW);
                    a.setData(Uri.parse("sms:08316738"));
                    a.putExtra("sms_body", sms);


                    break;
                case "Driving Direction":
                    String lokasirs = "google.navigation:q=0.4691478,101.3771502";
                    a = new Intent(Intent.ACTION_VIEW, Uri.parse(lokasirs));
                    break;
                case "Website":
                    String website = "http://rsudarifinachmad.riau.go.id";
                    a = new Intent(Intent.ACTION_VIEW, Uri.parse(website));
                    break;
                case "Info di Google":
                    a = new Intent(Intent.ACTION_WEB_SEARCH);
                    a.putExtra(SearchManager.QUERY, "Rumah Sakit Arifin Achmad Pekanbaru");
                    break;
            }
            startActivity(a);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
