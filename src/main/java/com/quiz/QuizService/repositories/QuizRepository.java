package com.quiz.QuizService.repositories;

import com.quiz.QuizService.entities.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository <Quiz, Long>{
}
