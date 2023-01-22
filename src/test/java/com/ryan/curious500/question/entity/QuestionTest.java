package com.ryan.curious500.question.entity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.PersistenceContext;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
@Slf4j
class QuestionTest {

    @Autowired
    EntityManager em;
    @Test
    void questionTest() {
        Question question = Question.builder().build();
        em.persist(question);

        Question findQuestion = em.find(Question.class, question.getId());
        log.info("{}",findQuestion);
        assertThat(findQuestion).isEqualTo(question);
    }

}