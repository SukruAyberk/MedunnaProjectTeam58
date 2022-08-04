package utilities;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

public class JsonUtil {

    private static ObjectMapper mapper;

    static {
        mapper = new ObjectMapper();
    }

    //1. method: JSon datasını Java objesine çevirir -> De-Serialization
    //İkinci parametreyi daha sonra kendim belirlemek için böyle yaptım
    //Bunu object yapabilirdim ama ben gelen datanın obje olmasını istemiyorum,
    //Ben gelen datanın belirli spesifik bir data olarak gelmesini istiyorum.
    //Bunun gibi her tür data ile çalışan methodlara "Generic Methodlar" denir.
    public static <T> T convertJsonToJavaObject(String json, Class<T> cls) {
        T javaResult = null;
        try {
            javaResult = mapper.readValue(json, cls);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return javaResult;
    }

    //2. öethod: Java Objesini KSon Dataya çevirir -> Serialization
    public static String convertJavaObjectToJson(Object obj) {
        String jsonResult = null;

        try {
            jsonResult = mapper.writeValueAsString(obj);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return jsonResult;

    }

}
