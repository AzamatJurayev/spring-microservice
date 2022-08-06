package com.example.adminservice.entity.templete;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * @author "Husniddin Ulachov"
 * @created 11:29 AM on 8/3/2022
 * @project adminService
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class AbsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private boolean deleted;
    private boolean status = true;

    @CreationTimestamp
    @Column(nullable = false,updatable = false)
    private Timestamp createdAt;

    @CreationTimestamp
    @Column(nullable = false)
    private Timestamp updatedAt;

    private Long createdBy;
    private Long updatedBy;
}
