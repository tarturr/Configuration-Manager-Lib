package fr.tartur.minecraft.manager.config;

import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class ConfigurationFile extends YamlConfiguration {

    private final File file;

    public ConfigurationFile(File file) {
        this.file = file;
    }

    public void save() {
        try {
            super.save(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
