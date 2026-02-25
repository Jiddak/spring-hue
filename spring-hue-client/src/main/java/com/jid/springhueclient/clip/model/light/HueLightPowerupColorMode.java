package com.jid.springhueclient.clip.model.light;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum HueLightPowerupColorMode {

    @JsonProperty("color_temperature")
    COLOR_TEMPERATURE,
    @JsonProperty("color")
    COLOR,
    @JsonProperty("previous")
    PREVIOUS,
    ;

}
