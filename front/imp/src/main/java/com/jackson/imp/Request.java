/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jackson.imp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luis
 */
public class Request {

    URL url;
    HttpURLConnection connection;
    String api = "http://localhost:8080/";

    public String getRequest(String endpoint) throws MalformedURLException, IOException {
        url = new URL(api + endpoint);
        connection = (HttpURLConnection) url.openConnection();

        connection.setRequestMethod("GET");
        connection.setRequestProperty("Accept", "application/json");

        if (!(connection.getResponseCode() == 200)) {
            System.out.println("request failed: " + connection.getResponseMessage());
            return null;
        }

        System.out.println("request sent successfully");

        InputStream is = connection.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        StringBuilder jsonResponse = new StringBuilder();

        String line;

        while ((line = br.readLine()) != null) {
            jsonResponse.append(line);
        }

        br.close();
        is.close();

        return jsonResponse.toString();
    }

    public void putRequest(String endpoint, String requestBody) throws MalformedURLException, IOException {
        url = new URL(api + endpoint);
        connection = (HttpURLConnection) url.openConnection();

        connection.setRequestMethod("PUT");
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setRequestProperty("Accept", "application/json");
        connection.setDoOutput(true);

        try (OutputStream os = connection.getOutputStream()) {
            byte[] input = requestBody.getBytes("utf-8");
            os.write(input, 0, input.length);
        }

        int responseCode = connection.getResponseCode();
        System.out.println("Response Code: " + responseCode);

        if (responseCode == 200) {
            InputStream is = connection.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            StringBuilder jsonResponse = new StringBuilder();

            String line;

            while ((line = br.readLine()) != null) {
                jsonResponse.append(line);
            }

            br.close();
            is.close();

            System.out.println("Response: " + jsonResponse.toString());
        } else {
            System.out.println("Request failed: " + connection.getResponseMessage());
        }
    }

    public void postRequest(String endpoint, String requestBody) throws MalformedURLException, IOException {
        url = new URL(api + endpoint);
        connection = (HttpURLConnection) url.openConnection();

        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setRequestProperty("Accept", "application/json");
        connection.setDoOutput(true);

        try (OutputStream os = connection.getOutputStream()) {
            byte[] input = requestBody.getBytes("utf-8");
            os.write(input, 0, input.length);
        }

        int responseCode = connection.getResponseCode();
        System.out.println("Response Code: " + responseCode);
    }

    public String deleteRequest(String endpoint) throws MalformedURLException, IOException {
        url = new URL(api + endpoint);
        connection = (HttpURLConnection) url.openConnection();

        connection.setRequestMethod("DELETE");
        connection.setRequestProperty("Accept", "application/json");

        if (!(connection.getResponseCode() == 200)) {
            System.out.println("request failed: " + connection.getResponseMessage());
            return null;
        }

        System.out.println("request sent successfully");

        InputStream is = connection.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        StringBuilder jsonResponse = new StringBuilder();

        String line;

        while ((line = br.readLine()) != null) {
            jsonResponse.append(line);
        }

        br.close();
        is.close();

        return jsonResponse.toString();
    }
}
