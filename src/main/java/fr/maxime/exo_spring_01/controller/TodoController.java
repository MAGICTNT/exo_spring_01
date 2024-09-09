package fr.maxime.exo_spring_01.controller;

import fr.maxime.exo_spring_01.model.TodoModel;
import fr.maxime.exo_spring_01.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TodoController {
    private TodoService todoService;
    @Autowired
    public TodoController(@Qualifier("todo") TodoService todoService){
        this.todoService = todoService;
    }

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("todoOne", todoService.getOneTodo());
        return "todo";
    }

    @RequestMapping("/json")
    @ResponseBody
    public List<TodoModel> getPersons(){
        return  todoService.getAllTodo();
    }
}
