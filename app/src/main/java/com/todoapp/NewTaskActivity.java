
package com.todoapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class NewTaskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_task);

        EditText taskInput = findViewById(R.id.new_task_input);
        Button saveTaskButton = findViewById(R.id.save_task_button);

        saveTaskButton.setOnClickListener(v -> {
            String task = taskInput.getText().toString().trim();
            if (!task.isEmpty()) {
                // Simulate saving the task (in real apps, you'd save to a database or shared prefs)
                Toast.makeText(NewTaskActivity.this, "Task saved: " + task, Toast.LENGTH_SHORT).show();
                taskInput.setText("");
            } else {
                Toast.makeText(NewTaskActivity.this, "Please enter a task", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
