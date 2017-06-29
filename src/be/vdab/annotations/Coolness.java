package be.vdab.annotations;

import com.sun.nio.file.ExtendedWatchEventModifier;
import sun.jvm.hotspot.debugger.posix.elf.ELFException;

import java.lang.annotation.*;

/**
 * Created by vdabcursist on 29/06/2017.
 */

@Documented //meta-annotation, een annotation op een annotation
//@Target(ElementType.TYPE) //enkel toepasbaar op een Class, niet method
//@Target(ElementType.METHOD) zou voor method
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD}) //een enum dat van de drie een target maakt
@Retention(RetentionPolicy.RUNTIME)
public @interface Coolness {
    int level() default 50; //not a method, annotations don't have methods, but an attribute

}
