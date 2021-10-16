package ru.dataart.academy.java;


abstract class Figure{
    protected abstract double getPerimeter();
    protected abstract double getSquare();
}
class Circle extends Figure {
    final double Pi = 3.14;
    int Radius;

    public Circle(int radius) {
        Radius = radius;
    }

    @Override
    public double getPerimeter(){
        return 2*Pi*Radius;
    }

    public double getSquare() {
        return Pi*Radius*Radius;
    }
}
class Rectangle extends Figure {
    int a, b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getPerimeter() {
        return (a + b) * 2;
    }

    @Override
    public double getSquare() {
        return a * b;
    }
}
class Calculator{
    int CalculateSquaresSum(Figure[] figures){
        int result=0;
        for(int i=0; i<figures.length; i++){
            result+=figures[i].getSquare();
        }
        return result;
    }
}