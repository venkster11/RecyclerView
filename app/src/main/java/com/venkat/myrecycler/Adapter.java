package com.venkat.myrecycler;

import android.graphics.ColorSpace;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.Viewholder>
{

    private List<ModelClass> modelClassList;

    public Adapter(List<ModelClass>modelClassList){
        this.modelClassList=modelClassList;
    }



    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_layout,viewGroup,false);
        return new Viewholder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder viewholder, int position) {

        int resourse=modelClassList.get(position).getImageResource();
        String title=modelClassList.get(position).getTitle();
        String body=modelClassList.get(position).getBody();
        viewholder.setData(resourse,title,body);

    }

    @Override
    public int getItemCount() {
        return modelClassList.size();
    }

    class Viewholder extends RecyclerView.ViewHolder{

        private ImageView imageView;
        private TextView title;
        private TextView body;

        public Viewholder(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.image_view);
            title=itemView.findViewById(R.id.title);
            body=itemView.findViewById(R.id.body);

        }

        private void setData(int resourse,String titleText,String bodyText){
            imageView.setImageResource(resourse);
            title.setText(titleText);
            body.setText(bodyText);
        }
    }
}
