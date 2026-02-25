package com.jid.springhueclient.clip.model.light;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class HueLightPowerup {

    @JsonProperty("preset")
    private HueLightPowerupPreset preset;

    @JsonProperty("configured")
    private Boolean configured;

    @JsonProperty("on")
    private HueLightPowerupPower power;

    @JsonProperty("dimming")
    private HueLightPowerupDimming dimming;

    @JsonProperty("color")
    private HueLightPowerupColor color;




}
