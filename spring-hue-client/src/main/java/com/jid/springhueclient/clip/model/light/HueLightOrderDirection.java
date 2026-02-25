package com.jid.springhueclient.clip.model.light;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum HueLightOrderDirection {

    @JsonProperty("forward")
    FORWARD,
    @JsonProperty("reversed")
    REVERSED,
    ;
}
