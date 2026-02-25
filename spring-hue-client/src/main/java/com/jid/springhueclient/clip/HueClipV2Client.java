package com.jid.springhueclient.clip;


import com.jid.springhueclient.clip.model.request.*;
import com.jid.springhueclient.clip.model.response.*;
import lombok.SneakyThrows;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.client5.http.impl.io.PoolingHttpClientConnectionManagerBuilder;
import org.apache.hc.client5.http.ssl.NoopHostnameVerifier;
import org.apache.hc.client5.http.ssl.SSLConnectionSocketFactory;
import org.apache.hc.core5.ssl.SSLContexts;
import org.apache.hc.core5.ssl.TrustStrategy;
import org.springframework.http.MediaType;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestClient;

import javax.net.ssl.SSLContext;
import java.util.Map;


public class HueClipV2Client {

    private static final String HUE_APPLICATION_KEY_HEADER = "hue-application-key";

    RestClient restClient;

    public HueClipV2Client(HueApiConfig apiConfig) {
        this.initialiseClient(apiConfig);
    }

    /**
     * Initialises the REST client.
     *
     * <p><b>SSL note:</b> The Hue bridge uses a self-signed certificate whose Subject Alternative
     * Name contains the bridge ID (e.g. {@code 001788FFFE123456.local}). To handle this properly
     * without disabling all certificate validation, you should:
     * <ol>
     *   <li>Download the Hue bridge root CA from the Philips Hue developer portal.</li>
     *   <li>Load it into a {@link java.security.KeyStore} and build an {@link SSLContext} from it
     *       via {@link SSLContexts#custom()#loadTrustMaterial(KeyStore, null)}.</li>
     *   <li>Replace {@link NoopHostnameVerifier} with a hostname verifier that checks the bridge
     *       ID against the certificate's SAN, or configure the HTTP client's base URL to use the
     *       bridge ID hostname so the default verifier works correctly.</li>
     * </ol>
     * The current trust-all strategy and {@link NoopHostnameVerifier} are <b>not suitable for
     * production</b> as they disable all certificate verification.
     */
    @SneakyThrows
    private void initialiseClient(HueApiConfig apiConfig) {

        // TODO: Replace with proper certificate validation — see Javadoc above.
        TrustStrategy acceptingTrustStrategy = (x509Certificates, s) -> true;
        SSLContext sslContext = SSLContexts.custom().loadTrustMaterial(null, acceptingTrustStrategy).build();

        var connectionManager = PoolingHttpClientConnectionManagerBuilder.create()
            .setSSLSocketFactory(new SSLConnectionSocketFactory(sslContext, new NoopHostnameVerifier()))
            .build();

        CloseableHttpClient httpClient = HttpClients
            .custom()
            .setConnectionManager(connectionManager)
            .build();

        HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
        requestFactory.setHttpClient(httpClient);

        restClient = RestClient.builder()
            .requestFactory(requestFactory)
            .baseUrl(apiConfig.getBaseUrl())
            .defaultHeader(HUE_APPLICATION_KEY_HEADER, apiConfig.getHueApplicationKey())
            .messageConverters(converters -> converters.add(new MappingJackson2HttpMessageConverter(apiConfig.getObjectMapper())))
            .build();
    }

    // -------------------------------------------------------------------------
    // Light
    // -------------------------------------------------------------------------

    public HueLightResourceResponse getHueLightResources() {
        return restClient.get()
            .uri("resource/light")
            .accept(MediaType.APPLICATION_JSON)
            .retrieve()
            .toEntity(HueLightResourceResponse.class)
            .getBody();
    }

    public HueResourceResponse updateHueLightResource(HueLightResourceUpdateRequest request) {
        return restClient.put()
            .uri("resource/light/{id}", Map.of("id", request.getId()))
            .accept(MediaType.APPLICATION_JSON)
            .contentType(MediaType.APPLICATION_JSON)
            .body(request)
            .retrieve()
            .toEntity(HueResourceResponse.class)
            .getBody();
    }

    // -------------------------------------------------------------------------
    // Room
    // -------------------------------------------------------------------------

    public HueRoomResourceResponse getHueRoomResources() {
        return restClient.get()
            .uri("resource/room")
            .accept(MediaType.APPLICATION_JSON)
            .retrieve()
            .toEntity(HueRoomResourceResponse.class)
            .getBody();
    }

