package com.jid.springhueclient.clip.model.room;

import com.jid.springhueclient.clip.model.HueResourceOwner;
import com.jid.springhueclient.clip.model.HueResourceType;

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
public class HueRoomResource {

    @JsonProperty("id")
    private String id;

    @JsonProperty("id_v1")
    private String idV1;

    @JsonProperty("children")
    private List<HueResourceOwner> children;

    @JsonProperty("services")
    private List<HueResourceOwner> services;

    @JsonProperty("type")
    private HueResourceType type;

    @JsonProperty("metadata")
    private HueRoomMetadata metadata;

}
