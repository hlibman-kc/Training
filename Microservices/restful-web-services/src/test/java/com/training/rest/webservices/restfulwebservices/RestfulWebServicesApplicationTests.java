package com.training.rest.webservices.restfulwebservices;

import com.training.rest.webservices.restfulwebservices.user.User;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Date;

import static io.restassured.RestAssured.*;
import static io.restassured.http.ContentType.JSON;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.util.AssertionErrors.assertTrue;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class RestfulWebServicesApplicationTests {

	@Test
	void getUser() {
		get("/users/1")
				.then()
				.contentType(JSON)
				.body("name", equalTo("Adam"))
				.body("id", equalTo(1))
				.body("_links.all-users.href", equalTo("http://localhost:8080/users"));

		/*
		{
    "id": 1,
    "name": "Adam",
    "birthDate": "2021-03-05T21:02:38.636+00:00",
    "posts": null,
    "_links": {
        "all-users": {
            "href": "http://localhost:8080/users"
        }
    }
}
		 */
	}

	@Test
	void createUser() {

		RequestSpecification request = given();
		request.header("content-type", MediaType.APPLICATION_JSON_VALUE);
		request.body(new User("Hank", new Date()));
		Response response = request.post("/users").andReturn();
		assertEquals(HttpStatus.CREATED.value(), response.getStatusCode());
		String location = response.getHeader("location");
		assertTrue(String.format("%s should end with /users/4", location), location.endsWith("/users/4"));
	}
}
