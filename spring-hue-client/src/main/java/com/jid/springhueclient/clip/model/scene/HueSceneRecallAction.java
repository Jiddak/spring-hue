package com.jid.springhueclient.clip.model.scene;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum HueSceneRecallAction {

    @JsonProperty("active")
    ACTIVE,
    @JsonProperty("dynamic_palette")
    DYNAMIC_PALETTE,
    @JsonProperty("static")
    STATIC,
    ;
}
