package com.georgianaa.training.domain.models;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Builder
@Data
public class Skill {
    @Id
    public String name;
    public Integer level;
}
