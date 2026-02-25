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
public class HueLightContentOrder {

    @JsonProperty("status")
    private HueLightContentConfigurableStatus status;

    @JsonProperty("configurable")
    private Boolean configurable;

    @JsonProperty("order")
    private HueLightOrderDirection order;

}
