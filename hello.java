public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello Git");
		System.out.println("This is a new change");
		
		Gruessen gruessenInstanz = new Gruessen("Marpelz");
        String gruss = gruessenInstanz.gruesse();
        System.out.println(gruss);
    }
}