import java.util.Scanner;
class NameInvalid extends Exception {
    public NameInvalid(String message) {
        super(message);
    }
}

class Doctor {
    String name;
    Doctor(String name) throws NameInvalid{
        for(int i = 0; i < name.length(); i++)
        {
            if ((name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') || (name.charAt(i) >= 'a' && name.charAt(i) <= 'z'))
            {
                continue;
            }
            else
            {
                throw new NameInvalid("Characters expected");
            }
        }
        this.name = name;
    }
    public void getName()
    {
        System.out.println(this.name);
    }
}

class prog1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter name of your doctor: ");
            String name = sc.next();
            Doctor doctor = new Doctor(name);
            System.out.println("Doctor was successful (created).");
            doctor.getName();
        }
        catch (NameInvalid e) {
            System.out.println(e.getMessage());
        }
        finally {
            sc.close();
        }
    }
}