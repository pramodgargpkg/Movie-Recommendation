package com.pkgarg.movierecommendationservice.Controller;

import com.pkgarg.movierecommendationservice.Service.IShowService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/shows")
public class ShowController {
    private final IShowService showService;

    public ShowController(IShowService showService) {
        this.showService = showService;
    }

    @GetMapping("/{userId}")
    public List<Object> getShows(@PathVariable String userId) {
        return showService.getShows(userId);
    }

    @GetMapping("/allShows")
    public ResponseEntity<?> getAllShowsByQuery(@RequestParam String query) {
        try {
            return ResponseEntity.ok(showService.getAllShowsByQuery(query));
        } catch (Exception e) {
            e.printStackTrace();
            return (ResponseEntity<?>) ResponseEntity.notFound();
        }
    }

    @GetMapping("/{userId}/recommendation")
    public ResponseEntity<?> getShowRecommendationByQuery(@PathVariable String userId, @RequestParam String query) {
        try {
            return ResponseEntity.ok(showService.getNewRecommendation(userId, query));
        } catch (Exception e) {
            e.printStackTrace();
            return (ResponseEntity<?>) ResponseEntity.notFound();
        }
    }

    @DeleteMapping("/{userId}/reset")
    public Optional<?> deleteAllRecommendations(@PathVariable String userId) {
        return showService.deleteAllRecommendations(userId);
    }
}
