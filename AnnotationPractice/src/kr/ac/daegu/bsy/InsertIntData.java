package kr.ac.daegu.bsy;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// annotaion의 선언 : @interface
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME) // 해당 어노테이션이 class 파일로 변환하는 시점이 언제인지?
public @interface InsertIntData {
    int data() default 0;
}
