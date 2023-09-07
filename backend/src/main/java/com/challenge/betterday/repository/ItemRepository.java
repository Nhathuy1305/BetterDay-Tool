package com.challenge.betterday.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.challenge.betterday.entity.Item;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}
