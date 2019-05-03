package com.example.demo.service;

import java.io.IOException;
import java.net.MalformedURLException;

import com.example.demo.domain.Summoner;

/**
 * summonerService
 */
public interface SummonerService {

    Summoner getSummonerByName(String name) throws MalformedURLException, IOException;
}