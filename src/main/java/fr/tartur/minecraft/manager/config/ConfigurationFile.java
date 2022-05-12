package fr.tartur.minecraft.manager.config;

import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class ConfigurationFile extends YamlConfiguration {

    private final String name;
    private final File file;

    public ConfigurationFile(File dataFolder, String name) {
        this.name = name;
        this.file = new File(dataFolder, name + ".yml");

        createFile(this.file);
    }

    public ConfigurationFile(File dataFolder, File file) {
        this.name = file.getName();
        assert !this.name.endsWith(".yml") : "The file " + this.name + " can not be used as a configuration because it is not a YAML file.";

        this.file = new File(dataFolder, this.name);
        createFile(this.file);
    }

    public void save() {
        try {
            super.save(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void createFile(File file) {
        if (!file.exists()) {
            try {
                if (file.createNewFile()) {
                    System.out.println("The " + name + ".yml file has successfully been created!");
                }
            } catch (IOException e) {
                System.err.println("An error has occurred while creating " + name + ".yml file:");
                throw new RuntimeException(e);
            }
        }
    }

    public String getConfigName() {
        return this.name;
    }

}
