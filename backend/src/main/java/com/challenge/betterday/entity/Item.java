package com.challenge.betterday.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Item {
    private String id;
    private String name;
    private String description;
    private String category;

    // Constructors
    public Item() {
    }

    public Item(String name, String description, String category) {
        this.name = name;
        this.description = description;
        this.category = category;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }
}
