package com.jid.springhueclient.clip.model.light;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum HueLightContentConfigurableStatus {

    @JsonProperty("set")
    SET,
    @JsonProperty("changing")
    CHANGING,
    ;
}
