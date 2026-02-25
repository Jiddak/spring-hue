package com.jid.springhueclient.clip.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum HueResourceType {

    @JsonProperty("device")
    DEVICE,

    @JsonProperty("bridge_home")
    BRIDGE_HOME,

    @JsonProperty("room")
    ROOM,

    @JsonProperty("zone")
    ZONE,

    @JsonProperty("service_group")
    SERVICE_GROUP,

    @JsonProperty("light")
    LIGHT,
    
    @JsonProperty("button")
    BUTTON,

    @JsonProperty("relative_rotary")
    RELATIVE_ROTARY,

    @JsonProperty("temperature")
    TEMPERATURE,

    @JsonProperty("light_level")
    LIGHT_LEVEL,

    @JsonProperty("motion")
    MOTION,

    @JsonProperty("camera_motion")
    CAMERA_MOTION,

    @JsonProperty("entertainment")
    ENTERTAINMENT,

    @JsonProperty("contact")
    CONTACT,

    @JsonProperty("tamper")
    TAMPER,

    @JsonProperty("grouped_light")
    GROUPED_LIGHT,

    @JsonProperty("grouped_motion")
    GROUPED_MOTION,

    @JsonProperty("grouped_light_level")
    grouped_light_level,

    @JsonProperty("device_power")
    DEVICE_POWER,

    @JsonProperty("device_software_update")
    device_software_update,

    @JsonProperty("zigbee_connectivity")
    ZIGBEE_CONNECTIVITY,

    @JsonProperty("zgp_connectivity")
    ZGP_CONNECTIVITY,

    @JsonProperty("bridge")
    BRIDGE,

    @JsonProperty("zigbee_device_discovery")
    ZIGBEE_DEVICE_DISCOVERY,

    @JsonProperty("homekit")
    HOMEKIT,

    @JsonProperty("matter")
    MATTER,

    @JsonProperty("matter_fabric")
    MATTER_FABRIC,

    @JsonProperty("scene")
    SCENE,

    @JsonProperty("entertainment_configuration")
    ENTERTAINMENT_CONFIGURATION,

    @JsonProperty("public_image")
    PUBLIC_IMAGE,

    @JsonProperty("auth_v1")
    AUTH_V1,

    @JsonProperty("behavior_script")
    BEHAVIOR_SCRIPT,

    @JsonProperty("behavior_instance")
    BEHAVIOR_INSTANCE,

    @JsonProperty("geofence_client")
    GEOFENCE_CLIENT,

    @JsonProperty("geolocation")
    GEOLOCATION,

    @JsonProperty("smart_scene")
    SMART_SCENE,

    ;


}
