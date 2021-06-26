package com.harivemula.springbootmongodbdemo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Person {
    @Id
    private String _id;

    private String firstname;

    private String lastname;


}
