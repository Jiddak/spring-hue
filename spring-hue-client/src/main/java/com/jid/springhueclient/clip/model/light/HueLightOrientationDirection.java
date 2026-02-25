package com.jid.springhueclient.clip.model.light;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum HueLightOrientationDirection {

    @JsonProperty("horizontal")
    HORIZONTAL,
    @JsonProperty("vertical")
    VERTICAL,
    ;
}
