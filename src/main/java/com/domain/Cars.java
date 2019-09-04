package com.domain;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

@Data
@XStreamAlias("carss")
public class Cars {
    private String name;
    private String color;
    private String price;
}
