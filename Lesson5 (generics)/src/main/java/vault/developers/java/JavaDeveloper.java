package vault.developers.java;

import vault.developers.Developer;

/**
 * Created by Наталья on 12.04.2017.
 */
public class JavaDeveloper extends Developer {

    public JavaDeveloper(String name, Integer iq, boolean workInPPRB) {
        super(name, iq);
        this.workInPPRB = workInPPRB;
    }

    public boolean isWorkInPPRB() {
        return workInPPRB;
    }

    public void setWorkInPPRB(boolean workInPPRB) {
        this.workInPPRB = workInPPRB;
    }

    private boolean workInPPRB;

    public JavaDeveloper(String name, Integer iq) {
        super(name, iq);
    }

    @Override
    public String toString() {
        return "javaDeveloper{" +
                "name='" + this.getName() + '\'' +
                ", iq=" + this.getIq() +
                ", workInPPRB=" + this.isWorkInPPRB() +
                '}';
    }
}

