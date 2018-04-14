package com.hard;

public class Main {
    public static void main(String[] args) {

    }
}

/**
 * java.lang.annotation
 *
 * @Retention
 * Предназначена для применения к другим аннотациям.
 * Позволяет указать жизненный цикл аннотации:
 *  (value = RetentionPolicy.SOURCE) аннотация будет присутствовать только в исходном коде и отбрасываться при компиляции.
 *  (value = RetentionPolicy.CLASS) аннотация будет присутствовать в скомпилированном файле, но недоступна JVM во время выполнения.
 *  (value = RetentionPolicy.RUNTIME) аннотация будет присутствовать в скомпилированном файле, также будет видна JVM в процессе выполнения
 * Выбор нужного типа зависит от того, как вы хотите использовать аннотацию,
 * например, генерировать что-то побочное из исходных кодов, или в процессе выполнения стучаться к классу через reflection.
 *
 * @Documented
 * указывает, что помеченная таким образом аннотация должна быть добавлена в javadoc поля/метода и т.д.
 *
 * @Target
 * указывает, что именно мы можем пометить этой аннотацией
 *  (value = ElementType.TYPE) тип (класс, интерфейс)
 *  (value = ElementType.METHOD) метод
 *  (value = ElementType.FIELD) поле
 *
 * @Inherited
 * аннотация-маркер, которая помечает аннотацию, которая будет унаследована потомком класса, отмеченного такой аннотацией
 */

/**
 * java.lang
 *
 * @Override
 * аннотация-маркер, которая может применяться только к методам. Метод, аннотированный как @Override, должен переопределять метод супер класса.
 *
 * @Deprecated
 * указывает, что объявление устарело и должно быть заменено более новой формой.
 *
 * @SafeVarargs
 * аннотация-маркер, применяется к методам и конструкторам.
 * Она указывает, что никакие небезопасные действия, связанные с параметром переменного количества аргументов, недопустимы.
 * Применяется только к методам и конструкторам с переменным количеством аргументов, которые объявлены как static или final.
 *
 * @SuppressWarnings
 * указывает, что предупреждения, которые могут быть выданы компилятором следует подавить.
 */
