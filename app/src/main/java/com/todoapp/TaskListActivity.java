
package com.todoapp;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class TaskListActivity extends AppCompatActivity {

    private ArrayList<String> tasks;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_list);

        tasks = new ArrayList<>();
        tasks.add("Task 1: Buy groceries");
        tasks.add("Task 2: Finish project");
        tasks.add("Task 3: Call Mom");

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, tasks);

        ListView taskListView = findViewById(R.id.task_list_view);
        taskListView.setAdapter(adapter);
    }
}
