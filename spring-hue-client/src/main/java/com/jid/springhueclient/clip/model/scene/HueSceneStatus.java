package com.jid.springhueclient.clip.model.scene;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum HueSceneStatus {

    @JsonProperty("inactive")
    INACTIVE,
    @JsonProperty("static")
    STATIC,
    @JsonProperty("dynamic_palette")
    DYNAMIC_PALETTE,
    ;
}
