public class Dog implements Comparable<Dog>{
    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int compareTo(Dog d) {
        return this.name.compareTo(d.name);
    }

    public int compareByAge(Dog d) {
        return this.age - d.age;
    }
}
