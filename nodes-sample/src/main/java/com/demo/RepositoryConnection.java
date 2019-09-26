package com.demo;

import io.aexp.nodes.graphql.annotations.GraphQLArgument;
import io.aexp.nodes.graphql.annotations.GraphQLArguments;

public class RepositoryConnection {
	private String name;

	private String description;

	@GraphQLArguments({
			@GraphQLArgument(name = "refPrefix", value = "refs/heads/",type = "String")
	})
	private Refs refs;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Refs getRefs() {
		return refs;
	}

	public void setRefs(Refs refs) {
		this.refs = refs;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "RepositoryConnection{" +
				"name='" + name + '\'' +
				", description='" + description + '\'' +
				", refs=" + refs +
				'}';
	}
}
