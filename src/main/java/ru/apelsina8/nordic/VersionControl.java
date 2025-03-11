package ru.apelsina8.nordic;

public class VersionControl {
    private static final int STABLE_VERSION = 1;
    private final int updateVersion;
    private final boolean flag;

    public VersionControl(int updateVersion, boolean flag) {
        this.updateVersion = updateVersion;
        this.flag = flag;
    }

    public VersionControl(int updateVersion) {
        this.updateVersion = updateVersion;
        this.flag = true;
    }

    public int getUpdateVersion() {
        return updateVersion;
    }

    public boolean isFlag() {
        return flag;
    }

    public void udpadeVersion() {
        System.out.println("Текущая версия: " + STABLE_VERSION + "."  + updateVersion);
    }

}
