package fr.tartur.minecraft.manager.config;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ConfigurationManager {

    private final File dataFolder;
    private final List<ConfigurationFile> configs;

    public ConfigurationManager(File dataFolder) {
        this.dataFolder = dataFolder;
        this.configs = new ArrayList<>();
    }

    public void addConfig(String name) {
        this.configs.add(new ConfigurationFile(dataFolder, name));
    }

    public void addConfig(File file) {
        this.configs.add(new ConfigurationFile(dataFolder, file));
    }

    public void addConfig(ConfigurationFile config) {
        this.configs.add(config);
    }

    public ConfigurationFile getConfig(String name) {
        for (ConfigurationFile config : configs) {
            if (config.getConfigName().equals(name)) return config;
        }

        return null;
    }

    public void saveAll() {
        configs.forEach(ConfigurationFile::save);
    }

}
