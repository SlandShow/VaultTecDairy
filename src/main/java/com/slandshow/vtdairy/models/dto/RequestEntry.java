package com.slandshow.vtdairy.models.dto;

import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class RequestEntry {

    private String title;
    private String contentText;

    @ApiParam(allowEmptyValue = true)
    public RequestEntry setTitle(String title) {
        this.title = title;
        return this;
    }

    @ApiParam(allowEmptyValue = true)
    public RequestEntry setContentText(String contentText) {
        this.contentText = contentText;
        return this;
    }

}
