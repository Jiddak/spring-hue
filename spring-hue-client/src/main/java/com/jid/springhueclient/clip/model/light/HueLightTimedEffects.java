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
public class HueLightTimedEffects {

    @JsonProperty("status_values")
    private List<HueLightTimedEffect> supportedStatuses;

    @JsonProperty("status")
    private HueLightTimedEffect status;

    @JsonProperty("effect")
    private HueLightTimedEffect effect;

    @JsonProperty("duration")
    private Integer durationMillis;

    @JsonProperty("effect_values")
    private List<HueLightTimedEffect> supportedEffects;

}
