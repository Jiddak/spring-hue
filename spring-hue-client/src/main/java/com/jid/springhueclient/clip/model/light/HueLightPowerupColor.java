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
public class HueLightPowerupColor {

    @JsonProperty("mode")
    private HueLightPowerupColorMode mode;

    @JsonProperty("color_temperature")
    private HueLightColorTemperature colorTemperature;

    @JsonProperty("color")
    private HueLightColor color;



}
