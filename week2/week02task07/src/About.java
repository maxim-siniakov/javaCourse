import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Created by max on 14.03.16.
 */
import java.lang.annotation.*;
@Documented
@Target(ElementType.TYPE)
public @interface About {
   String Author();
    String dayOfWeek();
/**
 *
 * какой-то текст
 */
}
