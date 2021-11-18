package com.serenity.steps.rest;

import static io.restassured.RestAssured.given;

import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;

public class demo {
	
	public ExtractableResponse<Response> getDetails() {
		
		
		String url="https://sasi-test1.kubeodc.corp.intranet//inventory/v1/mesh/paths?aend=LTTNCOML&product=ETHERNET&numpaths=1&bandwidth=1000&diversity=No&interface=Optical&protection=No&lowLatency=No&dwdmOnly=No";
		
		
		return given().when().get(url).then().extract();
				
	}

}
