package com.jid.springhueclient.clip.model.light;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class HueLightEffectsV2 {

    @JsonProperty("action")
    private HueLightEffectsV2Action action;

    @JsonProperty("status")
    private HueLightEffectsV2Status status;




}
