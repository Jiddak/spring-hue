package com.jid.springhueclient.clip.model.light;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum HueLightTimedEffect {

    @JsonProperty("no_effect")
    NO_EFFECT,
    @JsonProperty("sunrise")
    SUNRISE,
    @JsonProperty("sunset")
    SUNSET,
    ;
}
