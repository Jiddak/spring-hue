package com.jid.springhueclient.clip.model.light;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Deprecated
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class HueLightEffects {

    @JsonProperty("status_values")
    private List<HueLightEffect> supportedStatuses;

    @JsonProperty("status")
    private HueLightEffect currentStatus;

    @JsonProperty("effect_values")
    private List<HueLightEffect> supportedEffects;


}
