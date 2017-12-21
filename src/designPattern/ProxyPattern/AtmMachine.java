package designPattern.ProxyPattern;

public class AtmMachine implements GetAtmData {

    AtmState hasCard;
    AtmState noCard;
    AtmState hasCorrectPin;
    AtmState atmOutOfMoney;

    AtmState atmState;
    boolean correctPinEntered = false;

    public AtmMachine() {
        hasCard = new
    }

    public AtmState getYesCardState() { return hasCard; }
    public AtmState getNoCardState() { return noCard; }
    public AtmState getHasPin() { return hasCorrectPin; }
    public AtmState getNoCashState() { return atmOutOfMoney; }

    // NEW STUFF

    public AtmState getAtmState() { return atmState; }
    public int getCashInMachine() { return cashInMachine; }
}
