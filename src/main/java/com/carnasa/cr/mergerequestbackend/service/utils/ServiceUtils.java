package com.carnasa.cr.mergerequestbackend.service.utils;

import org.springframework.data.domain.PageRequest;

public class ServiceUtils {

    public static final Integer DEFAULT_PAGE_SIZE = 25;
    public static final Integer DEFAULT_PAGE = 0;

    public static PageRequest buildPageRequest(Integer pageNumber, Integer pageSize){
        int queryPageNumber;
        int queryPageSize;

        if(pageNumber != null && pageNumber > 0){
            queryPageNumber = pageNumber-1;
        }
        else{
            queryPageNumber = DEFAULT_PAGE;
        }

        if(pageSize == null){
            queryPageSize = DEFAULT_PAGE_SIZE;
        }
        else if(pageSize > 1000){
            queryPageSize = pageSize;
        }
        else{
            queryPageSize = pageSize;
        }
        return PageRequest.of(queryPageNumber,queryPageSize);
    }
}
