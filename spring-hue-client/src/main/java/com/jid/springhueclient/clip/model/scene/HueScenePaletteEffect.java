package com.jid.springhueclient.clip.model.scene;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jid.springhueclient.clip.model.light.HueLightEffect;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Deprecated
@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class HueScenePaletteEffect {

    @JsonProperty("effect")
    private HueLightEffect effect;

}
