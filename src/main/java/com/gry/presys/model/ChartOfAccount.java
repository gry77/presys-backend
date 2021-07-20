package com.gry.presys.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class ChartOfAccount implements Serializable {
    private static final long serialVersionUID = 425202504163294093L;

    private int id;
    private String code;
    private String name;
    private Integer enabled;
    private AccountType accountType;
}
