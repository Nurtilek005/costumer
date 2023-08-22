public class Bank  {
    private String userName;
    private int password;
    private double totalMoney;

    public Bank(String userName, int password, double totalMoney) {
        this.userName = userName;
        this.password = password;
        this.totalMoney = totalMoney;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "userName='" + userName + '\'' +
                ", password=" + password +
                ", totalMoney=" + totalMoney +
                '}';
    }

    public String payment(String alex, String number, int i) {
        return null;
    }

    public String credit(String number, int i) {
        return null;
    }
}

