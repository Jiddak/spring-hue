package com.jid.springhueclient.clip.model.scene;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jid.springhueclient.clip.model.HueResourceOwner;
import com.jid.springhueclient.clip.model.HueResourceType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class HueSceneResource {

    @JsonProperty("id")
    private String id;

    @JsonProperty("id_v1")
    private String idV1;

    @JsonProperty("type")
    private HueResourceType type;

    @JsonProperty("actions")
    private List<HueSceneAction> actions;

    @JsonProperty("palette")
    private HueScenePalette palette;

    @JsonProperty("metadata")
    private HueSceneMetadata metadata;

    @JsonProperty("group")
    private HueResourceOwner group;

    @JsonProperty("recall")
    private HueSceneRecall recall;

    @JsonProperty("speed")
    private BigDecimal speed;

    @JsonProperty("auto_dynamic")
    private Boolean autoDynamic;

    @JsonProperty("status")
    private HueSceneActiveStatus status;

}
