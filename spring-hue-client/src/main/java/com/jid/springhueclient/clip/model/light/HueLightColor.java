package com.jid.springhueclient.clip.model.light;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class HueLightColor {

    @JsonProperty("xy")
    private HueLightGamutCoordinates cieGamut;

    @JsonProperty("gamut")
    private HueLightRGBGamut rgbGamut;

    @JsonProperty("gamut_type")
    private HueLightGamutType gamutType;


}
