package com.jid.springhueclient.clip.model.light;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum HueLightDynamicStatus {

    @JsonProperty("none")
    NONE,
    @JsonProperty("dynamic_palette")
    DYNAMIC_PALETTE,
    ;
}
