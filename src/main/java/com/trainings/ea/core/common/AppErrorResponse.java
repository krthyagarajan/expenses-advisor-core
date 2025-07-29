package com.trainings.ea.core.common;

import lombok.Data;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Data
public class AppErrorResponse  {

    private String errorMessage;
    private Integer statusCode;


}
