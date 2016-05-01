package com.rssfeedaggregator.api;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

import org.glassfish.jersey.client.ClientConfig;

public abstract class GenericAPI {
	protected static String baseUrl = "http://localhost:8080/rssaggregator/api";
	protected static Client client = ClientBuilder.newClient(new ClientConfig());
}
