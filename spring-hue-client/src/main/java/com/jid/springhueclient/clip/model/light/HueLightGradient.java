package com.jid.springhueclient.clip.model.light;

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
public class HueLightGradient {

    @JsonProperty("points")
    private List<HueGradientPoint> points;
    @JsonProperty("mode")
    private HueLightGradientMode  mode;
    @JsonProperty("points_capable")
    private Boolean pointsCapable;
    @JsonProperty("mode_values")
    private List<HueLightGradientMode> supportedModes;
    @JsonProperty("pixel_count")
    private Integer pixelCount;

}
