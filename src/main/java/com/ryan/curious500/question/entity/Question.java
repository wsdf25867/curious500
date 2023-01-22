package com.ryan.curious500.question.entity;

import com.ryan.curious500.common.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Question extends BaseEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "question_id")
    private Long id;
    private String title;
    @Lob
    private String content;


    @Builder
    public Question(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
