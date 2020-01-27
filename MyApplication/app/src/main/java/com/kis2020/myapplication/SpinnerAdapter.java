package com.kis2020.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.kis2020.myapplication.com.kis2020.myapplication.model.Student;

import java.util.ArrayList;
import java.util.List;

public class SpinnerAdapter extends ArrayAdapter<Student> {
    Context context;

    ArrayList<Student> studentList;
    public SpinnerAdapter(@NonNull Context context, int resource,  @NonNull ArrayList<Student> studentList) {
        super(context, resource,  studentList);
        this.context=context;
        this.studentList=studentList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater=(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view=inflater.inflate(R.layout.spinner_item,parent,false);

        TextView tvAge=view.findViewById(R.id.tvAge);
        TextView tvName=view.findViewById(R.id.tvName);
        TextView tvLastName=view.findViewById(R.id.tvLastName);
        LinearLayout layout=view.findViewById(R.id.layoutStudent);

        Student stdnt=studentList.get(position);
        tvAge.setText(String.valueOf( stdnt.getAge()));
        tvName.setText(stdnt.getName());
        tvLastName.setText(stdnt.getSurName());

        return view;
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater=(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view=inflater.inflate(R.layout.spinner_item,parent,false);

        TextView tvAge=view.findViewById(R.id.tvAge);
        TextView tvName=view.findViewById(R.id.tvName);
        TextView tvLastName=view.findViewById(R.id.tvLastName);
        LinearLayout layout=view.findViewById(R.id.layoutStudent);

        Student stdnt=studentList.get(position);
        tvAge.setText(String.valueOf(stdnt.getAge()));
        tvName.setText(stdnt.getName());
        tvLastName.setText(stdnt.getSurName());

        return view;
    }
}
