package com.ryan.curious500.question.repository;

import com.ryan.curious500.question.entity.Question;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@Transactional
@SpringBootTest
class QuestionRepositoryTest {
    @Autowired QuestionRepository questionRepository;
    @Autowired
    EntityManager em;

    @Test
    void save() {
        //given
        Question question = Question.builder()
                .title("test")
                .content("test content")
                .build();

        //when
        questionRepository.save(question);
        em.flush();
        em.clear();
        Optional<Question> optionalQuestion = questionRepository.findById(question.getId());
        Question findQuestion = optionalQuestion.get();

        //then
        assertThat(findQuestion.getTitle()).isEqualTo("test");
        assertThat(findQuestion.getContent()).isEqualTo("test content");
    }
}