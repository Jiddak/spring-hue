package com.jid.springhueclient.clip.model.scene;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
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
public class HueSceneRecall {

    @JsonProperty("action")
    private HueSceneRecallAction action;

    @JsonProperty("duration")
    private Integer durationMillis;

    @JsonProperty("dimming")
    private HueLightDimming dimming;

}
