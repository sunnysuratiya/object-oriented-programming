// Encapsulation master file 
// Goal Practice Encapsulation deeply in 2 hours
class BasicExample {
    // private variable (data hiding)
    private int number;

    // setter method
public void setNumber(int number) {
    this.number = number;
}

// Getter method 
public int getNumber() {
    return number;

}


}

class BankAccount {
    private String accountHolder;
    private double balance;

    // Constructor 
    public BankAccount(String name, double balance) {
        this.accountHolder = name;
        this.balance = balance;

    }

    // Deposit method 
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited:" + amount);

        } else {
            System.out.println("Invalid deposit!") ;

            
        }

    }
    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn:" + amount);

        } else {
            System.out.println("Invalid withdraw!");
        }
    }
    public String getName() {
        return name;

    }
    public int getMarks() {
        return marks;
    }

}

//employee section
class Employee {
    private String name;
    private double salary;
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;

        } else {
            System.out.println("salary cannot be negative!");

        }
    }
    public double getSalary() {
        return salary;
    }
}

// read only example
class ReadOnlyExample {
    private final int id;
    
    public ReadOnlyExample(int id) {
        this.id = id;

    }
    // only getter no setter
    public int getId() {
        return id;

    }
}
//password manager
class PasswordManager {
    private String password;
    public void setPassword(String password) {
        if(password.length() >=6) {
            this.password = password;

        } else {
            System.out.println("Password too short!");

        }
    }
    public String getPassword() {
        return "******"; //hide real password
    }
}


// temprature 
class temperature {
    private double celsius ;
    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }
    public double getCelsius() {
        return celsius;
    }
    public double getFaharenheit() {
        retrun( celsius*9/5) + 32;

    }
}
