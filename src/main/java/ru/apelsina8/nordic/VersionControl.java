package ru.apelsina8.nordic;

public class VersionControl {
    private final int version;
    private final boolean flag;

    public VersionControl(int version) {
        this.version = version;
        this.flag = false;
    }

    public int getVersion() {
        return version + 10;
    }

    public boolean isFlag() {
        return flag;
    }

}
