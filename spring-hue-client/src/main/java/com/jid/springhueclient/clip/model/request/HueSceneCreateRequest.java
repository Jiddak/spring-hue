package com.jid.springhueclient.clip.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jid.springhueclient.clip.model.HueResourceOwner;
import com.jid.springhueclient.clip.model.HueResourceType;
import com.jid.springhueclient.clip.model.scene.HueSceneAction;
import com.jid.springhueclient.clip.model.scene.HueSceneMetadata;
import com.jid.springhueclient.clip.model.scene.HueScenePalette;
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
public class HueSceneCreateRequest {

    @JsonProperty("actions")
    private List<HueSceneAction> actions;

    @JsonProperty("palette")
    private HueScenePalette palette;

    @JsonProperty("type")
    private HueResourceType type;

    @JsonProperty("metadata")
    private HueSceneMetadata metadata;

    @JsonProperty("group")
    private HueResourceOwner group;

    @JsonProperty("speed")
    private BigDecimal speed;

    @JsonProperty("auto_dynamic")
    private Boolean autoDynamic;

}
