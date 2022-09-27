package com.company;


import com.company.interfaces.Operation;
import com.company.interfaces.OperationImpl;

public class Main {
    public static void main(String[] args) {

        Operation operation = new OperationImpl();

        operation.getInfo(); // Первоначальный список
        operation.getSort(); // Пузырьковая сортировка
        operation.getInfo(); // Вывод списка в зависимости от возраста



    }
}