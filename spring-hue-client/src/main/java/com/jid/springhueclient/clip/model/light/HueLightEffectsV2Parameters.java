package com.jid.springhueclient.clip.model.light;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class HueLightEffectsV2Parameters {

    @JsonProperty("color")
    private HueLightColor color;

    @JsonProperty("color_temperature")
    private HueLightColorTemperature temperature;

    @JsonProperty("speed")
    private BigDecimal speed;


}
