package com.example.quizApp.service;

import com.example.quizApp.Question;
import com.example.quizApp.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionDao questionDao;
    public List<Question> getAllQuestions() {
        return questionDao.findAll();
    }

    public List<Question> getQuestionsByCategory(String category) {
        return questionDao.findQuestionByCategory(category);
    }

    public String addQuestion(Question question) {
        questionDao.save(question);
        return "Success";
    }
}
