package com.example.learn.demo.modle;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Response {
    private String code;
    private String message;
    private Object data;

   public Response(String code,String message)
    {
        this.code=code;
        this.message=message;
        this.data=null;
    }

}
