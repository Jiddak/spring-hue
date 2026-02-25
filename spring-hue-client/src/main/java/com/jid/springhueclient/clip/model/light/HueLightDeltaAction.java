package com.jid.springhueclient.clip.model.light;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum HueLightDeltaAction {

    @JsonProperty("up")
    UP,
    @JsonProperty("down")
    DOWN,
    @JsonProperty("stop")
    STOP,
    ;

}
