package com.app.feedback.dto;

import java.util.List;

import com.app.feedback.entity.QuestionType;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class QuestionRequest {
    
    private String text;

   @JsonProperty("question_type")
    private QuestionType questionType;
  
    private List<String> answers;

}
