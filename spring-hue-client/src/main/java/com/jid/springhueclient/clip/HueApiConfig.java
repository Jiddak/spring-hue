package com.jid.springhueclient.clip;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@AllArgsConstructor
@Getter
@ToString
public class HueApiConfig {

    private final String baseUrl;
    private final String hueApplicationKey;
    @Builder.Default
    private final ObjectMapper objectMapper = HueApiMapper.getMapper();

}
