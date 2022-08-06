package com.example.adminservice.entity;

import com.example.adminservice.entity.templete.AbsNameEntity;
import lombok.*;
import org.hibernate.annotations.*;
import javax.persistence.Entity;
import javax.persistence.*;
import java.sql.Timestamp;

/**
 * @author "Husniddin Ulachov"
 * @created 11:22 AM on 8/4/2022
 * @project AdminService
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Where(clause = "deleted=false")
@SQLDelete(sql = "update notification set deleted=true,status=false where id=?")
public class Notification  extends AbsNameEntity {
    @ManyToOne
    private User user;
    private String title;
    private String body;
    private String attachment; //attachment
    private boolean hasBot; //true
    private Timestamp sendTime;
}
