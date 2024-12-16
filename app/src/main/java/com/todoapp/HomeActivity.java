
package com.todoapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button viewTasksButton = findViewById(R.id.view_tasks_button);
        Button addTaskButton = findViewById(R.id.add_task_button);

        viewTasksButton.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, TaskListActivity.class);
            startActivity(intent);
        });

        addTaskButton.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, NewTaskActivity.class);
            startActivity(intent);
        });
    }
}
