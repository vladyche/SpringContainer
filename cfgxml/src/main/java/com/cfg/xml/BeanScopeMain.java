package com.cfg.xml;

import com.cfg.xml.bean.BeanScopePrototypeDemo;
import com.cfg.xml.bean.BeanScopeSingletonDemo;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeMain {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BeanScopeContext.xml");

        BeanScopeSingletonDemo beanSingleton1 = context.getBean("beanSingleton", BeanScopeSingletonDemo.class);
        BeanScopeSingletonDemo beanSingleton2 = context.getBean("beanSingleton", BeanScopeSingletonDemo.class);
        BeanScopeSingletonDemo beanSingleton3 = context.getBean("beanSingleton", BeanScopeSingletonDemo.class);

        BeanScopeSingletonDemo[] singletons = {beanSingleton1, beanSingleton2, beanSingleton3};

        System.out.println("-----------------------------------------------------------------------------------------");

        for (int i = 0; i < singletons.length; i++) {
            singletons[i].setId(i);
        }

        for (BeanScopeSingletonDemo bean : singletons) {
            System.out.println(bean.getId());
        }

        BeanScopePrototypeDemo beanPrototype1 = context.getBean("beanPrototype", BeanScopePrototypeDemo.class);
        BeanScopePrototypeDemo beanPrototype2 = context.getBean("beanPrototype", BeanScopePrototypeDemo.class);
        BeanScopePrototypeDemo beanPrototype3 = context.getBean("beanPrototype", BeanScopePrototypeDemo.class);

        BeanScopePrototypeDemo[] prototypes = {beanPrototype1, beanPrototype2, beanPrototype3};

        System.out.println("-----------------------------------------------------------------------------------------");

        for (int i = 0; i < prototypes.length; i++) {
            prototypes[i].setId(i);
        }

        for (BeanScopePrototypeDemo bean : prototypes){
            System.out.println(bean.getId());
        }

        System.out.println("-----------------------------------------------------------------------------------------");

        context.close();
    }
}
