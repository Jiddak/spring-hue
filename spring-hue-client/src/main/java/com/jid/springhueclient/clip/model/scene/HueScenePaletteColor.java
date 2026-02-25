package com.jid.springhueclient.clip.model.scene;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jid.springhueclient.clip.model.light.HueLightColor;
import com.jid.springhueclient.clip.model.light.HueLightDimming;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class HueScenePaletteColor {

    @JsonProperty("color")
    private HueLightColor color;

    @JsonProperty("dimming")
    private HueLightDimming dimming;

}
