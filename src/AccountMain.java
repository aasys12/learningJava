public class AccountMain {
    public static void main(String[] args) {
        Account bobsAccount=new Account();
        bobsAccount.withdrawl(100);
        bobsAccount.deposit(100);
        bobsAccount.withdrawl(50);

        Account johnAccount=new Account("12345",80.0,"bob brown",
                "b@bob.com","12348877");
        System.out.println(johnAccount.getBalance());
        System.out.println(johnAccount.getNumber());

    }

}
