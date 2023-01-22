package com.ryan.curious500.common.entity;

import jakarta.persistence.MappedSuperclass;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@MappedSuperclass
@EqualsAndHashCode
public class BaseEntity {
    @CreatedDate
    private LocalDateTime createAt;
    @LastModifiedDate
    private LocalDateTime lastModifiedAt;
}
