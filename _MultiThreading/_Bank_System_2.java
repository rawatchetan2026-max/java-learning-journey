class Account {
    private int id;
    private int balance;

    public Account(int id, int balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}

class BankService {
    public void deposit(Account acc, int amount) {
        synchronized (acc) {

            int newBalance = acc.getBalance() + amount;
            acc.setBalance(newBalance);
            System.out.println(Thread.currentThread().getName() +
                    " deposited " + amount + " | Balance " + newBalance);
        }

    }

    public void withdraw(Account acc, int amount) throws Exception {
        synchronized (acc) {
            if (acc.getBalance() < amount) {
                throw new Exception("Insufficient Balance");
            }

            int newBalance = acc.getBalance() - amount;
            acc.setBalance(newBalance);
            System.out.println(Thread.currentThread().getName() +
                    " withdrew " + amount + " | Balance " + newBalance);
        }

    }
}

class User extends Thread {
    private int userId;
    private Account account;
    private BankService service;

    public User(int userId, Account account, BankService service, String name) {
        super(name);
        this.userId = userId;
        this.account = account;
        this.service = service;
    }

    public void run() {
        try {
            service.deposit(account, 500);
            Thread.sleep(500);

            service.withdraw(account, 700);
            Thread.sleep(500);

        } catch (Exception e) {
            System.out.println(getName() + " : " + e.getMessage());
        }
    }
}

public class _Bank_System_2 {
    public static void main(String[] args) throws InterruptedException {

        Account acc = new Account(1, 1000);
        BankService service = new BankService();

        User u1 = new User(1001, acc, service, "User-1");
        User u2 = new User(1002, acc, service, "User-2");

        u1.start();
        u2.start();

        u1.join();
        u2.join();

        System.out.println("Final Balance: " + acc.getBalance());
    }
}