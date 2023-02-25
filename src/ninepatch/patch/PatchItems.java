package ninepatch.patch;

import ninepatch.core.type.Item;
import com.google.gson.*;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

public class PatchItems {
    public void patch(List<Item> itemList) throws IOException {
        Path backupItems = Paths.get("backup/sourceItems.json");
        Path itemsPath = Paths.get("data/items.json");

        Files.copy(backupItems, itemsPath, StandardCopyOption.REPLACE_EXISTING);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        JsonElement jsonElement = gson.fromJson(new FileReader("data/items.json"), JsonElement.class);
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        JsonArray listArray = jsonObject.getAsJsonArray("itemDataList");

        for (Item item : itemList) {
            listArray.add(gson.toJsonTree(item));
        }

        try (FileWriter writer = new FileWriter("data/items.json")) {
            gson.toJson(jsonObject, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
