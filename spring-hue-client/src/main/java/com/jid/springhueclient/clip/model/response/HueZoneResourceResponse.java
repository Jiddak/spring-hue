package com.jid.springhueclient.clip.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jid.springhueclient.clip.model.HueApiError;
import com.jid.springhueclient.clip.model.room.HueZoneResource;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HueZoneResourceResponse {

    @JsonProperty("errors")
    private List<HueApiError> errors;

    @JsonProperty("data")
    private List<HueZoneResource> zones;

}
