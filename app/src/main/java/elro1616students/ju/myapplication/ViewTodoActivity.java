package elro1616students.ju.myapplication;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.Nullable;
import android.os.Bundle;
import android.widget.TextView;

public class ViewTodoActivity extends AppCompatActivity {

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_todo);
        Intent intent = getIntent();
        int todoIndex = intent.getIntExtra("todoIndex", -1);
        Data.ToDo toDo = Data.todos.get(todoIndex);
        TextView todoTitle = (TextView) findViewById(R.id.TodoTitle);
        todoTitle.setText(toDo.title);
    }
}
