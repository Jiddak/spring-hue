package com.jid.springhueclient.clip.model.light;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
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
public class HueLightDynamics {

    @JsonProperty("duration")
    private Integer durationMillis;

    @JsonProperty("status")
    private HueLightDynamicStatus status;

    @JsonProperty("status_values")
    private List<HueLightDynamicStatus> supportedStatuses;

    @JsonProperty("speed")
    private BigDecimal speed;

    @JsonProperty("speed_valid")
    private Boolean speedValid;


}
