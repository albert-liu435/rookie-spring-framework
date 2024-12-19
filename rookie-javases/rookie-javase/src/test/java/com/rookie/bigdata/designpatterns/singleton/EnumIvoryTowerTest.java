package com.rookie.bigdata.designpatterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class EnumIvoryTowerTest
 * @Description 基于枚举的单例实现
 * @Author rookie
 * @Date 2024/12/19 10:00
 * @Version 1.0
 */
class EnumIvoryTowerTest {

    @Test
    void instance() {
        final EnumIvoryTower instance1 = EnumIvoryTower.INSTANCE;
        final EnumIvoryTower instance2 = EnumIvoryTower.INSTANCE;
        Assertions.assertSame(instance1, instance2);
    }

    @Test
    void EnumIvoryTower() {
        Class<EnumIvoryTower> singletonClass = EnumIvoryTower.class;
        Assertions.assertThrows(NoSuchMethodException.class, () -> {
            Constructor<EnumIvoryTower> declaredConstructor = singletonClass.getDeclaredConstructor();
            declaredConstructor.setAccessible(true);
            declaredConstructor.newInstance();
        });
    }


    @Test
    void readResolve() {
        EnumIvoryTower instance = EnumIvoryTower.INSTANCE;

        try (FileOutputStream fileOutputStream = new FileOutputStream(EnumIvoryTower.class.getResource("").getPath() + "EnumIvoryTower.txt");
             final ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(instance);
            final ObjectInputStream objectInputStream = new ObjectInputStream(EnumIvoryTower.class.getResourceAsStream("EnumIvoryTower.txt"));
            final EnumIvoryTower o = (EnumIvoryTower) objectInputStream.readObject();
            Assertions.assertEquals(instance, o);
        } catch (IOException | SecurityException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
