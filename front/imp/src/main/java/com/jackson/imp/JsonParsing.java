/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jackson.imp;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luis
 */
public class JsonParsing {

    ObjectMapper om = new ObjectMapper();

    public <T> ArrayList<T> parseArray(String jsonArray, Class<T> object) throws JsonProcessingException {
        return om.readValue(jsonArray, om.getTypeFactory().constructCollectionType(ArrayList.class, object));
    }

    public <T> T parse(String json, Class<T> object) throws JsonProcessingException {
        return om.readValue(json, object);
    }

    public <T> String parse(T object) throws JsonProcessingException {
        return om.writeValueAsString(object);
    }

}
