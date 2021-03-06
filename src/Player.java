public class Player {
    private String name;
    private int numWins;
    private int playerNum;
    private int moneyForGameTemp;
    private int moneyForGameFinal;

    public Player(int num) {
        //Initialize data fields as needed
    }

    public void setMoneyForGameFinal(int val) {
        moneyForGameFinal += val;
    }

    public int getMoneyForGameFinal() {
        return moneyForGameFinal;
    }

    public void setMoneyForGameTemp(int val) {
        moneyForGameTemp = val;
    }

    public int getMoneyForGameTemp() {
        return moneyForGameTemp;
    }

    public void setNumWins(int n) {
        numWins = n;
    }

    public int getNumWins() {
        return numWins;
    }

    public void incrementNumWins() {
        numWins++;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setPlayerNum(int n) {
        playerNum = n;
    }

    public int getPlayerNum() {
        return playerNum;
    }

    public void payForVowel() {
        moneyForGameTemp -= 250;
    }
}
