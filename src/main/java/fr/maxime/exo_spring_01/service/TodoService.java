package fr.maxime.exo_spring_01.service;

import fr.maxime.exo_spring_01.model.TodoModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("todo")
public class TodoService {
    List<TodoModel> todoListe = new ArrayList<>();

    public TodoService(){
        for(int i = 0; i < 10; i++){
            TodoModel todoModel = new TodoModel();
            todoModel.setName("name " + i);
            todoModel.setDescription("description " + i);
            todoModel.setDone(false);
            todoListe.add(todoModel);
        }
    }

    public List<TodoModel> getAllTodo(){
        return todoListe;
    }
    public TodoModel getOneTodo(){
        return new TodoModel("todo seul", "simple description" , true);
    }

}
