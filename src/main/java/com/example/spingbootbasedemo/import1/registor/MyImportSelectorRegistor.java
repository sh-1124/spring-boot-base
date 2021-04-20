package com.example.spingbootbasedemo.import1.registor;

import com.example.spingbootbasedemo.import1.Person;
import com.example.spingbootbasedemo.import1.User;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;


public class MyImportSelectorRegistor implements ImportBeanDefinitionRegistrar {


    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {
        RootBeanDefinition user = new RootBeanDefinition(User.class);
        beanDefinitionRegistry.registerBeanDefinition("userrrrr",user);
        RootBeanDefinition person = new RootBeanDefinition( Person.class);
        beanDefinitionRegistry.registerBeanDefinition("personnn",person);
    }
}
