package com.jid.springhueclient.clip.model.light;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class HueLightSignalStatus {

    @JsonProperty("signal")
    private HueLightSignalType signalType;

    @JsonProperty("estimated_end")
    private ZonedDateTime estimatedEnd;

    @JsonProperty("colors")
    private List<HueLightColor> colors;


}
