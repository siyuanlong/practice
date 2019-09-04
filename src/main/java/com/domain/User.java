package com.domain;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")
@XStreamAlias("userss")
@Builder
public class User {
    private Integer id;

    @XStreamAsAttribute
    private String username;

    @XStreamAlias("pwd")
    private String password;

    private String email;

    private String activated;

    private String codeUrl;

    private List<Cars> carsList;

}
