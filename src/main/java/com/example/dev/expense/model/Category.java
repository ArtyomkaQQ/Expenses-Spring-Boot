package com.example.dev.expense.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Category {
    @JsonProperty("Food")
    FOOD,
    @JsonProperty("Electronics")
    ELECTRONICS
}
