package com.hard;

public class Main {
    public static void main(String[] args) {

    }
}

/**
 * экземпляр интерфейса и абстрактного класса создать нельзя
 * интерфейс и бстрактный класс могут содержать внутренние классы
 */

/**
 * interface:
 *
 * - реализация / наследование:
 * 1) множественная реализация интерфейсов (C implements I1, I2, ...)
 * 2) может наследоваться от интерфейсов (I1 extends I2)
 *
 * - поля:
 * 1) может содержать только public static final поля: int a = 1;
 *
 * - методы:
 * 1) может описывать методы: void f();
 * 2) может реализовывать только static и default методы: static void f() {}; default void f() {}
 *
 * - модификаторы доступа:
 * 1) может иметь модификаторы доступа только: public
 *
 * default modifiers:
 * 1) все поля по-умолчанию public static final
 * 2) все методы по-умолчанию public abstract
 *
 * - переопределение методов:
 * 1) может переопределять методы: @Override void f();
 *
 * Использование:
 * 1) могут быть реализованы классами которые не связаны друг с другом (class AndroidDevice implements Device; class IosDevice implements Device)
 * 2) используется, если нужна какая-то реализация по умолчанию
 * 3) расширение функциональности каждого класса-наследника ()
 */
interface IEntity {

}

/**
 * abstract class
 *
 * - реализация / наследование:
 * 1) отсутствие множественного наследования классов и абстрактных классов (C extends A)
 * 2.1) может реализовывать интерфейсы (A implements I1, I2, ...)
 * 2.2) может наследоваться от классов (A extends C1)
 * 2.3) может наследоваться от абстрактных классов (A extends A1)
 *
 * - поля:
 * 1) может содержать поля
 *
 * - методы:
 * 1) может описывать методы: public abstract void f();
 * 2) может реализовывать любые методы: public void f() {}
 *
 * - модификаторы доступа:
 * 1) может иметь любые модификаторы доступа
 *
 * default modifiers:
 * 1) все поля по-умолчанию default-package
 * 2) все методы по-умолчанию default-package
 *
 * - переопределение методов:
 * 1) может переопределять методы с модификатором abstract: @Override abstract void f();
 *
 * Использование:
 * 1) используются только тогда, когда есть тип отношений "is a" (class AndroidMobile extends AndroidDevice; class AndroidTablet extends AndroidDevice)
 * 2) используется, когда классу надо задать конкретное поведение
 * 3) теряется индивидуальность класса-наследника ()
 */

abstract class AbstractEntity {

}

/**
 * example class
 *
 * абстрактный класс насследник не обязан реализовать абстрактные методы
 * неабстрактный класс насследник обязан реализовать абстрактные методы
 */

class Entity extends AbstractEntity implements IEntity {

}
