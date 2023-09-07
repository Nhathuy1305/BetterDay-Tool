// package com.challenge.betterday.service;

// import com.challenge.betterday.entity.Item;
// import io.weaviate.client.WeaviateClient;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// @Service
// public class ItemService {
//     private final WeaviateClient weaviateClient;

//     @Autowired
//     public ItemService(WeaviateClient weaviateClient) {
//         this.weaviateClient = weaviateClient;
//     }

//     public Item getItemById(String itemId) {
//         try {
//             // Use Weaviate client to retrieve an item by its ID
//             return weaviateClient.getItemById(itemId);
//         } catch (WeaviateClientException e) {
//             // Handle the exception, e.g., log it or throw a custom exception
//             throw new ItemNotFoundException("Item not found", e);
//         }
//     }

//     public Item createItem(Item newItem) {
//         try {
//             // Use Weaviate client to create a new item
//             return weaviateClient.createItem(newItem);
//         } catch (WeaviateClientException e) {
//             // Handle the exception, e.g., log it or throw a custom exception
//             throw new ItemCreationException("Failed to create item", e);
//         }
//     }

//     public Item updateItem(String itemId, Item updatedItem) {
//         try {
//             // Use Weaviate client to update an existing item
//             return weaviateClient.updateItem(itemId, updatedItem);
//         } catch (WeaviateClientException e) {
//             // Handle the exception, e.g., log it or throw a custom exception
//             throw new ItemUpdateException("Failed to update item", e);
//         }
//     }

//     public void deleteItem(String itemId) {
//         try {
//             // Use Weaviate client to delete an item
//             weaviateClient.deleteItem(itemId);
//         } catch (WeaviateClientException e) {
//             // Handle the exception, e.g., log it or throw a custom exception
//             throw new ItemDeletionException("Failed to delete item", e);
//         }
//     }
// }
