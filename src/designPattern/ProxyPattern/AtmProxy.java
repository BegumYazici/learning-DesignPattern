package designPattern.ProxyPattern;

public class AtmProxy implements GetAtmData {

    // Allows the user to access getATMState in the
    // Object ATMMachine

    public AtmState getAtmState() {

        AtmMachine realATMMachine = new AtmMachine();

        return realATMMachine.getAtmState();
    }

    // Allows the user to access getCashInMachine
    // in the Object ATMMachine

    public int getCashInMachine() {

        AtmMachine realATMMachine = new AtmMachine();

        return realATMMachine.getCashInMachine();
    }
}