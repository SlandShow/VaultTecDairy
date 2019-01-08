package com.slandshow.vtdairy.models.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class EntryDto {

    private Long id;
    private String date;
    private String title;
    private ContentDto content;

}
