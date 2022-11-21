package com.KodlamaioHomeWork5thDay.HomeWork5thDay.entities.concretes;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "subTechnologies")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class SubTechnology {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "programming_language_id", nullable = false)
    private ProgrammingLanguage programmingLanguage;
}