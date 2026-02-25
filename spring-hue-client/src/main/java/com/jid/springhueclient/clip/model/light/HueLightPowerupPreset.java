package com.jid.springhueclient.clip.model.light;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum HueLightPowerupPreset {

    @JsonProperty("safety")
    SAFETY,
    @JsonProperty("powerfail")
    POWERFAIL,
    @JsonProperty("last_on_state")
    LAST_ON_STATE,
    @JsonProperty("custom")
    CUSTOM,
    ;
}
