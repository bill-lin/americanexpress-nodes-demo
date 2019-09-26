package com.demo;


import io.aexp.nodes.graphql.Argument;
import io.aexp.nodes.graphql.Arguments;
import io.aexp.nodes.graphql.GraphQLRequestEntity;
import io.aexp.nodes.graphql.GraphQLResponseEntity;
import io.aexp.nodes.graphql.GraphQLTemplate;
import io.aexp.nodes.graphql.Variable;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

public class GraphqlQueryTest {
	public static final String HTTPS_API_GITHUB_COM_GRAPHQL = "https://api.github.com/graphql";
	private static final String USERNAME = "bill-lin";
	private static final String YOUR_AUTH_TOKEN = "xxxxxxx";
	private static final String repo = "apollo-android-generated-sample";

	@Test
	public void createSimpleRequest() throws MalformedURLException {
		Map<String, String> headers = new HashMap<>();
		headers.put("Authorization", "bearer "+ YOUR_AUTH_TOKEN);

		GraphQLRequestEntity requestEntity = GraphQLRequestEntity.Builder()
				.url(HTTPS_API_GITHUB_COM_GRAPHQL)
				.requestMethod(GraphQLTemplate.GraphQLMethod.QUERY)
				.headers(headers)
				.request(User.class)
				.arguments(
						new Arguments("user", new Argument("login", USERNAME)),
						new Arguments("user.repository", new Argument("name", repo))
						)
				.variables(new Variable("isFork", true))
				.scalars(BigDecimal.class, BigInteger.class)
				.build();
		requestEntity.setRequestMethod(GraphQLTemplate.GraphQLMethod.QUERY);

		System.out.println("GraphQL Request:\n"+requestEntity.toString());

		GraphQLResponseEntity<User> responseEntity = new GraphQLTemplate().query(requestEntity, User.class);
		System.out.println("GraphQL Response:\n"+responseEntity.getResponse().toString());
	}
}