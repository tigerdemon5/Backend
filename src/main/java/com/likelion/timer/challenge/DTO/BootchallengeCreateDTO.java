package com.likelion.timer.challenge.DTO;

import com.likelion.timer.challenge.domain.entity.Bootchallenge;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BootchallengeCreateDTO {
    private Bootchallenge.ChallengeCategory category;
    private String title;
    private String content;
    private String authMethod;
    private LocalDate endDate;
    private String note;
}
