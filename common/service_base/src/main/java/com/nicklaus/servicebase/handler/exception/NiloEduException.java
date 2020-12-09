package com.nicklaus.servicebase.handler.exception;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NiloEduException extends RuntimeException {

    private Integer code;
    private String msg;
}
