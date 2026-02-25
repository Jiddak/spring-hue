package com.jid.springhueclient.clip.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jid.springhueclient.clip.model.HueResourceOwner;
import com.jid.springhueclient.clip.model.HueResourceType;
import com.jid.springhueclient.clip.model.room.HueRoomMetadata;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HueRoomCreateRequest {

    @JsonProperty("children")
    private List<HueResourceOwner> children;

    @JsonProperty("type")
    private HueResourceType type;

    @JsonProperty("metadata")
    private HueRoomMetadata metadata;

}
