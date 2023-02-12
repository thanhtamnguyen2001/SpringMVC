package com.ntt.EconomyApp.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PagingResponseDTO implements Serializable {

    private Integer page;

    private Integer totalPages;

    private Integer size;

    private Long totalRecords;

    private List<?> responseObjectList;
}
