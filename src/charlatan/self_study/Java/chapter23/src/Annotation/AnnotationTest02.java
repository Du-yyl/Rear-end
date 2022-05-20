package Annotation;

/**
 * time :2022/5/19 17:04 36
 * ClassName :AnnotationTest02
 * Package :Annotation
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public @interface AnnotationTest02 {
    /**
     * 这种方式是在注解中定义属性，这个name是一个属性
     *
     * @return
     */
    String name();
}
