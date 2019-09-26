package com.demo;

import io.aexp.nodes.graphql.annotations.GraphQLProperty;

@GraphQLProperty(name = "refs")
public class Refs {
	private int totalCount;

	public int getTotalCount() {
		return totalCount;
	}

	@Override
	public String toString() {
		return "Refs{" +
				"totalCount=" + totalCount +
				'}';
	}
}