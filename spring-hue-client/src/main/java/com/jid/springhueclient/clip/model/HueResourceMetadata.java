package com.jid.springhueclient.clip.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jid.springhueclient.clip.model.light.HueLightFunction;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class HueResourceMetadata {

    @JsonProperty("name")
    private String resourceName;

    @JsonProperty("archetype")
    private HueResourceArchetype archetype;

    @JsonProperty("fixed_mired")
    private Integer fixedMired;

    @JsonProperty("function")
    private HueLightFunction function;


}
