# americanexpress-nodes-demo
demo americanexpress-nodes graphql java client


[GraphqlQueryTest](nodes-sample/src/test/java/com/demo/GraphqlQueryTest.java)
demo query github graphql service:

- USERNAME
- YOUR_AUTH_TOKEN (https://help.github.com/en/articles/creating-a-personal-access-token-for-the-command-line)
- repo name

example response:
```
GraphQL Request:
GraphQLRequestEntity{request='query { user (login:"bill-lin") { name location repository (name:"apollo-android-generated-sample") { refs (refPrefix:"refs/heads/") { totalCount } name description } } } ', url='https://api.github.com/graphql'}
GraphQL Response:
User{name='Bill Lin', location='London', repository=RepositoryConnection{name='apollo-android-generated-sample', description='Graphql java client code generated from apollo-gradle-plugin', refs=Refs{totalCount=1}}}

```