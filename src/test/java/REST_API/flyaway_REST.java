package REST_API;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class flyaway_REST {
 @Test
  public void User_Registration() {
	  RestAssured.baseURI ="http://localhost:8080/FlyAway";
	  RequestSpecification given = RestAssured.given();
	  JSONObject reqparam=new JSONObject();
	  reqparam.put("email_id", "sarika10@gmail.com");
	  reqparam.put("pwd", "sarika");
	  reqparam.put("pwd2", "sarika");
	  
	  given.header("Content-Type", "text/html");
	  //given.body(reqparam.toJSONString());
	  
	  Response response = given.request(Method.POST, "/signup");
	  System.out.println(response.getBody().asString());
  }
 @Test
  public void User_Login() {
	  RestAssured.baseURI ="http://localhost:8080/FlyAway";
	  RequestSpecification given = RestAssured.given();
	  JSONObject reqparam=new JSONObject();
	  reqparam.put("email_id", "user@user.com");
	  reqparam.put("pwd", "user");
	  given.header("Content-Type", "application/json");
	  given.body(reqparam.toJSONString());
	  
	  Response response = given.request(Method.POST, "/login");
	 
	  System.out.println(response.getBody().asString());
  }
  @Test
  public void Home_Page() {
	  RestAssured.baseURI ="http://localhost:8080/FlyAway";
	  RequestSpecification given = RestAssured.given();
	  Response response = given.request(Method.GET, "/home");
	  System.out.println(response.asString());
  }
  @Test
  public void places() {
	  RestAssured.baseURI ="http://localhost:8080/FlyAway";
	  RequestSpecification given = RestAssured.given();
	  Response response = given.request(Method.GET, "/home?source=1&destination=11");
	  System.out.println(response.asString());
  }
  @Test
  public void Book_flight() {
	  RestAssured.baseURI ="http://localhost:8080/FlyAway";
	  RequestSpecification given = RestAssured.given();
	  Response response = given.request(Method.GET, "/bookflight?id=7");
	  System.out.println(response.asString());
  }
  @Test
  public void Booking_confirmation() {
	  RestAssured.baseURI ="http://localhost:8080/FlyAway";
	  RequestSpecification given = RestAssured.given();
	  Response response = given.request(Method.GET, "/completepurchase");
	  System.out.println(response.asString());
  }
  @Test
  public void View_Bookings() {
	  RestAssured.baseURI ="http://localhost:8080/FlyAway";
	  RequestSpecification given = RestAssured.given();
	  Response response = given.request(Method.GET, "/memberbookings");
	  System.out.println(response.asString());
  }
  @Test
  public void User_Logout() {
	  RestAssured.baseURI ="http://localhost:8080/FlyAway";
	  RequestSpecification given = RestAssured.given();
	  Response response = given.request(Method.GET, "/logout");
	  System.out.println(response.asString());
  }
  
}
