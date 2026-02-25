package com.jid.springhueclient.clip.model.scene;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class HueScenePalette {

    @JsonProperty("color")
    private List<HueScenePaletteColor> color;

    @JsonProperty("dimming")
    private List<HueScenePaletteDimming> dimming;

    @JsonProperty("color_temperature")
    private List<HueScenePaletteColorTemperature> colorTemperature;

    @JsonProperty("effects")
    @Deprecated
    private List<HueScenePaletteEffect> effects;

    @JsonProperty("effects_v2")
    private List<HueScenePaletteEffectV2> effectsV2;

}
