package com.company;

import com.company.Animals.Bat;
import com.company.Animals.Bear;
import com.company.Animals.Snake;

public class Main {

    public static void main(String[] args) {

	Bat bat = new Bat(170,70,"жайыт","тун","жупташуу мезгили","ургачы"
            ,"fruits");
        System.out.println(bat);
      System.out.println(bat.huntForFood());
        System.out.println(bat.canReproduce());
       System.out.println(bat.dailyNorm());
        System.out.println(bat.food());
      System.out.println(bat.tasksRequired());

      //  Bear bear = new Bear(170,70,"берлога","тун","",
            //    "ургачы", 4500,5);
//        System.out.println(bear);
//        System.out.println(bear.canReproduce());
//        System.out.println(bear.food());
//        System.out.println(bear.tasksRequired());
//        System.out.println(bear.amountFood());
//        System.out.println(bear.dailyNorm());
//        System.out.println(bear.huntForFood());
//
//        Snake snake = new Snake(170,70,"берлога","кун","жаз",
//                "ургачы", 170,"salam","ali","aloo",
//                "жай",true,false,true," eggs ");
//        System.out.println(snake);
//        System.out.println(snake.food());
//        System.out.println(snake.canReproduce());
//        System.out.println(snake.dailyNorm());
//        System.out.println(snake.tasksRequired());
//        System.out.println(snake.huntForFood());

    }
}
