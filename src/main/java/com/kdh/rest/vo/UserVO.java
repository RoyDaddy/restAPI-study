package com.kdh.rest.vo;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Getter
@Entity
@Table(name = "user")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserVO extends BaseVO implements Serializable{
    @Id
    private String id;
    private String password;
    private String name;
    private String age;
    private String sex;

    @Builder
    public UserVO(String id, String password, String name, String age, String sex, String regDate) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
