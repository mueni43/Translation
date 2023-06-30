package com.example.translation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class customAdapter  extends BaseAdapter {
    private Context context;
    private ArrayList<wordModal>familymembers;

    public customAdapter(Context context, ArrayList<wordModal> familymembers) {
        this.context = context;
        this.familymembers = familymembers;
    }

    @Override
    public int getCount() {
        return familymembers.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(context).inflate(R.layout.listofitems,viewGroup,false);
        TextView english = view.findViewById(R.id.englishword);
        TextView kamba= view.findViewById(R.id.kambaword);
         ImageView image = view.findViewById(R.id.image);


        english.setText(familymembers.get(i).getEnglishword());
        kamba.setText(familymembers.get(i).getKambaword());

        return view;
    }
}
