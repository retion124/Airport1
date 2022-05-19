package Enteti;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Terminal {
    @Id
    private int TerminalId;
    private String Gates;
    private String TerminalName;
    private String Workers;

    public int getTerminalI() {return TerminalId;}

    public void  setTerminalId(int terminalId){ TerminalId = terminalId; }

    public String getWorkers() {
        return Workers;
    }

    public void setWorkers(String workers) {
        Workers = workers;
    }

    public String getTerminalName() {
        return TerminalName;
    }

    public void setTerminalName(String terminalName) {
        TerminalName =  terminalName;
    }

    public String getGates() {
        return Gates;
    }

    public void setGates(String gates) {
        Gates = gates;
    }
}
