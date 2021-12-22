package com.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author Miguel Castro
 */
public class Main {
    
    public static void main(String[] args) throws IOException {
        
        
        //Objeto Java para JSON (Serialização)
        ObjectMapper objectMapper = new JsonMapper();
        
        Person person = new Person("Miguel Castro", "miguel.castro9@hotmail.com", "Desenvolvedor");
        objectMapper.writeValue(new File("target/person.json"), person);
        
        
        //JSON para Objeto Java (Desserialização)
        person = objectMapper.readValue(new File("target/person.json"), Person.class);
    } 
}
