package com.example.demo.service.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.alibaba.fastjson.JSON;
import com.example.demo.domain.Summoner;
import com.example.demo.service.SummonerService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * summonerServiceImpl
 */
@Service
public class SummonerServiceImpl implements SummonerService {

    HttpURLConnection connection;
    @Value("${api-token}")
	private String APIToken;

    @Override
    public Summoner getSummonerByName(String name) throws IOException {

        URL summonerUrl = new URL("https://euw1.api.riotgames.com/lol/summoner/v4/summoners/by-name/"+name);
        connection = (HttpURLConnection)summonerUrl.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("X-Riot-Token", this.APIToken);
        connection.setRequestProperty("Accept", "application/json");

        // request

        // response
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        if (connection.getResponseCode()>299) {
            return null;
        }
        String inputLine;
        StringBuffer content = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        connection.disconnect();

        Summoner summoner = JSON.parseObject(content.toString(),Summoner.class);
        return summoner;
    }


}