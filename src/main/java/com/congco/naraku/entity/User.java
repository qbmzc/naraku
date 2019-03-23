package com.congco.naraku.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

/**
 * created on 2019/3/22 20:03
 *
 * @author qbmzc
 */
@Setter
@Getter
@Accessors(chain = true)
@Document
public class User implements Serializable {

    private static final long serialVersionUID = -5017504589931957463L;

    private String id;

    private String username;

    private Integer age;
}
