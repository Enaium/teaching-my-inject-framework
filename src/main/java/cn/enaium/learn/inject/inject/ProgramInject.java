package cn.enaium.learn.inject.inject;

import cn.enaium.inject.annotation.At;
import cn.enaium.inject.annotation.Inject;
import cn.enaium.inject.annotation.Method;

/**
 * @author Enaium
 */
@Inject("cn.enaium.learn.inject.program.Program")
public class ProgramInject {
    @Method(name = "render", at = @At(type = At.Type.HEAD))
    private void renderInject() {
        System.out.println("HELLO INJECT");
    }
}
