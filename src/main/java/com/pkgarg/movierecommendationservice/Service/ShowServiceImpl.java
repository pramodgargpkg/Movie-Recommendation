package com.pkgarg.movierecommendationservice.Service;

import com.pkgarg.movierecommendationservice.Model.User;
import com.pkgarg.movierecommendationservice.Repository.IShowRespository;
import com.pkgarg.movierecommendationservice.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShowServiceImpl implements IShowService {

    private final UserRepository userRepository;
    private final IShowRespository showRespository;

    @Autowired
    public ShowServiceImpl(UserRepository userRepository, IShowRespository showRespository) {
        this.userRepository = userRepository;
        this.showRespository = showRespository;
    }

    @Override
    public List<Object> getShows(String userId) {
        return userRepository.findById(userId).get().getShowList();
    }

    @Override
    public List<Object> getAllShowsByQuery(String query) {
        return showRespository.getAllShowsByQuery(query);
    }

    @Override
    public Object getNewRecommendation(String userId, String query) {
        List<Object> shows = showRespository.getAllShowsByQuery(query);
        List<Object> existingRecommendedShows = userRepository.findById(userId).get().getShowList();
        for (Object show : shows) {
            if (existingRecommendedShows == null) {
                User user = userRepository.findById(userId).get();
                user.setShowList(new ArrayList<>());
                user.getShowList().add(show);
                userRepository.save(user);
                return show;
            }
            if (!existingRecommendedShows.contains(show)) {
                User user = userRepository.findById(userId).get();
                user.getShowList().add(show);
                userRepository.save(user);
                return show;
            }
        }
        return "No shows found";
    }


}
