package Latihan2.Sebelum;
public class CreditApproval {

    static void accept() {
        System.out.println("Application accepted");
    }

    static void reject() {
        System.out.println("Application rejected");
    }

    public static void main(String[] args) {
        int score = 650;
        int income = 60000;
        boolean authorized = true;

        if (score > 700)
            accept();
        else if ((income >= 40000) && (income <= 100000)
                && authorized && (score > 500))
            accept();
        else if (income > 100000)
            accept();
        else
            reject();
    }
}
