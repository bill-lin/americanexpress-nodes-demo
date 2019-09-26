package com.demo;

import io.aexp.nodes.graphql.annotations.GraphQLArgument;
import io.aexp.nodes.graphql.annotations.GraphQLArguments;
import io.aexp.nodes.graphql.annotations.GraphQLProperty;

@GraphQLProperty(name = "user", arguments = {@GraphQLArgument(name = "login", type = "String")})
public class User {
	private String name;

	private String location;

	@GraphQLArguments({
			@GraphQLArgument(name = "name",type = "String"),
	})
	private RepositoryConnection  repository;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public RepositoryConnection getRepository() {
		return repository;
	}

	public void setRepository(RepositoryConnection repository) {
		this.repository = repository;
	}

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				", location='" + location + '\'' +
				", repository=" + repository +
				'}';
	}
}

