package com.jid.springhueclient.clip.model.light;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum HueLightFunction {

    @JsonProperty("functional")
    FUNCTIONAL,
    @JsonProperty("decorative")
    DECORATIVE,
    @JsonProperty("mixed")
    MIXED,
    @JsonProperty("unknown")
    UNKNOWN,
    ;
}
