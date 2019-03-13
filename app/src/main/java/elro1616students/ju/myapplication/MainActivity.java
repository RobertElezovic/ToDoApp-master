package elro1616students.ju.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final int viewReqId = 746;
    private static final int deleteReqId = 156;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void createButtonClicked(View view){
        Intent i = new Intent(this, CreateActivity.class);
        startActivity(i);
    }

    public void selectOneButtonClicked(View view){
        Intent i = new Intent(this, PickTodoActivity.class);
        startActivityForResult(i, viewReqId);
    }

    public void deleteButtonClicked(View view){
        Intent i = new Intent(this, PickTodoActivity.class);
        startActivityForResult(i, deleteReqId);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == viewReqId) {
            if(resultCode == Activity.RESULT_OK) {
                data.setClass(this, ViewTodoActivity.class);
                startActivity(data);
            }
        }
        else if(requestCode == deleteReqId) {
            if(resultCode == Activity.RESULT_OK) {
                data.setClass(this, DeleteTodoActivity.class);
                startActivity(data);
            }
        }
    }
}


