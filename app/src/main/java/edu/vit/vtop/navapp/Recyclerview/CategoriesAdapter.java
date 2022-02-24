package edu.vit.vtop.navapp.Recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import edu.vit.vtop.navapp.R;
import edu.vit.vtop.navapp.RecyclerviewModels.CategoriesModel;

public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesAdapter.MyViewholder> {

    List<CategoriesModel> list;
    Context context;

    public CategoriesAdapter(List<CategoriesModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public MyViewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.categories_item,parent,false);
        return new MyViewholder(view);
    }

    @Override
    public void onBindViewHolder(MyViewholder holder, int position) {
        holder.name.setText(list.get(position).getName());
        holder.icon.setImageResource(list.get(position).getIcon());
        holder.background.setCardBackgroundColor(ContextCompat.getColor(context,list.get(position).getColor()));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewholder extends RecyclerView.ViewHolder {
        TextView name;
        ImageView icon;
        CardView background;
        public MyViewholder(View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.categoriesName);
            icon = itemView.findViewById(R.id.categorieImage);
            background=itemView.findViewById(R.id.categorieBackground);
        }
    }
}
