package com.fc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QueryVo {
    private String zuname;
    private String fromdate;
    private String todate;
    private Integer userlist_id;

}
