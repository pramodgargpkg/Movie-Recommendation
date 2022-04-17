package com.pkgarg.movierecommendationservice.Repository;

import java.util.List;

public interface IShowRespository {

    List<Object> getAllShowsByQuery(String query);


}
