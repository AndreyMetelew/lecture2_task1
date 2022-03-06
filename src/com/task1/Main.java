package com.task1;

public class Main {

    public static void main(String[] args) {

        System.out.println();

	    /* 1. Реализовать метод setName, чтобы с его помощью можно было устанавливать значение
	    переменной private String name равное переданному параметру String name */

        class Cat1
        {
            private String name;
            public void setName(String name)
            {
                this.name = name; // Написать тут Ваш код
            }
        }

        Cat1 Luxor = new Cat1();
        Luxor.setName("Luxor");
        System.out.println("Имя котика: " + Luxor.name);
        System.out.println();

        /* 2. Реализовать метод addNewCat, чтобы при его вызове (т.е. добавлении нового кота),
        количество котов увеличивалось на 1. За количество котов отвечает переменная catsCount. */

        class Cat2
        {
            private static int catsCount = 0;
            public static void addNewCat()
            {
                Cat2.catsCount++; // Написать тут Ваш код
            }
        }

        Cat2 Pushok = new Cat2();
        Pushok.addNewCat();
        System.out.println("Кошек: " + Cat2.catsCount);

        Cat2 Snejok = new Cat2();
        Snejok.addNewCat();
        System.out.println("Кошек: " + Cat2.catsCount);
        System.out.println();

        /* 3. Реализовать метод setCatsCount так, чтобы с его помощью можно
        было устанавливать значение переменной catsCount равное переданному параметру. */

        class Cat3
        {
            private static int catsCount = 0;
            public static void setCatsCount (int catsCount)
            {
                Cat3.catsCount = catsCount; // Написать тут Ваш код
            }
        }

        Cat3 Blinchic = new Cat3();
        Blinchic.setCatsCount(1);
        System.out.println("Кошек: " + Cat3.catsCount);
        System.out.println();

        /* 4. Реализовать метод setName, чтобы с его помощью можно было устанавливать значение переменной
        private String fullName, равное значению локальной переменной String fullName. */

        class Cat4
        {
            private String fullName;
            public void setName(String firstName, String lastName)
            {
                String fullName = firstName + " " + lastName;
                this.fullName = fullName; // Написать тут Ваш код
            }
        }

        Cat4 Markis = new Cat4();
        Markis.setName("Markis", "Karabas");
        System.out.println("Имя кота: " + Markis.fullName);
        System.out.println();

        /* 5. Написать код, который бы подсчитывал количество созданных
        котов (count) и на экран выдавалось правильно их количество. */

        class Cat5 {
            static int count = 0;
        }

        Cat5 cat1 = new Cat5();
        Cat5.count++; // Написать тут Ваш код
        Cat5 cat2 = new Cat5();
        Cat5.count++; // Написать тут Ваш код
        System.out.println("Cats count is " + Cat5.count);

    }
}
