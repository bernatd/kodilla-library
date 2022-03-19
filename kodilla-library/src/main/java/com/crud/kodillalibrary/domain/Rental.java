package com.crud.kodillalibrary.domain;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity(name = "rentals")
public class Rental {
    private Long idCopy;
    private Long idUser;
    private LocalDate issueDate;
    private LocalDate returnDate;
}
