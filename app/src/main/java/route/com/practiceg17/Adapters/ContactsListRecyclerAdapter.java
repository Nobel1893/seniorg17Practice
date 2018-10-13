package route.com.practiceg17.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import route.com.practiceg17.Model.Contact;
import route.com.practiceg17.R;

/**
 * Created by Mohamed Nabil Mohamed (Nobel) on 10/13/2018.
 * byte code SA
 * m.nabil.fci2015@gmail.com
 */
public class ContactsListRecyclerAdapter extends RecyclerView.Adapter<ContactsListRecyclerAdapter.ViewHolder> {

    ArrayList<Contact> items;

    public ContactsListRecyclerAdapter(ArrayList<Contact> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //first create view
        View view =LayoutInflater.from(parent.getContext())
                .inflate(R.layout.contact_item_view,parent,false);

        //create view Holder
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        //get data of postition

        Contact contactItem= items.get(position);

        holder.name.setText(contactItem.getName());
        holder.phone.setText(contactItem.getPhone());
//        holder.image.setText(contactItem.getPhone());


    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        TextView name;
        TextView phone;
        ImageView image;

       public ViewHolder(View view){
            super(view);
            name= view.findViewById(R.id.name);
            phone = view.findViewById(R.id.phone);
            image= view.findViewById(R.id.image);

        }

    }
}
