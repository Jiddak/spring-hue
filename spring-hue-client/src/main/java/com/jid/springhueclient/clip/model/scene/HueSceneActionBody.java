package com.jid.springhueclient.clip.model.scene;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jid.springhueclient.clip.model.light.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class HueSceneActionBody {

    @JsonProperty("on")
    private HueLightState on;

    @JsonProperty("dimming")
    private HueLightDimming dimming;

    @JsonProperty("color")
    private HueLightColor color;

    @JsonProperty("color_temperature")
    private HueLightColorTemperature colorTemperature;

    @JsonProperty("gradient")
    private HueLightGradient gradient;

    @JsonProperty("effects")
    @Deprecated
    private HueLightEffects effects;

    @JsonProperty("effects_v2")
    private HueLightEffectsV2 effectsV2;

    @JsonProperty("dynamics")
    private HueLightDynamics dynamics;

}
