package com.example.ReactiveDemo.Repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.example.ReactiveDemo.Entity.HistoryEntity;

public interface HistoryRepo extends ReactiveCrudRepository<HistoryEntity, Double> {

}
