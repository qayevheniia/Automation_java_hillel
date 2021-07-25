package Lessons12.Task;

public enum VarEnum {
    Summer(1),
    Autumn(2),
    Winter(3),
    Spring(4);

    int integerOfSeason;

    VarEnum() {
    }

    VarEnum(int integerOfSeason) {

        this.integerOfSeason = integerOfSeason;
    }

    public int getIntegerOfSeason() {
        return integerOfSeason;
    }

    //Get  name of sizons by integerOfSessions

    public static VarEnum getGenderByCode(int integerOfSeason) {
        for (VarEnum varEnum : VarEnum.values()) {
            if (varEnum.integerOfSeason == integerOfSeason) {
                return varEnum;
            }
        }
        return null;
    }

}
