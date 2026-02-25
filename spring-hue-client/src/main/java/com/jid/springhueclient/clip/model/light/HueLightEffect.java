package com.jid.springhueclient.clip.model.light;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum HueLightEffect {

    @JsonProperty("no_effect")
    NO_EFFECT,
    @JsonProperty("candle")
    CANDLE,
    @JsonProperty("fire")
    FIRE,
    @JsonProperty("prism")
    PRISM,
    @JsonProperty("sparkle")
    SPARKLE,
    @JsonProperty("opal")
    OPAL,
    @JsonProperty("glisten")
    GLISTEN,
    @JsonProperty("underwater")
    UNDERWATER,
    @JsonProperty("cosmos")
    COSMOS,
    @JsonProperty("sunbeam")
    SUNBEAM,
    @JsonProperty("enchant")
    ENCHANT,
    ;
}
