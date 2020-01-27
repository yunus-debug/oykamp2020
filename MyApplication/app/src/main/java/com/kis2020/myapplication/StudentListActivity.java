package com.kis2020.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.kis2020.myapplication.com.kis2020.myapplication.model.Student;

import java.util.ArrayList;

public class StudentListActivity extends AppCompatActivity {

    Intent intent;
    TextView txtViewStudents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_list);
        txtViewStudents = findViewById(R.id.txtViewStudents);

        intent = getIntent();
        Bundle bundle = intent.getExtras();

        ArrayList<Student> students = bundle.getParcelableArrayList("students");

        String text = "";
        for (Student student : students) {
            text += student.getName() + " " + student.getSurName() + " " + student.getAge() + "\n";
        }

        txtViewStudents.setText(text);
    }
}
