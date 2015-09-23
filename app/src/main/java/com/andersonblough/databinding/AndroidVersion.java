package com.andersonblough.databinding;

/**
 * @author Bill Anderson-Blough (bill.andersonblough@gmail.com)
 */
public class AndroidVersion {

    public static final String[] codenames = {"Cupcake", "Donut", "Eclair", "Froyo", "Gingerbread", "Honeycomb", "Ice Cream Sandwich", "JellyBean", "Kit Kat", "Lollipop", "Marshmallow"};
    public static final String[] versionNumbers = {"1.5", "1.6", "2.0", "2.1", "2.3", "3.0", "4.0", "4.1", "4.4", "5.0", "6.0"};

    private final String codename;
    private final String versionNumber;
    private final boolean isCurrent;

    public AndroidVersion(int position) {
        this(codenames[position], versionNumbers[position]);
    }

    public AndroidVersion(String codename, String versionNumber) {
        this.codename = codename;
        this.versionNumber = versionNumber;
        this.isCurrent = versionNumber.equals("6.0");
    }

    public boolean isCurrent() {
        return isCurrent;
    }

    public String getCodename() {
        return codename;
    }

    public String getVersionNumber() {
        return versionNumber;
    }


}
