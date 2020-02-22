package com.spyder.conman.utils;

import java.io.IOException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.JavaType;

public class Utility {

        public static <T> T jsonDecode(String s, Class<?> clazz) {
            ObjectMapper objectMapper = new ObjectMapper();
            JavaType classType = objectMapper.getTypeFactory().constructType(clazz);
         //   T cartV2Response = null;
            try {
                return objectMapper.reader(classType).readValue(s);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }

    /*    public static String jsonEncode(Object object){
            JsonHelper jh = new JsonHelper();
            String payload = null;
            try {
                return jh.getObjectToJSON(object);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }*/

    }

