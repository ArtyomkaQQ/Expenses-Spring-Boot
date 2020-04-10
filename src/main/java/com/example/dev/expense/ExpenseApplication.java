package com.example.dev.expense;

import com.example.dev.expense.model.Category;
import com.example.dev.expense.model.Expense;
import com.example.dev.expense.repository.ExpenseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Set;

@SpringBootApplication
public class ExpenseApplication implements CommandLineRunner {

    private final ExpenseRepository expenseRepository;

    public ExpenseApplication(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(ExpenseApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Set<Expense> expenses = Set.of(new Expense(1L, "Lenovo laptop",  Category.ELECTRONICS, Instant.now(), "Tallinn"));
        expenseRepository.saveAll(expenses);
    }

}
