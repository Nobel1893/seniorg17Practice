package route.com.practiceg17.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import route.com.practiceg17.Model.Car;
import route.com.practiceg17.R;

/**
 * Created by Mohamed Nabil Mohamed (Nobel) on 10/13/2018.
 * byte code SA
 * m.nabil.fci2015@gmail.com
 */
public class CarsListRecyclerAdapter extends RecyclerView.Adapter<CarsListRecyclerAdapter.ViewHolder> {

    ArrayList<Car> items;

    public CarsListRecyclerAdapter(ArrayList<Car> items) {
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

        Car carItem= items.get(position);



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
            name= view.findViewById(R.id.carImage);
            phone = view.findViewById(R.id.phone);
            image= view.findViewById(R.id.image);

        }

    }
}
