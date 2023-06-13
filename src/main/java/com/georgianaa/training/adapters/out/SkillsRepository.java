package com.georgianaa.training.adapters.out;

import com.georgianaa.training.domain.models.Skill;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface SkillsRepository extends MongoRepository<Skill, String> {
    List<Skill> findByName(String name);
}
