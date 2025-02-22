package com.jobfinder.job_finder.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jobfinder.job_finder.models.Job;

@Service
public class JobScraperService {

    public List<Job> fetchJobs() {
        // Dummy data for now - Later, you will scrape real job listings
        return Arrays.asList(
            new Job("Software Engineer", "Google", "Remote", "https://jobs.google.com"),
            new Job("Junior Developer", "Amazon", "Seattle, WA", "https://jobs.amazon.com")
        );
    }
}