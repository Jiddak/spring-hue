package com.jid.springhueclient.clip.model.light;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum HueLightPowerupPowerMode {

    @JsonProperty("on")
    ON,
    @JsonProperty("toggle")
    TOGGLE,
    @JsonProperty("previous")
    PREVIOUS,
    ;

}
