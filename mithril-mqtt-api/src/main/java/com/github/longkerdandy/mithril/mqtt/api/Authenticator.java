package com.github.longkerdandy.mithril.mqtt.api;

import java.util.concurrent.CompletableFuture;

/**
 * Authenticator
 */
public interface Authenticator {

    /**
     * Authorize client CONNECT
     *
     * @param clientId Client Id
     * @param userName User Name
     * @param password Password
     * @return Authorize Result
     */
    CompletableFuture<AuthorizeResult> authConnect(String clientId, String userName, String password);

    /**
     * Authorize client PUBLISH
     *
     * @param clientId  Client Id
     * @param userName  User Name
     * @param topicName Topic Name
     * @param qos       QoS Level
     * @return Authorize Result
     */
    CompletableFuture<AuthorizeResult> authPublish(String clientId, String userName, String topicName, String qos);
}