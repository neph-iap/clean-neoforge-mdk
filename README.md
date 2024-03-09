# Clean NeoForge MDK

`clean-neoforge-mdk` is a fork of [the official NeoForge MDK](https://github.com/neoforged/MDK) that is reorganized to provide a cleaner and more organized template.

## Installation

### With GitHub and Version Control

1. Click `Use this template`, and then `Create a new repository`. Give your repository a name, a description, and your desired visibility. Click `Create repository`.
2. Click `<> Code` and copy the `HTTPS` link to your clipboard.
3. Open command line, `cd` into your desired location, and type `git clone <url>`, where `url` is the HTTPS link you copied previously.

That's it! Your project is set up and ready for use with Git.

### Without Version Control

1. Open command line, `cd` into your desired location, and type `git clone https://github.com/neph-iap/clean-neoforge.git`.

That's it! Your project is set up and ready to code in.

### Next Steps

Once you have a local copy of the template, be sure to update the information in `src/main/resources/META-INF/mods.toml`. Read the documentation carefully, particularly when updating your mod's ID; There are several steps to doing this and you should be extra careful that you do them all correctly to make everything work properly.

### Testing Your Mod

You can run your mod in Minecraft to test it by opening a command line instance at the location of your mod's root folder and running `./gradlew runClient`. Gradle is a "build tool" for Java, and allows making different "tasks" that you can run with the `gradlew` file. The most important one you'll need is `./gradlew runClient`, which launches a Minecraft instance with your mod, allowing you to test it out. When testing your mod, if thing's dont work as expected, try the following steps:

-   Delete your current world and create a new one. Sometimes (rarely, but not never) reusing an existing world that was created with an earlier version of your mod's code can cause strange issues or behavior. If you are getting odd or inexplicable behavior, consider trying this.
-   Delete the `build` folder in your root directory. This is created by Gradle when running certain tasks such as `runClient`, and contains cached information about your code. In some cases, when things go wrong or Gradle is acting funky, this can act as a sort of reset for the tool.
-   Look at the source code for other (preferably simple) mods to see their file structure. Minecraft has a very specific file structure for certain things such as assets, and often it can be confusing remembering which directories go in which other directories and remembering the exact names needed. Given that NeoForge documentatation (and Forge documentation in general) is quite sparse at the moment, consider checking out other open-source mods and how they structure their files.

## Contributing

Feel free to file issues with bugs or request new features. Keep in mind the following goals of the project:

-   Be a pre-organized NeoForge MDK with multiple conceptually-separated files over several directories
-   Provide starter classes for registering items, blocks, events, entities, etc.
-   Provide accurate and thorough documentation of all included classes, methods, and fields.
-   Be beginner-friendly, even to those who may be new to coding in general, or just Minecraft modding, or specifically modding with NeoForge in the current version.
-   Stay up-to-date with the latest version of Neoforge in each branch.

as well as the project's non-goals:

-   Do not follow a specific preference of file structure or organization; Follow the most common conventions and recommendations among mod developers
-   Do not provide specialized classes for blocks or items; Do not add bloat that will go unused by many users
-   Do not rovide annotations or other code specific to one IDE or text editor; Keep code generalized and accessible to all users of any editors.
-   Do not go against NeoForge recommendations or code styles
-   Do not discard old versions of the MDK; Keep Minecraft/NeoForge updates to their own branch with the name of the Minecraft update.
