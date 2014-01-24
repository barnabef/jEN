package com.echonest.api.v4;

import com.echonest.api.v4.util.MQuery;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Represents and Echo Nest Artist
 * 
 * @author plamere
 * 
 */
public class Genre {
    private final static String PATH = "genre";
    private final static String TYPE = "genre";
    private Map<String, Object> data;

    @SuppressWarnings("unchecked")
    Genre(Map<String, Object> data) throws EchoNestException {
        this.data = data;
    }
    /**
     * Gets the name of the artist
     *
     * @return the name of the artist
     * @throws com.echonest.api.v4.EchoNestException
     */
    public String getName() throws EchoNestException {
        return (String) data.get("name");
    }

    /**
     * Gets a map of URLs for this artist
     *
     * @return
     * @throws com.echonest.api.v4.EchoNestException
     */
    @SuppressWarnings("unchecked")
    public Map<String, String> getUrls() throws EchoNestException {
        Map map = (Map<String, String>) data.get("urls");
        Map<String, String> results = new HashMap<String, String>();
        for (Object key : map.keySet()) {
            results.put((String) key, (String) map.get(key));
        }
        return results;
    }

    /**
     * Gets a map of URLs for this artist
     *
     * @return
     * @throws com.echonest.api.v4.EchoNestException
     */
    @SuppressWarnings("unchecked")
    public String getDescription() throws EchoNestException {
        return (String) data.get("description");
    }

    /**
     * Gets a map of URLs for this artist
     *
     * @return
     * @throws com.echonest.api.v4.EchoNestException
     */
    @SuppressWarnings("unchecked")
    public double getSimilarity() throws EchoNestException {
        return (Double) data.get("similarity");
    }

}
