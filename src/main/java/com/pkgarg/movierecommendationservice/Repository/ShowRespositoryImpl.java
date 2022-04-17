package com.pkgarg.movierecommendationservice.Repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Repository
public class ShowRespositoryImpl implements IShowRespository {

    private static final String TV_MAZE_API = "https://api.tvmaze.com";
    private static final String SEARCH_SHOW = "/search/shows?q=";

    public List<Object> getAllShowsByQuery(String query) {
        RestTemplate restTemplate = new RestTemplate();
        String queryUri = TV_MAZE_API + SEARCH_SHOW + query;
        Object[] shows = restTemplate.getForObject(queryUri, Object[].class);
        return Arrays.asList(shows);
    }
}
