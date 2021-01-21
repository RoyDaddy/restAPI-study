package com.kdh.rest.vo;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

/**
 * R
 */

@Getter
@ToString
public class Response<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    private T data;
  
    @Builder
    public Response(T data) {
      this.data = data;
    }
}