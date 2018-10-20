package route.com.practiceg17;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

import route.com.practiceg17.Adapters.ContactsListRecyclerAdapter;
import route.com.practiceg17.Model.Contact;

/**
 * A simple {@link Fragment} subclass.
 */
public class ContactsFragment extends Fragment {


    public ContactsFragment() {
        // Required empty public constructor
    }


    RecyclerView recyclerView;
    ContactsListRecyclerAdapter adapter;
    ArrayList<Contact> contacts;
    LinearLayoutManager layoutManager;

    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_contacts, container, false);

        recyclerView = view.findViewById(R.id.recycler_view);
        AddContactsData();
        adapter=new ContactsListRecyclerAdapter(contacts);
        adapter.setOnImageClickListener(new ContactsListRecyclerAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position, Contact contact) {
                Toast.makeText(getActivity(), "user clicked on Image", Toast.LENGTH_SHORT).show();
            }
        });
        /*adapter.setOnNameClickListener(new ContactsListRecyclerAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position, Contact contact) {
                Toast.makeText(getActivity(), "user clicked on Name", Toast.LENGTH_SHORT).show();
            }
        });
*/
        recyclerView.setAdapter(adapter);

//        layoutManager = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);




        return view;
    }


    void AddContactsData(){
        contacts= new ArrayList<>();
        contacts.add(new Contact("Mohmamed","1287653",0));
        contacts.add(new Contact("Ahmed","164745623",0));
        contacts.add(new Contact("Amr","1435323",0));
        contacts.add(new Contact("Ibrahim","112323",0));
        contacts.add(new Contact("sayed","123",0));
        contacts.add(new Contact("hasan","123werw",0));
        contacts.add(new Contact("Mohmamed","156523",0));
        contacts.add(new Contact("Mohmamed","1werw23423",0));
        contacts.add(new Contact("Mohmamed","1werw23423",0));
        contacts.add(new Contact("Mohmamed","1werw23423",0));
        contacts.add(new Contact("Mohmamed","1werw23423",0));
        contacts.add(new Contact("Mohmamed","1werw23423",0));
        contacts.add(new Contact("Mohmamed","1werw23423",0));
        contacts.add(new Contact("Mohmamed","1werw23423",0));
        contacts.add(new Contact("Mohmamed","1werw23423",0));
        contacts.add(new Contact("Mohmamed","1werw23423",0));
        contacts.add(new Contact("Mohmamed","1werw23423",0));
        contacts.add(new Contact("Mohmamed","1werw23423",0));
        contacts.add(new Contact("Mohmamed","1werw23423",0));
        contacts.add(new Contact("Mohmamed","1werw23423",0));
        contacts.add(new Contact("Mohmamed","1werw23423",0));
        contacts.add(new Contact("Mohmamed","1werw23423",0));
        contacts.add(new Contact("Mohmamed","1werw23423",0));
        contacts.add(new Contact("Mohmamed","1werw23423",0));
        contacts.add(new Contact("Mohmamed","1werw23423",0));
        contacts.add(new Contact("Mohmamed","1werw23423",0));
    }
}

