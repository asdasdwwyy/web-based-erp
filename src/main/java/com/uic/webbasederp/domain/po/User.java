package com.uic.webbasederp.domain.po;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private int id;
    private int employeeId;
    private String password;
    private int authority;
}
