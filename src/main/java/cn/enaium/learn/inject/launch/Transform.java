package cn.enaium.learn.inject.launch;

import cn.enaium.inject.Inject;
import net.minecraft.launchwrapper.IClassTransformer;

/**
 * @author Enaium
 */
public class Transform implements IClassTransformer {
    @Override
    public byte[] transform(String name, String transformedName, byte[] basicClass) {
        return Inject.transform(basicClass);
    }
}
