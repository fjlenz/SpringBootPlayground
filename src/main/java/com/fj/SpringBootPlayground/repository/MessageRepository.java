package com.fj.SpringBootPlayground.repository;

import org.springframework.data.repository.CrudRepository;
import com.fj.SpringBootPlayground.entity.Message;

public interface MessageRepository extends CrudRepository<Message, Integer> {
    //Message findByName(String name);
}