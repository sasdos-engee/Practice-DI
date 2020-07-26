package com.sasdos.practice.di.application.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@Getter
@Setter
public class RegistStudentRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("number")
    private String number = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("furigana")
    private String furigana = null;


}
