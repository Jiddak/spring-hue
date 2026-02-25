package com.jid.springhueclient.clip.model.light;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jid.springhueclient.clip.model.HueResourceProductData;
import com.jid.springhueclient.clip.model.HueResourceMetadata;
import com.jid.springhueclient.clip.model.HueResourceOwner;
import com.jid.springhueclient.clip.model.HueResourceType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class HueLightResource {

    @JsonProperty("id")
    private String id;

    @JsonProperty("id_v1")
    private String idV1;

    @JsonProperty("owner")
    private HueResourceOwner owner;

    @JsonProperty("type")
    private HueResourceType type;

    @JsonProperty("metadata")
    private HueResourceMetadata metadata;

    @JsonProperty("product_data")
    private HueResourceProductData productData;

    @JsonProperty("identify")
    private Object identify;

    @JsonProperty("service_id")
    private Integer serviceId;

    @JsonProperty("on")
    private HueLightState state;

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

    @JsonProperty("signaling")
    private HueLightSignal signal;

    @JsonProperty("mode")
    private HueLightMode mode;

    @JsonProperty("gradient")
    private HueLightGradient gradient;

    @JsonProperty("effects")
    @Deprecated
    private HueLightEffects effects;

    @JsonProperty("effects_v2")
    private HueLightEffectsV2 effectsV2;

    @JsonProperty("timed_effects")
    private HueLightTimedEffects timedEffects;

    @JsonProperty("powerup")
    private HueLightPowerup powerup;

}
