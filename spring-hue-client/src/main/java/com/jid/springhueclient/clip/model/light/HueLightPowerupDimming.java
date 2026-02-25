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
public class HueLightPowerupDimming {

    @JsonProperty("mode")
    private HueLightPowerupDimmingMode mode;

    @JsonProperty("dimming")
    private HueLightDimming dimming;

}
