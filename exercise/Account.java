public class Account {
    private long balance;
    private String name;

    public Account(String name){
        this.name = name;
    }

    public void deposit(int amount) throws MalformedData, ReInputException{
        if(amount < 0){
            throw new MalformedData();
        }
        if(amount == 0){
            throw new ReInputException();
        }
        balance = balance + amount;
    }

    public void withdraw(int amount) throws InsufficientBalanceException, MalformedData{
            if(amount < 0){
                throw new MalformedData();
            }if(amount == 0){
                throw new ReInputException();
            }
            if(balance < amount){
                throw new InsufficientBalanceException("잔고 부족, " + (amount - balance)+ " 원이 모자랍니다.");
            }

            balance = balance - amount;
    }

    public void check(){
        System.out.println("현재 " + name + "의 예금액 : " + balance + " 원");
    }

}