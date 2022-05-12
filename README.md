> # Présentation de la lib

Cette lib peut être utilisée afin de faciliter la manipulation de fichiers de configuration YAML.

---

> # Utiliser la lib

Afin d'importer facilement la lib, étant stockée sur GitHub, vous devez utiliser le repository "JitPack". Par ailleurs, elle dépend de Spigot, vous devez donc aussi l'ajouter à vos repos. Copiez-collez ceci dans votre ``pom.xml`` :
```xml
<repositories>
    <repository>
        <id>spigotmc-repo</id>
        <url>https://hub.spigotmc.org/nexus/content/repositories/snapshots/</url>
    </repository>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```

En suite, la lib ``Configuration-Manager`` dépend de spigot 1.18.1. Il faudra donc l'importer dans vos ``dependencies``. Et enfin, vous pourrez aussi y mettre la dependency ``Configuration-Manager-Lib`` :
```xml
<dependencies>
    <dependency>
        <groupId>fr.tartur.minecraft.lib.manager</groupId>
        <artifactId>config</artifactId>
        <version>1.0</version>
    </dependency>
    <dependency>
        <groupId>org.spigotmc</groupId>
        <artifactId>spigot-api</artifactId>
        <version>1.18.1-R0.1-SNAPSHOT</version>
        <scope>provided</scope>
    </dependency>
</dependencies>
```
