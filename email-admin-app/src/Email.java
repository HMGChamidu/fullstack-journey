import java.util.Scanner;

public class Email {
    private String firstname;
    private String lastname;
    private String password;
    private String department;
    private String email; // Added this
    private String companySuffix = "company.com"; // Added this
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String alternateEmail;

    public Email(String firstName, String lastName) {
        this.firstname = firstName;
        this.lastname = lastName;

        System.out.println("EMAIL CREATED: " + this.firstname + " " + this.lastname);

        this.department = setDepartment();

        // Generate password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your Password is: " + this.password);

        // Combine elements to generate email
        // Fixed: Use this.firstname and this.lastname
        this.email = firstname.toLowerCase() + "." + lastname.toLowerCase() + "@" + (department.isEmpty() ? "" : department + ".") + companySuffix;
        System.out.println("Your email is: " + this.email);
    }

    private String setDepartment() {
        System.out.println("Enter the department\n1 For Sales\n2 For Development\n3 For Accounting\n0 For none");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) return "sales";
        else if (depChoice == 2) return "dev";
        else if (depChoice == 3) return "acct";
        else return "";
    }

    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    // SETTERS (The Restockers)
    public void setMailboxCapacity(int capacity) { this.mailboxCapacity = capacity; }
    public void setAlternateEmail(String altEmail) { this.alternateEmail = altEmail; }
    public void changePassword(String password) { this.password = password; }

    // GETTERS (The Buttons)
    public int getMailboxCapacity() { return mailboxCapacity; } // Added ()
    public String getAlternateEmail() { return alternateEmail; }
    public String getPassword() { return password; }

    public String showInfo() {
        return "DISPLAY NAME: " + firstname + " " + lastname +
                "\nCOMPANY EMAIL: " + email +
                "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
    }
}