public class Account {
    private String id;
    private String name;
    private int balance;


    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0;
    }


    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }


    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void credit(int amount) {
        if (amount > 0) {
            balance=  balance +amount;
        } else {
            System.out.println("A negative amount cannot be deposited");
        }
    }


    public void debit(int amount) {
        if (amount > 0 && amount <= balance) {
            balance =  balance - amount;
        } else {
            System.out.println("Insufficient balance or negative amount");
        }
    }


    public void transferTo(Account anotherAccount, int amount) {
        if (amount > 0 && amount <= balance) {
            debit(amount);
            anotherAccount.credit(amount);
        } else {
            System.out.println("Insufficient balance or negative amount");
        }
    }

    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
