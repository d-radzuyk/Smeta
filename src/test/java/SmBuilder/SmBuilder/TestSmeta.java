﻿package SmBuilder.SmBuilder;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import org.junit.Test;
public class TestSmeta {

/**
* Класс для тестирования программы расчета сметы мебели в виде проверки
* математической модели. Для этого создаются экземпляр сметы, материалы
* сме ты в определенном количестве и задается стоимость одной единицы
* материала. Далее программа подсчитывает общую стоимость созданных
* материалов, перемножая цену материала на количество данного материала.
* Формула: (Цена Материала * Количество Материала).
* Результат работы программы сравнивается с ожидаемым результатом –
* уже подсчитанным по заранее заданным параметрам, которые указаны в
* программном коде.
 */

@Test
public void test4() {
/**
* Создаем экземпляр сметы
 */
Smeta newsm=new Smeta();
/**
* Создаем образец-материал 1 в кол-ве 13 штук
 */
Material m1=new Material(0,"Материал1" ,"имякласса" , new ArrayList<Parametr>(), "stoimost",13);
/**
* Задаем стоимость материала 1 – 17.17
 */
m1.addParametr(new Parametr("Стоимость", "stoimost", TypeName.floatType, "17.17"));
/**
* Добавляем материал 1 в смету
 */
newsm.addMaterial(m1);

/**
* Создаем материал 2 в кол-ве 4 штук
 */
Material m2=new Material(2,"Материал2" ,"имякласса" , new ArrayList<Parametr>(), "stoimost",4);
/**
* Задаем стоимость материала 2 – 14.14
 */
m2.addParametr(new Parametr("Стоимость", "stoimost", TypeName.floatType, "14.14"));
/**
* Добавляем материал 2 в смету
 */
newsm.addMaterial(m2);

/**
* Создаем результат работы программы для сравнения
 */
String res=newsm.result();
/**
* Тест 1. Сравниваем результат работы с ожидаемым результатом (279.77)
* Цена материала 1: 17.17, кол-во материала 1: 13.
* Цена материала 2: 14.14, кол-во материала 2: 4.
* Цены умножаются на кол-во: (17.17*13) + (14.14*4) = 279.77
 */
System.out.println("Test 1 (Radzyuk): "+res);
assertEquals(Double.valueOf(res),Double.valueOf(279.77));

/**
* Создаем образец-материал 3 в кол-ве 2 штук
 */
Material m3=new Material(3,"Материал3" ,"имякласса" , new ArrayList<Parametr>(), "stoimost",2);
/**
* Задаем стоимость материала 3 – 23.23
 */
m3.addParametr(new Parametr("Стоимость", "stoimost", TypeName.floatType, "23.23"));
/**
* Добавляем материал 3 в смету
 */
newsm.addMaterial(m3);
/**
* Создаем результат работы программы для сравнения
 */
res=newsm.result();
/**
* Тест 2. Сравниваем результат работы с ожидаемым результатом (326.23)
* Цена материала 1: 17.17, кол-во материала 1: 13.
* Цена материала 2: 14.14, кол-во материала 2: 4.
* Цена материала 3: 23.23, кол-во материала 3: 2.
* Цены умножаются на кол-во: (17.17*13) + (14.14*4) + (23.23*2) = 326.23
 */
System.out.println("Test 2 (Radzyuk): "+res);
assertEquals(Double.valueOf(res),Double.valueOf(326.23));
}

@Test
public void test2() {
/**
* Создаем экземпляр сметы
 */
Smeta newsm=new Smeta();
/**
* Получаем результат работы программы для пустой сметы
*/
String res=newsm.result();
System.out.println("Test 1 (Galimullina): "+res);
/**
* Тест 1. Сравниваем результат работы с ожидаемым результатом (0)
* Поскольку в смете отсутствуют какие-либо материалы, общая стоимость
* будет равна нулю.
 */
assertEquals(Double.valueOf(res),Double.valueOf(0.));
/**
* Создаем образец-материал 1 в кол-ве 2 штук
 */
Material m1=new Material(1,"Материал1" ,"имякласса" , new ArrayList<Parametr>(), "stoimost",2);
/**
* Задаем стоимость материала 1 – 400.00
 */
m1.addParametr(new Parametr("Стоимость", "stoimost", TypeName.floatType, "400.00"));
/**
* Добавляем материал 1 в смету
 */
newsm.addMaterial(m1);
/**
* Получаем результат работы программы
*/
res=newsm.result();
System.out.println("Test 2 (Galimullina): "+res);
/**
* Тест 2. Сравниваем результат работы с ожидаемым результатом (800)
* Цена материала 1: 400.00, кол-во материала 1: 2.

* Цены умножаются на кол-во: (400.00*2) = 800
 */
assertEquals(Double.valueOf(res),Double.valueOf(800.));
}

@Test
public void test1() {
/**
* Создаем экземпляр сметы
 */
Smeta newsm=new Smeta();
/**
* Создаем образец-материал 1 в кол-ве 7 штук
 */
Material m1=new Material(1,"Материал1" ,"имякласса" , new ArrayList<Parametr>(), "stoimost",7);
/**
* Задаем стоимость материала 1 – 128.92
 */
m1.addParametr(new Parametr("Стоимость", "stoimost", TypeName.floatType, "128.92"));
/**
* Добавляем материал 1 в смету
 */
newsm.addMaterial(m1);

/**
* Создаем материал 2 в кол-ве 6 штук
 */
Material m2=new Material(2,"Материал2" ,"имякласса" , new ArrayList<Parametr>(), "stoimost",6);
/**
* Задаем стоимость материала 2 – 113.66
 */
m2.addParametr(new Parametr("Стоимость", "stoimost", TypeName.floatType, "113.66"));
/**
* Добавляем материал 2 в смету
 */
newsm.addMaterial(m2);

/**
* Создаем результат работы программы для сравнения
 */
String res=newsm.result();
/**
* Тест 1. Сравниваем результат работы с ожидаемым результатом (1584.4)
* Цена материала 1: 128.92, кол-во материала 1: 7.
* Цена материала 2: 113.66, кол-во материала 2: 6.
* Цены умножаются на кол-во: (128.92*7) + (113.66*6) = 1584.4
 */
System.out.println("Test 1 (Gracheva): "+res);
assertEquals(Double.valueOf(res),Double.valueOf(1584.4));

/**
* Создаем образец-материал 3 в кол-ве 3 штук
 */
Material m3=new Material(3,"Материал3" ,"имякласса" , new ArrayList<Parametr>(), "stoimost",3);
/**
* Задаем стоимость материала 3 – 150.00
 */
m3.addParametr(new Parametr("Стоимость", "stoimost", TypeName.floatType, "150.00"));
/**
* Добавляем материал 3 в смету
 */
newsm.addMaterial(m3);
/**
* Создаем результат работы программы для сравнения
 */
res=newsm.result();
/**
* Тест 2. Сравниваем результат работы с ожидаемым результатом (2034.4)
* Цена материала 1: 128.92, кол-во материала 1: 7.
* Цена материала 2: 113.66, кол-во материала 2: 6.
* Цена материала 3: 150.00, кол-во материала 3: 3.
* Цены умножаются на кол-во: (128.92*7) + (113.66*6) + (150.00*3) = 2034.4
 */
System.out.println("Test 2 (Gracheva): "+res);
assertEquals(Double.valueOf(res),Double.valueOf(2034.4));
}

@Test
public void test3() {
/**
* Создаем экземпляр сметы
 */
Smeta newsm=new Smeta();
/**
* Создаем образец-материал 1 в кол-ве 10 штук
 */
Material m1=new Material(1,"Материал1" ,"имякласса" , new ArrayList<Parametr>(), "stoimost",10);
/**
* Задаем стоимость материала 1 – 303.16
 */
m1.addParametr(new Parametr("Стоимость", "stoimost", TypeName.floatType, "303.16"));
/**
* Добавляем материал 1 в смету
 */
newsm.addMaterial(m1);

/**
* Создаем образец-материал 2 в кол-ве 4 штук
 */
Material m2=new Material(2,"Материал2" ,"имякласса" , new ArrayList<Parametr>(), "stoimost",4);
/**
* Задаем стоимость материала 2 – 150.50
 */
m2.addParametr(new Parametr("Стоимость", "stoimost", TypeName.floatType, "150.50"));
/**
* Добавляем материал 2 в смету
 */
newsm.addMaterial(m2);

/**
* Создаем результат работы программы для сравнения
 */
String res=newsm.result();
/**
* Тест 1. Сравниваем результат работы с ожидаемым результатом (3633.6)
* Цена материала 1: 303.16, кол-во материала 1: 10.
* Цена материала 2: 150.50, кол-во материала 2: 4.
* Цены умножаются на кол-во: (303.16*10) + (150.50*4) = 3633.6
 */
System.out.println("Test 1 (Galimov): "+res);
assertEquals(Double.valueOf(res),Double.valueOf(3633.6));

/**
* Создаем образец-материал 3 в кол-ве 5 штук
 */
Material m3=new Material(3,"Материал3" ,"имякласса" , new ArrayList<Parametr>(), "stoimost",5);
/**
* Задаем стоимость материала 3 – 50.00
 */
m3.addParametr(new Parametr("Стоимость", "stoimost", TypeName.floatType, "50.00"));
/**
* Добавляем материал 3 в смету
 */
newsm.addMaterial(m3);
/**
* Создаем результат работы программы для сравнения
 */
res=newsm.result();
/**
* Тест 2. Сравниваем результат работы с ожидаемым результатом (3883.6)
* Цена материала 1: 303.16, кол-во материала 1: 10.
* Цена материала 2: 150.50, кол-во материала 2: 4.
* Цена материала 3: 50.00, кол-во материала 3: 5.
* Цены умножаются на кол-во: (303.16*10) + (150.50*4) + (50.00*5) = 3883.6
 */
System.out.println("Test 2 (Galimov): "+res);
assertEquals(Double.valueOf(res),Double.valueOf(3883.6));
}
}
