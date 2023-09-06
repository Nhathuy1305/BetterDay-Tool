package com.challenge.betterday.controller;

import com.challenge.betterday.entity.Item;
import org.springframework.beans.factory.annotation.Autowired;

import com.challenge.betterday.service.ItemService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/items")
public class ItemController {
    private final ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/{itemId}")
    public ResponseEntity<Item> getItem(@PathVariable Long itemId) {
        Item item = itemService.getItemById(String.valueOf(itemId));
        if (item != null) {
            return ResponseEntity.ok(item);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Item> createItem(@RequestBody Item newItem) {
        Item createdItem = itemService.createItem(newItem);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdItem);
    }

    @PutMapping("/{itemId}")
    public ResponseEntity<Item> updateItem(@PathVariable Long itemId, @RequestBody Item updatedItem) {
        Item item = itemService.updateItem(String.valueOf(itemId), updatedItem);
        if (item != null) {
            return ResponseEntity.ok(item);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{itemId}")
    public ResponseEntity<Void> deleteItem(@PathVariable Long itemId) {
        itemService.deleteItem(String.valueOf(itemId));
        return ResponseEntity.noContent().build();
    }
}
