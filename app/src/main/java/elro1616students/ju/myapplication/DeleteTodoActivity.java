package elro1616students.ju.myapplication;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DeleteTodoActivity extends Activity {
    protected void onCreate (@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_todo);
        Intent intent = getIntent();
        int todoIndex = intent.getIntExtra("todoIndex", -1);
        Data.ToDo toDo = Data.todos.get(todoIndex);
        TextView todoTitle = (TextView) findViewById(R.id.TodoTitle);
        todoTitle.setText(toDo.title);
    }

    public void deletePopUp (View view) {
        new AlertDialog.Builder(this)
                .setTitle("Delete Task")
                .setMessage("Are you sure?")
                .setPositiveButton(
                        android.R.string.yes,
                        new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which){
                            Data.todos.remove(getIntent(). getIntExtra("todoIndex", -1));
                            finish();
                        }

                        }
                ).setNegativeButton(
                android.R.string.no,
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {finish();}
                }

        ).show();
    }
}
