package io.github.futurewl.web.rest.feign;

import feign.Param;
import feign.RequestLine;

public interface PersonClient {

    @RequestLine("GET /person/{name}")
    Person getPerson(@Param("name") String name);

}
