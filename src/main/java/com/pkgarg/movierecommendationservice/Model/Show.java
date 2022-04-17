package com.pkgarg.movierecommendationservice.Model;

import java.util.List;

public class Show {
    private int id;
    private String url;
    private String name;
    private String type;
    private String language;
    private List<String> genres;
    private String status;
    private int runtime;
    private int averageRunTime;
    private String premiered;
    private String ended;
    private String officialSite;
    private String summary;

    public Show(int id, String url, String name, String type, String language, List<String> genres, String status, int runtime, int averageRunTime, String premiered, String ended, String officialSite, String summary) {
        this.id = id;
        this.url = url;
        this.name = name;
        this.type = type;
        this.language = language;
        this.genres = genres;
        this.status = status;
        this.runtime = runtime;
        this.averageRunTime = averageRunTime;
        this.premiered = premiered;
        this.ended = ended;
        this.officialSite = officialSite;
        this.summary = summary;
    }

    @Override
    public String toString() {
        return "Show{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", language='" + language + '\'' +
                ", genres=" + genres +
                ", status='" + status + '\'' +
                ", runtime=" + runtime +
                ", averageRunTime=" + averageRunTime +
                ", premiered='" + premiered + '\'' +
                ", ended='" + ended + '\'' +
                ", officialSite='" + officialSite + '\'' +
                ", summary='" + summary + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public int getAverageRunTime() {
        return averageRunTime;
    }

    public void setAverageRunTime(int averageRunTime) {
        this.averageRunTime = averageRunTime;
    }

    public String getPremiered() {
        return premiered;
    }

    public void setPremiered(String premiered) {
        this.premiered = premiered;
    }

    public String getEnded() {
        return ended;
    }

    public void setEnded(String ended) {
        this.ended = ended;
    }

    public String getOfficialSite() {
        return officialSite;
    }

    public void setOfficialSite(String officialSite) {
        this.officialSite = officialSite;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}
