package com.georgianaa.training.useCase;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SkillsUseCase {
    @GetMapping("/getSkills")
    String data() {

        return "Jenkins";
    }
}
