package com.jid.springhueclient.clip.model.light;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum HueLightGamutType {

    @JsonProperty("A")
    COLOR_ONLY,
    @JsonProperty("B")
    HUE_COLOR,
    @JsonProperty("C")
    HUE_WHITE_AND_COLOR,
    @JsonProperty("other")
    NON_HUE,
    ;

}
