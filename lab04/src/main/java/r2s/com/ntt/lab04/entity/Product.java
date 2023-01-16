package com.r2s.ntt.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PRODUCT")
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "PRICE")
    private Double price;

    @Column(name = "QUANTITY")
    private Integer quantity;

    @Column(name = "CREATED_DATE")
    private Date createdDate;

    @Column(name = "UPDATED_DATE")
    private Date updatedDate;

    @Column(name = "IS_DELETED")
    private Boolean isDeleted;

    @ManyToOne
    @JoinColumn(name = "USER_ID",  referencedColumnName = "id", nullable = false)
    private Employer userId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CATEGORY_ID", referencedColumnName = "id", nullable = false)
    private Category categoryId;
}
