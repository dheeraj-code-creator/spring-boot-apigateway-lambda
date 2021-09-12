package com.example.aws.lambda.handler;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.example.aws.lambda.entity.User;
import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

import java.util.List;

public class UserHandler extends SpringBootRequestHandler<APIGatewayProxyRequestEvent, List<User>> {

}
