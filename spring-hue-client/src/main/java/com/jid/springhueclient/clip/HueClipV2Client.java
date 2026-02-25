package com.jid.springhueclient.clip;


import com.jid.springhueclient.clip.model.request.HueLightResourceUpdateRequest;
import com.jid.springhueclient.clip.model.response.HueLightResourceResponse;
import com.jid.springhueclient.clip.model.response.HueResourceResponse;
import lombok.SneakyThrows;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.client5.http.impl.io.PoolingHttpClientConnectionManager;
import org.apache.hc.client5.http.impl.io.PoolingHttpClientConnectionManagerBuilder;
import org.apache.hc.client5.http.ssl.NoopHostnameVerifier;
import org.apache.hc.client5.http.ssl.SSLConnectionSocketFactory;
import org.apache.hc.client5.http.ssl.SSLConnectionSocketFactoryBuilder;
import org.apache.hc.core5.ssl.SSLContexts;
import org.apache.hc.core5.ssl.TrustStrategy;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestClient;

import javax.net.ssl.SSLContext;
import java.util.Map;


public class HueClipV2Client {

    private static final String HUE_APPLICATION_KEY_HEADER  = "hue-application-key";

    RestClient restClient;

    public HueClipV2Client(HueApiConfig apiConfig) {
        this.initialiseClient(apiConfig);
    }

    @SneakyThrows
    private void initialiseClient(HueApiConfig apiConfig) {

        //Remove this and do proper certificate
        TrustStrategy acceptingTrustStrategy = (x509Certificates, s) -> true;
        SSLContext sslContext = SSLContexts.custom().loadTrustMaterial(null, acceptingTrustStrategy).build();

        PoolingHttpClientConnectionManager connectionManager = PoolingHttpClientConnectionManagerBuilder.create()
            .setSSLSocketFactory(new SSLConnectionSocketFactory(sslContext, new NoopHostnameVerifier()))
            .build();

        CloseableHttpClient httpClient = HttpClients
            .custom()
            .setConnectionManager(connectionManager)
            .build();


        HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
        requestFactory.setHttpClient(httpClient);

        //Remove this and do proper certificate

        restClient = RestClient.builder()
            .requestFactory(requestFactory)
            .baseUrl(apiConfig.getBaseUrl())
            .defaultHeader(HUE_APPLICATION_KEY_HEADER, apiConfig.getHueApplicationKey())
            .messageConverters(converters -> converters.add(new MappingJackson2HttpMessageConverter(apiConfig.getObjectMapper())))
            .build();

    }

    public HueLightResourceResponse getHueLightResources() {

       var entity = restClient.get()
            .uri("resource/light")
            .accept(MediaType.APPLICATION_JSON)
            .retrieve()
            .toEntity(HueLightResourceResponse.class);

       return entity.getBody();

    }

    public HueResourceResponse updateHueLightResource(HueLightResourceUpdateRequest request) {

        var entity = restClient.put()
            .uri("resource/light/{id}", Map.of("id", request.getId()))
            .accept(MediaType.APPLICATION_JSON)
            .contentType(MediaType.APPLICATION_JSON)
            .body(request)
            .retrieve()
            .toEntity(HueResourceResponse.class);

        return entity.getBody();

    }




}
