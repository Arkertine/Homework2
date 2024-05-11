public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        System.out.println("Task 2");
        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        System.out.println("Task 3");
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        System.out.println("Task 4");
        var friend = 19;
        System.out.println("friend = " + friend);
        friend += 2;
        System.out.println("friend = " + friend);
        friend /= 7;
        System.out.println("friend = " + friend);

        System.out.println("Task 5");
        var frog = 3.5;
        System.out.println("frog = " + frog);
        frog *= 10;
        System.out.println("frog = " + frog);
        frog /= 3.5;
        System.out.println("frog = " + frog);
        frog += 4;
        System.out.println("frog = " + frog);

        System.out.println("Task 6");
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;

        var summaryWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общая масса двух бойцов(боксеров) = " + summaryWeight);

        var differenceWeight = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница в массе двух бойцов(боксеров) = " + differenceWeight);

        System.out.println("Task 7");
        var remainderAmount = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Остаток от деления масс двух бойцов(боксеров) = " + remainderAmount);

        System.out.println("Task 8");
        var allWorkTimeAmount = 640;
        var oneWorkerTimeAmount = 8;

        var oldWorkersAmount = allWorkTimeAmount / oneWorkerTimeAmount;
        System.out.println("Всего работников в компании - " + oldWorkersAmount + " человек");

        var newWorkersAmount = oldWorkersAmount + 94;
        var newOneWorkerTimeAmount = allWorkTimeAmount / newWorkersAmount;
        System.out.println("Если в компании работает " + newWorkersAmount + " человека, то всего " + newOneWorkerTimeAmount + " часа работы может быть поделено между сотрудниками");



    }
}