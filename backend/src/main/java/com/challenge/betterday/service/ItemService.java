package com.challenge.betterday.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.challenge.betterday.config.WeaviateProperties;
import com.challenge.betterday.repository.ItemRepository;

public class ItemService {
    private final WeaviateProperties weaviateProperties;
    private final ItemRepository itemRepository;

    @Autowired
    public ItemService (ItemRepository itemRepository, WeaviateProperties weaviateProperties) {
        this.itemRepository = itemRepository;
        this.weaviateProperties = weaviateProperties;
    }
}
