package com.spyder.conman.controller;

import com.spyder.conman.request.FirstPostRequest;
import com.spyder.conman.response.FirstPostResponse;
import com.spyder.conman.utils.Utility;
import org.springframework.web.bind.annotation.*;
//import lombok.extern.slf4j.Slf4j;
import javax.ws.rs.core.MediaType;
import org.apache.commons.lang3.builder.ToStringBuilder;


//@Slf4j
@RestController
@RequestMapping("/test/v1")
public class TestApiController {

    @RequestMapping(value = {"/"},method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON)
    public String hello(){
        return "Hello Spring boot application";
    }

    @RequestMapping(value = "/h1",method = RequestMethod.GET)
    public String hello1(@RequestParam(value = "userId") String userId){
        return "Hello Spring boot application1->"+userId;
    }

    @RequestMapping(value = {"/post"},method = RequestMethod.POST)
    public String postTest(@RequestHeader("version") String version,
                           @RequestBody FirstPostRequest request){
        String res=new ToStringBuilder(this).append("status_code","0")
                                                    .append("status_message","Done Successfully")
                                                .append("order_id",request.getOrderId()).toString();
        System.out.println("response--->"+res);
        //FirstPostResponse firstPostResponse = Utility.jsonDecode(res, FirstPostResponse.class);
       // System.out.println(firstPostResponse);
        return "Post test=>" +version+"---"+res;
    }
}
