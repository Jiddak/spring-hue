package com.jid.springhueclient.clip.model.scene;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jid.springhueclient.clip.model.HueResourceOwner;
import com.jid.springhueclient.clip.model.light.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class HueSceneAction {

    @JsonProperty("target")
    private HueResourceOwner target;

    @JsonProperty("action")
    private HueSceneActionBody action;

}
