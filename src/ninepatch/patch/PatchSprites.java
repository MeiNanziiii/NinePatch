package ninepatch.patch;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.tools.texturepacker.TexturePacker;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PatchSprites {
    public void patch() throws IOException {
        Path backupAtlas = Paths.get("backup/sourceGame.atlas");
        Path atlasPath = Paths.get("data/game.atlas");

        Files.copy(backupAtlas, atlasPath, StandardCopyOption.REPLACE_EXISTING);

        TexturePacker.Settings settings = new TexturePacker.Settings();
        settings.filterMag = Texture.TextureFilter.Linear;
        settings.filterMin = Texture.TextureFilter.Linear;
        TexturePacker.process(settings, "assets", "data", "game3");

        Path sourceFile = Paths.get("data/game3.atlas");

        String existingContent = new String(Files.readAllBytes(atlasPath));

        String sourceContent = new String(Files.readAllBytes(sourceFile));
        Files.write(atlasPath, (existingContent + sourceContent).getBytes());

        Files.delete(sourceFile);
    }
}
