package com.fc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Topaid {
    private Integer id;
    private String house_id;
    private String address;
    private Date date;
    private Double price;

    private String name;
    private Integer userlist_id;
    private String status;


}
