package com.jid.springhueclient.clip.model.light;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class HueLightSignal {

    @JsonProperty("signal")
    private HueLightSignalType signal;

    @JsonProperty("duration")
    private Integer durationMillis;

    @JsonProperty("colors")
    private List<HueLightColor> colors;

    @JsonProperty("signal_values")
    private List<HueLightSignalType> supportedSignalTypes;



}
