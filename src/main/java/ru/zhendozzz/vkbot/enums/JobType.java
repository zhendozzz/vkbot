package ru.zhendozzz.vkbot.enums;

public enum JobType {
    VK_CONGRATS("Поздравление в группе вк", "vk_congrats");

    private final String name;
    private final String sysName;

    JobType(String name, String sysName) {
        this.name = name;
        this.sysName = sysName;
    }

    public String getName() {
        return name;
    }

    public String getSysName() {
        return sysName;
    }
}
