package designPattern.ProxyPattern;

public class TestAtmMachine {

    public static void main(String[] args) {

        AtmMachine atmMachine = new AtmMachine();

        atmMachine.insertCard();

        atmMachine.ejectCard();

        atmMachine.insertCard();

        atmMachine.insertPin(1234);

        atmMachine.requestCash(2000);

        atmMachine.insertCard();

        atmMachine.insertPin(1234);

        // NEW STUFF : Proxy Design Pattern Code
        // The interface limits access to just the methods you want
        // made accessible

        GetAtmData realATMMachine = new AtmMachine();

        GetAtmData atmProxy = new AtmProxy();

        System.out.println("\nCurrent ATM State " + atmProxy.getAtmState());

        System.out.println("\nCash in ATM Machine $" + atmProxy.getCashInMachine());

        // The user can't perform this action because ATMProxy doesn't
        // have access to that potentially harmful method
        // atmProxy.setCashInMachine(10000);
    }
}