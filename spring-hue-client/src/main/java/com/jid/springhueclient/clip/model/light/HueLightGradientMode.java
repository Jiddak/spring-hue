package com.jid.springhueclient.clip.model.light;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum HueLightGradientMode {

    @JsonProperty("interpolated_palette")
    INTERPOLATED_PALETTE,
    @JsonProperty("interpolated_palette_mirrored")
    INTERPOLATED_PALETTE_MIRRORED,
    @JsonProperty("random_pixelated")
    RANDOM_PALETTE,
    ;
}
