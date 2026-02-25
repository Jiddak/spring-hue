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
public class HueLightColorTemperature {

    @JsonProperty("mirek")
    private Integer mirek;

    @JsonProperty("mirek_valid")
    private Boolean mirekValid;

    @JsonProperty("mirek_schema")
    private HueLightMirekSchema mirekSchema;

}
