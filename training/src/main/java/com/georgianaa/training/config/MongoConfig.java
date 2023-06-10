package com.georgianaa.training.config;


import com.georgianaa.training.adapters.out.SkillsRepository;
import com.georgianaa.training.domain.models.Skill;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = SkillsRepository.class)
@Configuration
public class MongoConfig {

    @Bean
    CommandLineRunner commandLineRunner(SkillsRepository skillsRepository) {
        return strings -> {
            skillsRepository.save(Skill.builder().name("Java").level(70).build());
            skillsRepository.save(Skill.builder().name("Spring").level(60).build());
        };
    }
}
