package com.cydeo.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

/** What is put here will appear on the JSON output body (POSTMAN) **/

@Getter
@Setter
public class ResponseWrapper {

    // HOW WE ADD A 'WELCOME' RESPONSE MESSAGE

    private boolean success;
    private String message;
    private Integer code;
    private Object data; // <- generic

    public ResponseWrapper(String message, Object data) {
        this.message = message;
        this.code = HttpStatus.OK.value();
        this.data = data;
        this.success = true;
    }

//    For DELETE methods (no data is returned)
    public ResponseWrapper(String message) {
        this.message = message;
        this.code = HttpStatus.OK.value();
        this.success = true;
    }
}
