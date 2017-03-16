package com.nyannyan.samplenyan;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Johan on 16/3/2017.
 */

// Create the basic adapter extending from RecyclerView.Adapter
// Note that we specify the custom ViewHolder which gives us access to our views
public class RvAdapter extends RecyclerView.Adapter<RvAdapter.MyViewHolder> {

    Context mcontext;
    private List<DataModel> moviesList;


    public RvAdapter(Context context, List<DataModel> moviesList) {
        this.moviesList = moviesList;
        this.mcontext = context;
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title;
        public ImageView genre;
        CardView card;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.name_tv);
            genre = (ImageView) view.findViewById(R.id.picture_iv);
            card = (CardView) view.findViewById(R.id.card_view);

        }

        public void bind(DataModel data) {
            title.setText(data.getName());
            genre.setImageDrawable(mcontext.getResources().getDrawable(data.getYear()));

        }
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list_grid, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position)
    {
        final DataModel data = moviesList.get(position);
        holder.bind(data);

        //click listener
        holder.card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.v("v","onClick " + position);

                Intent intent = new Intent(mcontext, DetailActivity.class);
                intent.putExtra("name", data.getName());
                intent.putExtra("pic", data.getYear());
                mcontext.startActivity(intent);

            }
        });

    }


    @Override
    public int getItemCount() {
        return moviesList.size();
    }
}