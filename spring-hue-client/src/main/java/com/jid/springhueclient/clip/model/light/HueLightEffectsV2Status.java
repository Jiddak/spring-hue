package com.jid.springhueclient.clip.model.light;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class HueLightEffectsV2Status {

    @JsonProperty("effect")
    private HueLightEffect currentEffect;

    @JsonProperty("effect_values")
    private List<HueLightEffect> supportedEffects;

    @JsonProperty("parameters")
    private HueLightEffectsV2Parameters parameters;


}
