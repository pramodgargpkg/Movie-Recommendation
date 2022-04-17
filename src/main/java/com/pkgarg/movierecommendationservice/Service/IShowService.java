package com.pkgarg.movierecommendationservice.Service;

import java.util.List;

public interface IShowService {
    List<Object> getShows(String userId);

    List<Object> getAllShowsByQuery(String query);

    Object getNewRecommendation(String userId, String query);
}
