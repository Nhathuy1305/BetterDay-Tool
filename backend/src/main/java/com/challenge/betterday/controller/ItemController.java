package com.challenge.betterday.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.challenge.betterday.service.ItemService;

public class ItemController {
    private final ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    //
}
