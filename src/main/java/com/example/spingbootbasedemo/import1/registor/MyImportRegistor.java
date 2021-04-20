package com.example.spingbootbasedemo.import1.registor;


import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import(MyImportSelectorRegistor.class)
public @interface MyImportRegistor {
}
