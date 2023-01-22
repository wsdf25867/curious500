package com.ryan.curious500.answer.entity;

import com.ryan.curious500.common.entity.BaseEntity;
import com.ryan.curious500.question.entity.Question;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class Answer extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "answer_id")
    private Long id;
    @Lob
    private String content;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "question_id")
    private Question question;
}
