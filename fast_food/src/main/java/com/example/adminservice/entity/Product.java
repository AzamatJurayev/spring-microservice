package com.example.adminservice.entity;

/**
 * @author "Husniddin Ulachov"
 * @created 11:47 AM on 8/3/2022
 * @project adminService
 */

import com.example.adminservice.entity.templete.AbsNameEntity;
import lombok.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Setter
@Getter
@ToString
@Where(clause = "deleted=false")
@SQLDelete(sql = "update product set deleted=true,status=false where id=?")
public class Product extends AbsNameEntity {
    @ManyToOne
    private Category category;
    private String photo;
    private Double price;
    private String description;
    //chegirma
    @ManyToOne
    private Discount discount;
}
