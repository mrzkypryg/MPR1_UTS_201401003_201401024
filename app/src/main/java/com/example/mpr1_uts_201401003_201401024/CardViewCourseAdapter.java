package com.example.mpr1_uts_201401003_201401024;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CardViewCourseAdapter extends RecyclerView.Adapter<CardViewCourseAdapter.CardViewHolder> {
    private Context context;
    private ArrayList<Course> courses;

    private ArrayList<Course> getListCourses(){
        return courses;
    }

     public CardViewCourseAdapter(Context context){
        this.context = context;
    }

    public void setListCourses(ArrayList<Course> course){
        this.courses = course;
    }


    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder (@NonNull ViewGroup viewGroup, int i){
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_course, viewGroup, false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder cardViewHolder, int i){
        Course course = getListCourses().get(i);
        cardViewHolder.tvCourseTitle.setText(course.getCourseTitle());
        cardViewHolder.tvCourseShortDescription.setText(course.getCourseShortDescription());
        cardViewHolder.imgCourse.setImageResource(course.getCourseImage());
        cardViewHolder.cardViewBackground.setCardBackgroundColor(Color.parseColor(course.getCourseColor()));
    }

    @Override
    public int getItemCount(){
        return getListCourses().size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder{
        ImageView imgCourse;
        TextView tvCourseTitle, tvCourseShortDescription;
        CardView cardViewBackground;

        public CardViewHolder(@NonNull View itemView){
            super(itemView);

            imgCourse = itemView.findViewById(R.id.img_item_course);
            tvCourseTitle = itemView.findViewById(R.id.tv_item_tittle);
            tvCourseShortDescription = itemView.findViewById(R.id.tv_item_short_description);
            cardViewBackground = itemView.findViewById(R.id.cardview_course);

        }
    }


}
