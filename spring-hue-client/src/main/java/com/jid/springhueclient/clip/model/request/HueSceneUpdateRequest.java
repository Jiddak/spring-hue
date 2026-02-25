package com.jid.springhueclient.clip.model.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jid.springhueclient.clip.model.HueResourceType;
import com.jid.springhueclient.clip.model.scene.HueSceneAction;
import com.jid.springhueclient.clip.model.scene.HueSceneMetadata;
import com.jid.springhueclient.clip.model.scene.HueScenePalette;
import com.jid.springhueclient.clip.model.scene.HueSceneRecall;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HueSceneUpdateRequest {

    @JsonIgnore
    private String id;

    @JsonProperty("actions")
    private List<HueSceneAction> actions;

    @JsonProperty("palette")
    private HueScenePalette palette;

    @JsonProperty("recall")
    private HueSceneRecall recall;

    @JsonProperty("type")
    private HueResourceType type;

    @JsonProperty("metadata")
    private HueSceneMetadata metadata;

    @JsonProperty("speed")
    private BigDecimal speed;

    @JsonProperty("auto_dynamic")
    private Boolean autoDynamic;

}
