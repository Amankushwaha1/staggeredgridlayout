package com.example.staggeredgridlayout;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class adapter extends RecyclerView.Adapter<adapter.ViewHolder> {

    private static final String TAG = "adapter";

    private ArrayList<String> mnames=new ArrayList<>();
    private ArrayList<String> mimage=new ArrayList<>();

    private Context mcontexxt;

    public adapter(Context mcontexxt,ArrayList<String> names,ArrayList<String> image) {
        mnames=names;
        mimage=image;
        this.mcontexxt = mcontexxt;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewtype) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_grid_itemrelative, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int i) {
        Log.d(TAG, "onBindViewHolder: called.");

        holder.name.setText(mnames.get(i));
        holder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: clicked  card"+mnames.get(i));
                Toast.makeText(mcontexxt,mnames.get(i),Toast.LENGTH_SHORT).show();

                Intent inn=new Intent(mcontexxt.getApplicationContext(), relativecalcactivity.class);
                inn.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                Intent inn2=new Intent(mcontexxt.getApplicationContext(),constraint.class);
                inn2.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                Intent inn3=new Intent(mcontexxt.getApplicationContext(),linear.class);
                inn3.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                Intent inn4=new Intent(mcontexxt.getApplicationContext(),grid.class);
                inn4.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    if (mnames.get(i)=="RELATIVE LAYOUT")mcontexxt.getApplicationContext().startActivity(inn);
                    if (mnames.get(i)=="CONSTRAINT LAYOUT")mcontexxt.getApplicationContext().startActivity(inn2);
                    if (mnames.get(i)=="LINEAR LAYOUT")mcontexxt.getApplicationContext().startActivity(inn3);
                    if (mnames.get(i)=="GRID LAYOUT")mcontexxt.getApplicationContext().startActivity(inn4);
            }
        });




    }

    @Override
    public int getItemCount() {
        return mnames.size();

    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView name;

        public  ViewHolder (View itemview){
            super(itemview);
            this.image=itemview.findViewById(R.id.image);
            this.name=itemview.findViewById(R.id.name);
        }
    }


}
