package com.example.dev.expense.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.Instant;
import java.time.LocalDateTime;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class Expense {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String description;
    private Category category;
    private Instant expenseDate;
    private String location;

}
