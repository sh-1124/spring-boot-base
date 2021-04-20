package com.example.spingbootbasedemo.import1.importselector;


import com.example.spingbootbasedemo.import1.Person;
import com.example.spingbootbasedemo.import1.User;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector  implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{User.class.getName(), Person.class.getName()};
    }
}
