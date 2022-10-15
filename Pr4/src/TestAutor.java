public class TestAutor {
    public TestAutor() {
        Autor Jack = new Autor("Jack", "Jack@email.com", 'M');
        System.out.println(Jack.getName());
        System.out.println(Jack.getEmail());
        Jack.setEmail("NewJack@email.com");
        System.out.println(Jack.getGender());
        System.out.println(Jack.toString());
    }
}
