package com.gry.presys.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class AccountType implements Serializable {
    private static final long serialVersionUID = -6803552129862103971L;

    private int id;
    private String name;

}
