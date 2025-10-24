package com.dousnl.resp;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class HelloResp {

    private String name;
    private String message;
    private int code;

}
