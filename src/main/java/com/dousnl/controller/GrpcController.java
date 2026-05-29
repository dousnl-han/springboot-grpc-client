package com.dousnl.controller;

import com.dousnl.HelloRequest;
import com.dousnl.HelloResponse;
import com.dousnl.HelloServiceGrpc;

import com.dousnl.resp.HelloResp;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GrpcController {

    @GrpcClient("dousnl-grpc-server")
    private HelloServiceGrpc.HelloServiceBlockingStub helloService;


    @RequestMapping("/hello")
    public HelloResp hello(@RequestParam("name")  String name) {


        HelloResponse response = helloService.sayHello(HelloRequest.newBuilder().setName(name).build());
        return HelloResp.builder().code(response.getCode1()).message(response.getResponse()).build();
    }

    public static void main(String[] args) {
        System.out.println(120*60);
        System.out.println((System.currentTimeMillis() - 1761876241000L));
        System.out.println((System.currentTimeMillis() - 1761876241000L) / 1000);
    }

}
