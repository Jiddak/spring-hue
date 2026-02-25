package com.jid.springhueclient.clip.util;

import com.jid.springhueclient.clip.model.light.HueLightGamutCoordinates;

import java.math.BigDecimal;

public class HueLightColorUtils {

    static public HueLightGamutCoordinates rgbToHueLightGamutCoordinates(int red, int green, int blue) {

        // Normalize the RGB values
        double rLinear = red / 255.0;
        double gLinear = green / 255.0;
        double bLinear = blue / 255.0;

        double r = rLinear > 0.04045
            ? Math.pow((rLinear + 0.055) / (1.0 + 0.055), 2.4)
            : rLinear / 12.92;

        double g = gLinear > 0.04045
            ? Math.pow((gLinear + 0.055) / (1.0 + 0.055), 2.4)
            : gLinear / 12.92;

        double b = bLinear > 0.04045
            ? Math.pow((bLinear + 0.055) / (1.0 + 0.055), 2.4)
            : bLinear / 12.92;

        // Convert to CIEXYZ using the transformation matrix
        double X = 0.664511 * rLinear + 0.154324 * gLinear + 0.162028 * bLinear;
        double Y = 0.283881 * rLinear + 0.668433 * gLinear + 0.047685 * bLinear;
        double Z = 0.000088 * rLinear + 0.072310 * gLinear + 0.986039 * bLinear;


        double x = X <= 0
            ? 0
            : X / (X + Y + Z);

        double y = Y <= 0
            ? 0
            : Y / (X + Y + Z);

        return HueLightGamutCoordinates.builder()
            .x(BigDecimal.valueOf(x))
            .y(BigDecimal.valueOf(y))
            .build();

    }


}
