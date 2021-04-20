package com.example.spingbootbasedemo.import1.importselector;


import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import(MyImportSelector.class)
public @interface ShImportSelector {

}
