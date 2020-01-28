package com.kis2020.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.kis2020.myapplication.com.kis2020.myapplication.model.Student;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText edtName, edtSurname, edtAge;
    ArrayList<Student> students = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtName = findViewById(R.id.edtFirstName);
        edtSurname = findViewById(R.id.edtLastName);
        edtAge = findViewById(R.id.edtAge);
    }

    public void onClick(View view) {

        Student student = new Student();
        student.setName(edtName.getText().toString());
        student.setSurName(edtSurname.getText().toString());
        student.setAge(Integer.parseInt(edtAge.getText().toString()));

        students.add(student);
        clearAll();

    }

    public void postClick(View view) {
        Intent intent = new Intent(this, StudentListActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("students", students);
        intent.putExtras(bundle);

        startActivity(intent);
    }

    public void clearAll() {
        edtSurname.setText("");
        edtName.setText("");
        edtAge.setText("");
    }
}
