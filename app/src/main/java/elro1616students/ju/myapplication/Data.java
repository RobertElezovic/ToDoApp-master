package elro1616students.ju.myapplication;

import java.util.ArrayList;

public class Data {
    public static ArrayList<ToDo> todos = new ArrayList<>();
    static{
        todos.add(new ToDo("Drink Coffee"));
    }
    public static class ToDo{
        public String title;
        public ToDo(String title) {this.title = title;}
        @Override
        public String toString() {return title;}
    }
}