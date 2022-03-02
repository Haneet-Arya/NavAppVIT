package edu.vit.vtop.navapp.Recyclerview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import edu.vit.vtop.navapp.Activity.HomeActivity;
import edu.vit.vtop.navapp.Activity.NavigationActivity;
import edu.vit.vtop.navapp.R;
import edu.vit.vtop.navapp.Utils.DataModel;

public class PlacesAdapter extends RecyclerView.Adapter<PlacesAdapter.MyViewHolder> {
    List<DataModel> list;
    Context context;

    public PlacesAdapter(List<DataModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.places_item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, @SuppressLint("RecyclerView") int position) {
        DataModel model = list.get(position);
        holder.placeName.setText(model.getName());
        holder.categoryName.setText(model.getCategory());
        if(model.getCategory().equals("Academic Blocks")){
            holder.categoryName.setTextColor(ContextCompat.getColor(context,R.color.academic));
            holder.icon.setImageResource(R.drawable.ic_academic);
            holder.categories.setCardBackgroundColor(ContextCompat.getColor(context,R.color.academic));
            holder.iconCategory.setCardBackgroundColor(ContextCompat.getColor(context,R.color.academic));

        }
        if(model.getCategory().equals("Administrative Offices")){
            holder.categoryName.setTextColor(ContextCompat.getColor(context,R.color.admin));
            holder.icon.setImageResource(R.drawable.ic_admin);
            holder.categories.setCardBackgroundColor(ContextCompat.getColor(context,R.color.admin));
            holder.iconCategory.setCardBackgroundColor(ContextCompat.getColor(context,R.color.admin));

        }
        if(model.getCategory().equals("Shops")){
            holder.categoryName.setTextColor(ContextCompat.getColor(context,R.color.shopping));
            holder.icon.setImageResource(R.drawable.ic_shopping);
            holder.categories.setCardBackgroundColor(ContextCompat.getColor(context,R.color.shopping));
            holder.iconCategory.setCardBackgroundColor(ContextCompat.getColor(context,R.color.shopping));

        }if(model.getCategory().equals("Coffee Shops")){
            holder.categoryName.setTextColor(ContextCompat.getColor(context,R.color.coffee));
            holder.icon.setImageResource(R.drawable.ic_coffee);
            holder.categories.setCardBackgroundColor(ContextCompat.getColor(context,R.color.coffee));
            holder.iconCategory.setCardBackgroundColor(ContextCompat.getColor(context,R.color.coffee));

        }if(model.getCategory().equals("Hostel Blocks")){
            holder.categoryName.setTextColor(ContextCompat.getColor(context,R.color.hostel));
            holder.icon.setImageResource(R.drawable.ic_hostel);
            holder.categories.setCardBackgroundColor(ContextCompat.getColor(context,R.color.hostel));
            holder.iconCategory.setCardBackgroundColor(ContextCompat.getColor(context,R.color.hostel));

        }if(model.getCategory().equals("Restaurants")){
            holder.categoryName.setTextColor(ContextCompat.getColor(context,R.color.restaurant));
            holder.icon.setImageResource(R.drawable.ic_restaurant);
            holder.categories.setCardBackgroundColor(ContextCompat.getColor(context,R.color.restaurant));
            holder.iconCategory.setCardBackgroundColor(ContextCompat.getColor(context,R.color.restaurant));

        }if(model.getCategory().equals("ATMs")){
            holder.categoryName.setTextColor(ContextCompat.getColor(context,R.color.bank));
            holder.icon.setImageResource(R.drawable.ic_bank);
            holder.categories.setCardBackgroundColor(ContextCompat.getColor(context,R.color.bank));
            holder.iconCategory.setCardBackgroundColor(ContextCompat.getColor(context,R.color.bank));

        }if(model.getCategory().equals("Pickup Points")){
            holder.categoryName.setTextColor(ContextCompat.getColor(context,R.color.courier));
            holder.icon.setImageResource(R.drawable.ic_courier);
            holder.categories.setCardBackgroundColor(ContextCompat.getColor(context,R.color.courier));
            holder.iconCategory.setCardBackgroundColor(ContextCompat.getColor(context,R.color.courier));

        }if(model.getCategory().equals("Utilities")){
            holder.categoryName.setTextColor(ContextCompat.getColor(context,R.color.utilities));
//            holder.icon.setImageResource(R.drawable.ic_utilities);
            holder.categories.setCardBackgroundColor(ContextCompat.getColor(context,R.color.utilities));
            holder.iconCategory.setCardBackgroundColor(ContextCompat.getColor(context,R.color.utilities));

        }if(model.getCategory().equals("Sports")){
            holder.categoryName.setTextColor(ContextCompat.getColor(context,R.color.sports));
//            holder.icon.setImageResource(R.drawable.ic_sports);
            holder.categories.setCardBackgroundColor(ContextCompat.getColor(context,R.color.sports));
            holder.iconCategory.setCardBackgroundColor(ContextCompat.getColor(context,R.color.sports));

        }if(model.getCategory().equals("Gates")){
            holder.categoryName.setTextColor(ContextCompat.getColor(context,R.color.gates));
//            holder.icon.setImageResource(R.drawable.ic_gates);
            holder.categories.setCardBackgroundColor(ContextCompat.getColor(context,R.color.gates));
            holder.iconCategory.setCardBackgroundColor(ContextCompat.getColor(context,R.color.gates));

        }if(model.getCategory().equals("Halls")){
            holder.categoryName.setTextColor(ContextCompat.getColor(context,R.color.hall));
//            holder.icon.setImageResource(R.drawable.ic_hall);
            holder.categories.setCardBackgroundColor(ContextCompat.getColor(context,R.color.hall));
            holder.iconCategory.setCardBackgroundColor(ContextCompat.getColor(context,R.color.hall));

        }
        if(position==0 && list.size()!=1){
            holder.cl.setBackground(ContextCompat.getDrawable(context,R.drawable.places_first));
        }
        if(position==list.size()-1 && list.size()!=1){
            holder.cl.setBackground(ContextCompat.getDrawable(context,R.drawable.places_end));
//            Log.i("Position",model.getPlaceName());
        }
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent i = new Intent(context, NavigationActivity.class);
                i.putExtra("marker_object",list.get(position));
                i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        CardView iconCategory,categories;
        TextView placeName,categoryName;
        ImageView icon;
        ConstraintLayout cl;
        public MyViewHolder(View itemView) {
            super(itemView);
            iconCategory = itemView.findViewById(R.id.placesCategoriesBackground);
            categories = itemView.findViewById(R.id.cardCategory);
            placeName = itemView.findViewById(R.id.placesCategoriesBuildingName);
            categoryName=itemView.findViewById(R.id.placesCategoriesTextview);
            icon = itemView.findViewById(R.id.placesCategoriesImage);
            cl=itemView.findViewById(R.id.placesItem);

        }
    }
}
