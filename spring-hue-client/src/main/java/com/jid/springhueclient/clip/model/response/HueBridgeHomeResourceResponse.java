package com.jid.springhueclient.clip.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jid.springhueclient.clip.model.HueApiError;
import com.jid.springhueclient.clip.model.room.HueBridgeHomeResource;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HueBridgeHomeResourceResponse {

    @JsonProperty("errors")
    private List<HueApiError> errors;

    @JsonProperty("data")
    private List<HueBridgeHomeResource> bridgeHomes;

}
