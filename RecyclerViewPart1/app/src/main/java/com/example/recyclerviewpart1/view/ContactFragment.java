package com.example.recyclerviewpart1.view;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.recyclerviewpart1.R;
import com.example.recyclerviewpart1.model.Contact;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ContactFragment extends Fragment {

    View view;
    private RecyclerView recyclerViewContacts;
    private List<Contact> contactList;

    public ContactFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_contact, container, false);

        recyclerViewContacts = view.findViewById(R.id.ContactFragment_RecyclerView_Contacts);
        AdapterRecyclerView adapterRecyclerView = new AdapterRecyclerView(getContext(), contactList);
        recyclerViewContacts.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerViewContacts.setAdapter(adapterRecyclerView);

        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        contactList = new ArrayList<>();

        contactList.add(new Contact("Ariana Grande","(111) 87657545645", R.drawable.astroboy));
        contactList.add(new Contact("Rubio Crown","(432) 243424", R.drawable.auto));
        contactList.add(new Contact("Selena Gomez","(432) 543534543", R.drawable.city));
        contactList.add(new Contact("Taylor Swift","(432) 1224325345", R.drawable.colores));
        contactList.add(new Contact("Zayn clow","(432) 6453623563", R.drawable.facebook));
        contactList.add(new Contact("Eduard Colem","(111) 432453243", R.drawable.mono));
        contactList.add(new Contact("Santiago Gonzalez","(432) 5363734525", R.drawable.moxila));
        contactList.add(new Contact("Noelia Michellini","(432) 534634535", R.drawable.murcielago));
        contactList.add(new Contact("Coqui","(435) 5465454334", R.drawable.perrito));
        contactList.add(new Contact("Delfi","(432) 4342343242", R.drawable.playa));
        contactList.add(new Contact("Ariana Grande","(111) 87657545645", R.drawable.astroboy));
        contactList.add(new Contact("Rubio Crown","(432) 243424", R.drawable.auto));
        contactList.add(new Contact("Selena Gomez","(432) 543534543", R.drawable.city));
        contactList.add(new Contact("Taylor Swift","(432) 1224325345", R.drawable.colores));
        contactList.add(new Contact("Zayn clow","(432) 6453623563", R.drawable.facebook));
        contactList.add(new Contact("Eduard Colem","(111) 432453243", R.drawable.mono));
        contactList.add(new Contact("Santiago Gonzalez","(432) 5363734525", R.drawable.moxila));
        contactList.add(new Contact("Noelia Michellini","(432) 534634535", R.drawable.murcielago));
        contactList.add(new Contact("Coqui","(435) 5465454334", R.drawable.perrito));
        contactList.add(new Contact("Delfi","(432) 4342343242", R.drawable.playa));
        contactList.add(new Contact("Ariana Grande","(111) 87657545645", R.drawable.astroboy));
        contactList.add(new Contact("Rubio Crown","(432) 243424", R.drawable.auto));
        contactList.add(new Contact("Selena Gomez","(432) 543534543", R.drawable.city));
        contactList.add(new Contact("Taylor Swift","(432) 1224325345", R.drawable.colores));
        contactList.add(new Contact("Zayn clow","(432) 6453623563", R.drawable.facebook));
        contactList.add(new Contact("Eduard Colem","(111) 432453243", R.drawable.mono));
        contactList.add(new Contact("Santiago Gonzalez","(432) 5363734525", R.drawable.moxila));
        contactList.add(new Contact("Noelia Michellini","(432) 534634535", R.drawable.murcielago));
        contactList.add(new Contact("Coqui","(435) 5465454334", R.drawable.perrito));
        contactList.add(new Contact("Delfi","(432) 4342343242", R.drawable.playa));
        contactList.add(new Contact("Ariana Grande","(111) 87657545645", R.drawable.astroboy));
        contactList.add(new Contact("Rubio Crown","(432) 243424", R.drawable.auto));
        contactList.add(new Contact("Selena Gomez","(432) 543534543", R.drawable.city));
        contactList.add(new Contact("Taylor Swift","(432) 1224325345", R.drawable.colores));
        contactList.add(new Contact("Zayn clow","(432) 6453623563", R.drawable.facebook));
        contactList.add(new Contact("Eduard Colem","(111) 432453243", R.drawable.mono));
        contactList.add(new Contact("Santiago Gonzalez","(432) 5363734525", R.drawable.moxila));
        contactList.add(new Contact("Noelia Michellini","(432) 534634535", R.drawable.murcielago));
        contactList.add(new Contact("Coqui","(435) 5465454334", R.drawable.perrito));
        contactList.add(new Contact("Delfi","(432) 4342343242", R.drawable.playa));
        contactList.add(new Contact("Ariana Grande","(111) 87657545645", R.drawable.astroboy));
        contactList.add(new Contact("Rubio Crown","(432) 243424", R.drawable.auto));
        contactList.add(new Contact("Selena Gomez","(432) 543534543", R.drawable.city));
        contactList.add(new Contact("Taylor Swift","(432) 1224325345", R.drawable.colores));
        contactList.add(new Contact("Zayn clow","(432) 6453623563", R.drawable.facebook));
        contactList.add(new Contact("Eduard Colem","(111) 432453243", R.drawable.mono));
        contactList.add(new Contact("Santiago Gonzalez","(432) 5363734525", R.drawable.moxila));
        contactList.add(new Contact("Noelia Michellini","(432) 534634535", R.drawable.murcielago));
        contactList.add(new Contact("Coqui","(435) 5465454334", R.drawable.perrito));
        contactList.add(new Contact("Delfi","(432) 4342343242", R.drawable.playa));
        contactList.add(new Contact("Ariana Grande","(111) 87657545645", R.drawable.astroboy));
        contactList.add(new Contact("Rubio Crown","(432) 243424", R.drawable.auto));
        contactList.add(new Contact("Selena Gomez","(432) 543534543", R.drawable.city));
        contactList.add(new Contact("Taylor Swift","(432) 1224325345", R.drawable.colores));
        contactList.add(new Contact("Zayn clow","(432) 6453623563", R.drawable.facebook));
        contactList.add(new Contact("Eduard Colem","(111) 432453243", R.drawable.mono));
        contactList.add(new Contact("Santiago Gonzalez","(432) 5363734525", R.drawable.moxila));
        contactList.add(new Contact("Noelia Michellini","(432) 534634535", R.drawable.murcielago));
        contactList.add(new Contact("Coqui","(435) 5465454334", R.drawable.perrito));
        contactList.add(new Contact("Delfi","(432) 4342343242", R.drawable.playa));
        contactList.add(new Contact("Ariana Grande","(111) 87657545645", R.drawable.astroboy));
        contactList.add(new Contact("Rubio Crown","(432) 243424", R.drawable.auto));
        contactList.add(new Contact("Selena Gomez","(432) 543534543", R.drawable.city));
        contactList.add(new Contact("Taylor Swift","(432) 1224325345", R.drawable.colores));
        contactList.add(new Contact("Zayn clow","(432) 6453623563", R.drawable.facebook));
        contactList.add(new Contact("Eduard Colem","(111) 432453243", R.drawable.mono));
        contactList.add(new Contact("Santiago Gonzalez","(432) 5363734525", R.drawable.moxila));
        contactList.add(new Contact("Noelia Michellini","(432) 534634535", R.drawable.murcielago));
        contactList.add(new Contact("Coqui","(435) 5465454334", R.drawable.perrito));
        contactList.add(new Contact("Delfi","(432) 4342343242", R.drawable.playa));
        contactList.add(new Contact("Ariana Grande","(111) 87657545645", R.drawable.astroboy));
        contactList.add(new Contact("Rubio Crown","(432) 243424", R.drawable.auto));
        contactList.add(new Contact("Selena Gomez","(432) 543534543", R.drawable.city));
        contactList.add(new Contact("Taylor Swift","(432) 1224325345", R.drawable.colores));
        contactList.add(new Contact("Zayn clow","(432) 6453623563", R.drawable.facebook));
        contactList.add(new Contact("Eduard Colem","(111) 432453243", R.drawable.mono));
        contactList.add(new Contact("Santiago Gonzalez","(432) 5363734525", R.drawable.moxila));
        contactList.add(new Contact("Noelia Michellini","(432) 534634535", R.drawable.murcielago));
        contactList.add(new Contact("Coqui","(435) 5465454334", R.drawable.perrito));
        contactList.add(new Contact("Delfi","(432) 4342343242", R.drawable.playa));
        contactList.add(new Contact("Ariana Grande","(111) 87657545645", R.drawable.astroboy));
        contactList.add(new Contact("Rubio Crown","(432) 243424", R.drawable.auto));
        contactList.add(new Contact("Selena Gomez","(432) 543534543", R.drawable.city));
        contactList.add(new Contact("Taylor Swift","(432) 1224325345", R.drawable.colores));
        contactList.add(new Contact("Zayn clow","(432) 6453623563", R.drawable.facebook));
        contactList.add(new Contact("Eduard Colem","(111) 432453243", R.drawable.mono));
        contactList.add(new Contact("Santiago Gonzalez","(432) 5363734525", R.drawable.moxila));
        contactList.add(new Contact("Noelia Michellini","(432) 534634535", R.drawable.murcielago));
        contactList.add(new Contact("Coqui","(435) 5465454334", R.drawable.perrito));
        contactList.add(new Contact("Delfi","(432) 4342343242", R.drawable.playa));
        contactList.add(new Contact("Ariana Grande","(111) 87657545645", R.drawable.astroboy));
        contactList.add(new Contact("Rubio Crown","(432) 243424", R.drawable.auto));
        contactList.add(new Contact("Selena Gomez","(432) 543534543", R.drawable.city));
        contactList.add(new Contact("Taylor Swift","(432) 1224325345", R.drawable.colores));
        contactList.add(new Contact("Zayn clow","(432) 6453623563", R.drawable.facebook));
        contactList.add(new Contact("Eduard Colem","(111) 432453243", R.drawable.mono));
        contactList.add(new Contact("Santiago Gonzalez","(432) 5363734525", R.drawable.moxila));
        contactList.add(new Contact("Noelia Michellini","(432) 534634535", R.drawable.murcielago));
        contactList.add(new Contact("Coqui","(435) 5465454334", R.drawable.perrito));
        contactList.add(new Contact("Delfi","(432) 4342343242", R.drawable.playa));


    }
}
