package com.example.entity.template;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@MappedSuperclass
public class AbsEntity {
    //uuid
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    security ishlatiladigan
//    kim qo'shdi user uuid
//    @CreatedBy
//    @Column(nullable = false, name = "created_by")
//    private UUID createdBy;
//    //kim o'zgartirdi
//    @LastModifiedBy
//    @Column(nullable = false)
//    private UUID updatedBy;

    //qachon qo'shgan
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(updatable = false)
    private Date createdAt;

    //qachon o'zgardi
    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date updatedAt;
}