    public HueResourceResponse createHueRoomResource(HueRoomCreateRequest request) {
        return restClient.post()
            .uri("resource/room")
            .accept(MediaType.APPLICATION_JSON)
            .contentType(MediaType.APPLICATION_JSON)
            .body(request)
            .retrieve()
            .toEntity(HueResourceResponse.class)
            .getBody();
    }

    public HueResourceResponse updateHueRoomResource(HueRoomUpdateRequest request) {
        return restClient.put()
            .uri("resource/room/{id}", Map.of("id", request.getId()))
            .accept(MediaType.APPLICATION_JSON)
            .contentType(MediaType.APPLICATION_JSON)
            .body(request)
            .retrieve()
            .toEntity(HueResourceResponse.class)
            .getBody();
    }

    public HueResourceResponse deleteHueRoomResource(String id) {
        return restClient.delete()
            .uri("resource/room/{id}", Map.of("id", id))
            .accept(MediaType.APPLICATION_JSON)
            .retrieve()
            .toEntity(HueResourceResponse.class)
            .getBody();
    }

    // -------------------------------------------------------------------------
    // Zone
    // -------------------------------------------------------------------------

    public HueZoneResourceResponse getHueZoneResources() {
        return restClient.get()
            .uri("resource/zone")
            .accept(MediaType.APPLICATION_JSON)
            .retrieve()
            .toEntity(HueZoneResourceResponse.class)
            .getBody();
    }

    public HueResourceResponse createHueZoneResource(HueZoneCreateRequest request) {
        return restClient.post()
            .uri("resource/zone")
            .accept(MediaType.APPLICATION_JSON)
            .contentType(MediaType.APPLICATION_JSON)
            .body(request)
            .retrieve()
            .toEntity(HueResourceResponse.class)
            .getBody();
    }

    public HueResourceResponse updateHueZoneResource(HueZoneUpdateRequest request) {
        return restClient.put()
            .uri("resource/zone/{id}", Map.of("id", request.getId()))
            .accept(MediaType.APPLICATION_JSON)
            .contentType(MediaType.APPLICATION_JSON)
            .body(request)
            .retrieve()
            .toEntity(HueResourceResponse.class)
            .getBody();
    }

    public HueResourceResponse deleteHueZoneResource(String id) {
        return restClient.delete()
            .uri("resource/zone/{id}", Map.of("id", id))
            .accept(MediaType.APPLICATION_JSON)
            .retrieve()
            .toEntity(HueResourceResponse.class)
            .getBody();
    }

    // -------------------------------------------------------------------------
    // Bridge Home
    // -------------------------------------------------------------------------

    public HueBridgeHomeResourceResponse getHueBridgeHomeResources() {
        return restClient.get()
            .uri("resource/bridge_home")
            .accept(MediaType.APPLICATION_JSON)
            .retrieve()
            .toEntity(HueBridgeHomeResourceResponse.class)
            .getBody();
    }

    // -------------------------------------------------------------------------
    // Scene
    // -------------------------------------------------------------------------

    public HueSceneResourceResponse getHueSceneResources() {
        return restClient.get()
            .uri("resource/scene")
            .accept(MediaType.APPLICATION_JSON)
            .retrieve()
            .toEntity(HueSceneResourceResponse.class)
            .getBody();
    }

    public HueResourceResponse createHueSceneResource(HueSceneCreateRequest request) {
        return restClient.post()
            .uri("resource/scene")
            .accept(MediaType.APPLICATION_JSON)
            .contentType(MediaType.APPLICATION_JSON)
            .body(request)
            .retrieve()
            .toEntity(HueResourceResponse.class)
            .getBody();
    }

    public HueResourceResponse updateHueSceneResource(HueSceneUpdateRequest request) {
        return restClient.put()
            .uri("resource/scene/{id}", Map.of("id", request.getId()))
            .accept(MediaType.APPLICATION_JSON)
            .contentType(MediaType.APPLICATION_JSON)
            .body(request)
            .retrieve()
            .toEntity(HueResourceResponse.class)
            .getBody();
    }

    public HueResourceResponse deleteHueSceneResource(String id) {
        return restClient.delete()
            .uri("resource/scene/{id}", Map.of("id", id))
            .accept(MediaType.APPLICATION_JSON)
            .retrieve()
            .toEntity(HueResourceResponse.class)
            .getBody();
    }

}
