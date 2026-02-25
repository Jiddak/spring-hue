package com.jid.springhueclient.clip.model.light;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum HueLightSignalType {

    @JsonProperty("no_signal")
    NO_SIGNAL,
    @JsonProperty("on_off")
    ON_OFF,
    @JsonProperty("on_off_color")
    ON_OFF_COLOR,
    @JsonProperty("alternating")
    ALTERNATING,
    ;

}
