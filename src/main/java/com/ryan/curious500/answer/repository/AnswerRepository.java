package com.ryan.curious500.answer.repository;

import com.ryan.curious500.answer.entity.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Long> {
    public List<Answer> findByQuestion(Long questionId);
}
