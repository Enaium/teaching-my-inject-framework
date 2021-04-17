package cn.enaium.learn.inject.launch;

import cn.enaium.inject.Inject;
import cn.enaium.learn.inject.program.Main;
import net.minecraft.launchwrapper.ITweaker;
import net.minecraft.launchwrapper.LaunchClassLoader;

import java.io.File;
import java.util.List;

/**
 * @author Enaium
 */
public class Tweaker implements ITweaker {
    @Override
    public void acceptOptions(List<String> args, File gameDir, File assetsDir, String profile) {

    }

    @Override
    public void injectIntoClassLoader(LaunchClassLoader classLoader) {
        Inject.addConfiguration("inject.config.json");
        classLoader.registerTransformer(Transform.class.getName());
    }

    @Override
    public String getLaunchTarget() {
        return Main.class.getName();
    }

    @Override
    public String[] getLaunchArguments() {
        return new String[0];
    }
}
