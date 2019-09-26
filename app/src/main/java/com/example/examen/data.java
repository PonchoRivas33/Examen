package com.example.examen;

import java.util.ArrayList;

public class data {
    public static ArrayList<ListViewItem> provideItems(){
        ArrayList list = new ArrayList<ListViewItem>();
        list.add(new ListViewItem(R.drawable.a1,"Holo blue bright"));
        list.add(new ListViewItem(R.drawable.a2,"Holo blue light"));
        list.add(new ListViewItem(R.drawable.a3,"Holo green light"));
        list.add(new ListViewItem(R.drawable.a4,"“Holo orange light"));
        list.add(new ListViewItem(R.drawable.a5,"“Holo red light"));
        list.add(new ListViewItem(R.drawable.a6,"“Holo purple"));
        list.add(new ListViewItem(R.drawable.a7,"“Holo blue dark"));
        list.add(new ListViewItem(R.drawable.a8,"“Holo green dark"));
        list.add(new ListViewItem(R.drawable.a9,"“Holo red dark"));
        list.add(new ListViewItem(R.drawable.a10,"Holo orange dark"));

        return list;
    }
}
