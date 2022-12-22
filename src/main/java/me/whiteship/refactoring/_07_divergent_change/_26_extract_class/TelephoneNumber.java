package me.whiteship.refactoring._07_divergent_change._26_extract_class;

public class TelephoneNumber {

    private String areaCode;
    private String officeNumber;

    public TelephoneNumber(String areaCode, String officeNumber) {
        this.areaCode = areaCode;
        this.officeNumber = officeNumber;
    }

    public String telephoneNumber() {
        return this.areaCode + " " + this.officeNumber;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String officeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }
}