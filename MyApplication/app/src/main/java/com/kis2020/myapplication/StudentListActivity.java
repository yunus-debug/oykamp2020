package com.kis2020.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Spinner;
import android.widget.TextView;

import com.kis2020.myapplication.com.kis2020.myapplication.model.Student;

import java.util.ArrayList;
import java.util.Collections;

public class StudentListActivity extends AppCompatActivity {

    Intent intent;
    TextView txtViewStudents;
    Spinner student_Spinner;
    ArrayList<Student> student;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_list);
      //  txtViewStudents = findViewById(R.id.txtViewStudents);

        student_Spinner = findViewById(R.id.spinnerStudent);
        intent = getIntent();
        Bundle bundle = intent.getExtras();



        ArrayList<Student> students = bundle.getParcelableArrayList("students");

        String text = "";
        student = new ArrayList<>();
        for (Student item : students) {
           // text += student.getName() + " " + student.getSurName() + " " + student.getAge() + "\n";

            Collections.addAll(student, new Student(item.getName(),item.getSurName(),item.getAge()));
        }

        SpinnerAdapter spnAdapter= new SpinnerAdapter(this, R.layout.spinner_item,student);
        student_Spinner.setAdapter(spnAdapter);




    }
    public void createStudentSpinner()
    {



    }
}
