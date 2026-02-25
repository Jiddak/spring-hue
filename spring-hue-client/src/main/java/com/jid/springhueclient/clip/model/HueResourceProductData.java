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
public class HueResourceProductData {

    @JsonProperty("name")
    public String productName;

    @JsonProperty("archetype")
    private HueResourceArchetype archetype;

    @JsonProperty("function")
    private HueLightFunction function;

}
