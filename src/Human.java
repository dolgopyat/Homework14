public class Human {
    int yearOfBirth;
    String name;
    String town;
    String jobTitle;

    Human(int yearOfBirth, String name, String town, String jobTitle) {
        if (yearOfBirth > 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = Math.abs(yearOfBirth);
        }
        if (name != null) {
            this.name = name;
        } else {
            this.name = "Информация не указана";
        }
        if (town != null) {
            this.town = town;
        } else {
            this.town = "Информация не указана";
        }
        if (jobTitle != null) {
            this.jobTitle = jobTitle;
        } else {
            this.jobTitle = "Информация не указана";
        }
    }

    void data() {
        System.out.println("Привет! Меня зовут " + name + ", я из города " + town + ", я родился в " + yearOfBirth + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!");
    }
}
