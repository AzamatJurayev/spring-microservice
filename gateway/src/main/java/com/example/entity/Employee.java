package com.example.entity;

import com.example.entity.enums.Position;
import com.example.entity.template.AbsEntity;
import lombok.*;

import javax.persistence.ManyToOne;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Employee extends AbsEntity {

    private String phone;

    private Position position;

    @ManyToOne
    private Filial ketmon;
}
