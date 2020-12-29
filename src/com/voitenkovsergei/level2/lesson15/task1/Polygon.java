package com.voitenkovsergei.level2.lesson15.task1;

/**
 * Создать иерархию классов, описывающих геометрические фигуры
 * на плоскости.
 * - Можно пользоваться результатами предыдущего ДЗ.
 * - В иерархии должно быть не менее 10 классов/интерфейсов и хотя
 * бы 2 уровня вложенности.
 * - Продемонстрировать переопределение методов в иерархии.
 * - Продемонстрировать добавление собственных методов в классах-
 * наследниках (можно с помощью интерфейсов).
 * Например, расчёт диагонали в прямоугольнике, расчёт высоты в
 * треугольнике.
 * - При разработке иерархии держать в уме принцип инкапсуляции,
 * выбирать корректные имена классов и методов,
 * пользоваться преимуществами полиморфизма.
 * - Отдавайте предпочтение интерфейсам, а не абстрактным классам.
 * - При переопределении методов обязательно использовать
 * аннотацию @Override
 * - Не создавать лишних классов в системе (полностью дублирующих
 * или не содержащих назначения)
 * - Каждый класс должен выполнять своё назначение.
 * - Создать общие методы:
 * 1. Рассчитывающий площадь фигуры.
 * 2. Принимающий в качестве параметра фигуру и определяющий,
 * равны ли площади текущей и полученной фигуры.
 * - Создать класс ShapeUtils со статическими методами:
 * 1. Определяющим, является ли фигура прямоугольником.
 * 2. Определяющим, является ли фигура треугольником.
 * <p>
 * - Для каждого неабстрактного класса переопределить метод
 * toString() класса для представления информации о классах в
 * строковой форме.
 * - В этом задании нет одного правильного решения, подойдите к
 * нему творчески.
 */
public abstract class Polygon {

    private String name;
    private double area;
    private double perimeter;
    private double diagonal;

    public Polygon(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "" + getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", area=" + area +
                ", perimeter=" + perimeter +
                ", diagonal=" + diagonal +
                '}';
    }

    public boolean isAreaEqual(double area) {
        return this.area == area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }
}