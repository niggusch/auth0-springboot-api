### Spring Boot / Auth0 JWT API

Demonstrates a modern approach to using Auth0 with SpringBoot and Spring Security to create an API Server.

Leverages Auth0 dependencies:

[Spring Security Auth0](https://github.com/auth0/spring-security-auth0)

[Auth0 Java](https://github.com/auth0/auth0-java)


Useful quick start reference to getting started with [Spring Boot](https://docs.spring.io/spring-boot/docs/current/reference/html/getting-started-first-application.html)

### Prerequisites

In order to run this example you will need to have Maven installed. You can install Maven with [brew](http://brew.sh/):

```sh
brew install maven
```

Check that your maven version is 3.0.x or above:

```sh
mvn -v
```

#### Instructions to get started.

Create an application in via [Auth0 Dashboard](https://auth0.com/)

Add your `auth0_domain`, `client_id`, and `client_secret` to src/main/resources/auth0.properties of this project of this project

### Build and Run

In order to build and run the project you must execute:
```sh
mvn clean package
```

```sh
java -jar target/auth0-springboot-api-0.0.1-SNAPSHOT.jar
```

### Test the API

To run a request against the two exposed API endpoints, simply make a GET or POST request as follows (using any http library / technology you choose):

```
curl -X GET -H "Authorization: Bearer {{YOUR JWT TOKEN}}" -H "Content-Type: application/json" -H "Cache-Control: no-cache" -H "Postman-Token: c1b68180-4b90-e5b4-3896-d5c1fdece168" "http://localhost:8080/secured/get"
```

or

```
curl -X POST -H "Authorization: Bearer {{YOUR JWT TOKEN}}" -H "Content-Type: application/json" -H "Cache-Control: no-cache" -H "Postman-Token: 882c97c9-0802-d937-d419-583ba714609c" -d '{"hello":"world"}' "http://localhost:8080/secured/post"
```

Key Point: Remember to include the `Authorization: Bearer {{YOUR JWT TOKEN}}"` header. You can generate a JWT perhaps easiest by downloading
a web client sample from the Auth0 Dashboard for the same application you defined above, and then by logging using that App and retrieving the
generated JWT token that way.


Finally, there is also a POSTMAN collection available inside the `/postman` directory. Import this into POSTMAN, set up a POSTMAN
environment variable called `token` with a JWT value and you are ready to go with an HTTP Client out of the box!


## What is Auth0?

Auth0 helps you to:

* Add authentication with [multiple authentication sources](https://docs.auth0.com/identityproviders), either social like **Google, Facebook, Microsoft Account, LinkedIn, GitHub, Twitter, Box, Salesforce, amont others**, or enterprise identity systems like **Windows Azure AD, Google Apps, Active Directory, ADFS or any SAML Identity Provider**.
* Add authentication through more traditional **[username/password databases](https://docs.auth0.com/mysql-connection-tutorial)**.
* Add support for **[linking different user accounts](https://docs.auth0.com/link-accounts)** with the same user.
* Support for generating signed [Json Web Tokens](https://docs.auth0.com/jwt) to call your APIs and **flow the user identity** securely.
* Analytics of how, when and where users are logging in.
* Pull data from other sources and add it to the user profile, through [JavaScript rules](https://docs.auth0.com/rules).

## Create a free account in Auth0

1. Go to [Auth0](https://auth0.com) and click Sign Up.
2. Use Google, GitHub or Microsoft Account to login.

## Issue Reporting

If you have found a bug or if you have a feature request, please report them at this repository issues section. Please do not report security vulnerabilities on the public GitHub issue tracker. The [Responsible Disclosure Program](https://auth0.com/whitehat) details the procedure for disclosing security issues.

## Author

[Auth0](auth0.com)

And a big shout out to `Mark Britten` who contributed much of this content whilst working on a personal project, and freely donating it.

## License

This project is licensed under the MIT license. See the [LICENSE](LICENSE.txt) file for more info.


