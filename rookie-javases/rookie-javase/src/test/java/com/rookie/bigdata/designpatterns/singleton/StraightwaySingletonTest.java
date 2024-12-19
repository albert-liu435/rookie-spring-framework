package com.rookie.bigdata.designpatterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class StraightwaySingletonTest
 * @Description 立即加载模式 (饿汉式) test
 * @Author rookie
 * @Date 2024/12/19 10:02
 * @Version 1.0
 */
class StraightwaySingletonTest {


    @Test
    void getInstance() {
        final StraightwaySingleton instance1 = StraightwaySingleton.getInstance();
        final StraightwaySingleton instance2 = StraightwaySingleton.getInstance();
        Assertions.assertSame(instance1, instance2);
    }

    @Test
    void StraightwaySingleton() {
        Class<StraightwaySingleton> singletonClass = StraightwaySingleton.class;
        Assertions.assertThrows(InvocationTargetException.class, () -> {
            Constructor<StraightwaySingleton> declaredConstructor = singletonClass.getDeclaredConstructor();
            declaredConstructor.setAccessible(true);
            declaredConstructor.newInstance();
        });
    }


    @Test
    void readResolve() {
        StraightwaySingleton instance = StraightwaySingleton.getInstance();
        try (FileOutputStream fileOutputStream = new FileOutputStream(StraightwaySingleton.class.getResource("").getPath() + "StraightwaySingleton.txt");
             final ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(instance);
            final ObjectInputStream objectInputStream = new ObjectInputStream(StraightwaySingleton.class.getResourceAsStream("StraightwaySingleton.txt"));
            final StraightwaySingleton o = (StraightwaySingleton) objectInputStream.readObject();
            Assertions.assertEquals(instance, o);
        } catch (IOException | SecurityException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}

