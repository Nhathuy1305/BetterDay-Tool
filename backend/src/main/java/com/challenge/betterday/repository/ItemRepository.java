package com.challenge.betterday.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.challenge.betterday.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
