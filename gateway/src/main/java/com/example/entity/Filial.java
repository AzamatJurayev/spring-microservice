package com.example.entity;

import com.example.entity.template.AbsNameEntity;
import lombok.*;

import javax.persistence.OneToMany;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Filial extends AbsNameEntity {


    private String workingPeriod;

    private String Address;

    private Double lat;

    private Double lon;

    @OneToMany(mappedBy = "ketmon")
    private List<Employee> employees;
}
