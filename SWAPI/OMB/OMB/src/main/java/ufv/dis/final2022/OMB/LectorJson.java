package ufv.dis.final2022.OMB;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LectorJson {
    public LectorJson() {
    }

    public ArrayList<TraeDatos> leeFicheroJson1() throws Exception {
        try {
            String jsonString = new String(Files.readAllBytes(Paths.get("src/main/resources/sample4.json")));
            Type listType = (new TypeToken<ArrayList<TraeDatos>>() {
            }).getType();
            JsonObject jsonObject1 = (new JsonParser()).parse(jsonString).getAsJsonObject();
            JsonArray jsonArray1 = jsonObject1.getAsJsonArray("people");
            ArrayList<TraeDatos> info = (ArrayList)(new Gson()).fromJson(jsonArray1, listType);
            return info;
        } catch (IOException var6) {
            var6.printStackTrace();
            return new ArrayList();
        }
    }
}
