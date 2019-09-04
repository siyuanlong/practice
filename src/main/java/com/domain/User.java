package com.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")
@Builder
public class User {
    private Integer id;

    private String username;

    private String password;

    private String email;

    private String activated;

    private String codeUrl;

}
