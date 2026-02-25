package com.jid.springhueclient.clip.model.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jid.springhueclient.clip.model.HueResourceIdentify;
import com.jid.springhueclient.clip.model.HueResourceMetadata;
import com.jid.springhueclient.clip.model.HueResourceType;
import com.jid.springhueclient.clip.model.light.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HueLightResourceUpdateRequest {

    @JsonIgnore
    private String id;

    @JsonProperty("name")
    private HueResourceType type;

    @JsonProperty("metadata")
    private HueResourceMetadata metadata;

    @JsonProperty("identify")
    private HueResourceIdentify identify;

    @JsonProperty("on")
    private HueLightState power;

    @JsonProperty("dimming")
    private HueLightDimming dimming;

    @JsonProperty("dimming_delta")
    private HueLightDimmingDelta dimmingDelta;

    @JsonProperty("color_temperature")
    private HueLightColorTemperature colorTemperature;

    @JsonProperty("color_temperature_delta")
    private HueLightColorTemperatureDelta colorTemperatureDelta;

    @JsonProperty("color")
    private HueLightColor color;

    @JsonProperty("dynamics")
    private HueLightDynamics dynamics;

    @JsonProperty("alert")
    private HueLightAlert alert;

    @JsonProperty("signaling")
    private HueLightSignal signaling;

    @JsonProperty("gradient")
    private HueLightGradient gradient;

    @JsonProperty("effects")
    private HueLightEffects effects;

    @JsonProperty("effects_v2")
    private HueLightEffectsV2 effectsDelta;

    @JsonProperty("timed_effects")
    private HueLightTimedEffects timedEffects;

    @JsonProperty("powerup")
    private HueLightPowerup powerup;


}
