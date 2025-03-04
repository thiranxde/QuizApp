package com.example.quizApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("question")
public class QuestionController {
    public String getAllQuestions(){
        return "These are the questions";
    }
}
