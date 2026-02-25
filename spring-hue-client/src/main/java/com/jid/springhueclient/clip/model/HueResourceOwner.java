package com.jid.springhueclient.clip.model;

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
public class HueResourceOwner {

    @JsonProperty("rid")
    private String resourceId;

    @JsonProperty("rtype")
    private HueResourceType resourceType;

}
