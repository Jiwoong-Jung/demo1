package com.example.demo.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="mydata")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MyData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long id;

    @Column(length = 50, nullable = false)
    private String name;

    @Column(length = 200, nullable = true)
    private String mail;

    @Column(nullable = true)
    private Integer age;

    @Column(nullable = true)
    private String memo;
}
