public class Main {
    public static void main(String[] args) {
        Human maxim = new Human(1988, "Максим", "Минск", "бренд-менеджера");
        maxim.data();

        Human anna = new Human(1993, "Аня", "Москва", "методиста образовательных прграмм");
        anna.data();

        Human katrin = new Human(1992, "Катя", "Калининград", "продакт-менеджера");
        katrin.data();

        Human tema = new Human(1995, "Артём", "Москва", "директора по развитию бизнеса");
        tema.data();
    }
}