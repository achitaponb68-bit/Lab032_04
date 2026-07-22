package com.example.myapplication;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);te
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        User user1 = new User("A01", "Achi", "032", "Achitapon Achi");

        TextNote textNote1 = new TextNote("Buranapong note", "Hello from text note");
        CheckListNote checklist1 = new CheckListNote("My CheckList", "");
        checklist1.getCheckList().add("Work 1");
        checklist1.getCheckList().add("Work 2");

        user1.addNote(textNote1);
        user1.addNote(checklist1);

        System.out.println("User Name: " + user1.getFullName());
        System.out.println(user1.getAllNote().get(0).getSummary());
        System.out.println(user1.getAllNote().get(1).getSummary());
    }
}