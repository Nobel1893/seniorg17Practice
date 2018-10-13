package route.com.practiceg17;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import route.com.practiceg17.Adapters.ContactsListRecyclerAdapter;
import route.com.practiceg17.Model.Contact;

public class ContactsListActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    ContactsListRecyclerAdapter adapter;
    ArrayList<Contact>contacts;
    LinearLayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts_list);
        recyclerView = findViewById(R.id.recycler_view);
        AddContactsData();
        adapter=new ContactsListRecyclerAdapter(contacts);
        recyclerView.setAdapter(adapter);

        layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);
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
