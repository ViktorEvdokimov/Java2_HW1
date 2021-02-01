public class Main {

    public static void main(String[] args) {

        Course c = new Course(10 ,20 , 40, 30, 50); // Создаем полосу препятствий
        Team team = new Team("Friends", new Member[] {new Member("Bob", 50),
                new Member("Jon", 120),
                new Member("Tom", 70),
                new Member("Mark", 90),}); // Создаем команду
        c.doIt(team); // Просим команду пройти полосу
        team.showResults(); // Показываем результаты
        team.showInfo();
    }
}
