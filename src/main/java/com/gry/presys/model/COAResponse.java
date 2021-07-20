package com.gry.presys.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
public class COAResponse implements Serializable {

    private static final long serialVersionUID = -335517412988781432L;

    public COAResponse(final List<ChartOfAccount> coaList) {
        this.coaList = coaList;
    }

    @JsonProperty("coaList")
    List<ChartOfAccount> coaList;
}
