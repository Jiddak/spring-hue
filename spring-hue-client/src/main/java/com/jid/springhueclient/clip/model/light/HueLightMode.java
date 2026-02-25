package com.jid.springhueclient.clip.model.light;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum HueLightMode {

    @JsonProperty("normal")
    NORMAL,
    @JsonProperty("streaming")
    STREAMING,
    ;
}
