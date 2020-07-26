package com.sasdos.practice.di.application.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class RegistStudentResponse {

    @JsonProperty("result")
    private String result = "";

}
