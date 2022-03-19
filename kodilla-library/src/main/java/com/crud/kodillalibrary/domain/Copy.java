package com.crud.kodillalibrary.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity(name = "copies")
public class Copy {
    @Id
    @GeneratedValue
    private Long id;

    //Dodac relacje do tabeli Book
    private Long idBook;
    private String status;
}
