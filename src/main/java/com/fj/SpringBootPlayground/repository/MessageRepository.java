package com.fj.SpringBootPlayground.repository;

import org.springframework.data.repository.CrudRepository;
import com.fj.SpringBootPlayground.entity.Message;

public interface MessageRepository extends CrudRepository<Message, Long> {
    //Message findByName(String name);
}