package com.rssfeedaggregator.api;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.client.ClientConfig;

public class APIHelper {
	private final String baseUrl = "http://localhost:8080/rssaggregator/api";
	private final Client client;
	private final WebTarget target;

	private APIHelper() {
		client = ClientBuilder.newClient();
		System.setProperty("sun.net.http.allowRestrictedHeaders", "true");
		target = client.target(baseUrl);
	}

	/** Holder */
	private static class SingletonHolder {
		/** Instance unique non préinitialisée */
		private final static APIHelper instance = new APIHelper();
	}

	/** Point d'accès pour l'instance unique du singleton */
	private static APIHelper getInstance() {
		return SingletonHolder.instance;
	}

	public static WebTarget getTarget() {
		return getInstance().target;
	}
	
	public static void saveAPICookie(Response res)
	{
		
	}
}
