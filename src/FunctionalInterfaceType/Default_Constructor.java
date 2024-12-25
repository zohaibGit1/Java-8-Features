package FunctionalInterfaceType;

class Doctor {
    public Doctor() {
        System.out.println("HHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII"); // No parameterised Constructor is always executed....
    }
}

public class Default_Constructor {
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        // System.out.println(doctor.hashCode());
    }
}
