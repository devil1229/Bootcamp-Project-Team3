package com.app.feedback.dto;

import java.util.List;

import com.app.feedback.entity.Question;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FormResponse {

    
    private String name;
    private List<Question> questions;
}
