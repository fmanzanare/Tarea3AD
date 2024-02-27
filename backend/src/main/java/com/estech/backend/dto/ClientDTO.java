package com.estech.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ClientDTO {

    private Long id;
    private String name;
    private String lastnameOne;
    private String lastnameTwo;
    private String email;
    private List<Double> invoices;

}
