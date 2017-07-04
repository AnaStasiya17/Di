package ru.stqa.pft.addressbook.model;

public class ContactData {
    private final String testName;
    private final String testFirstName;
    private final String testMiddleName;
    private final String testLastName;
    private final String testNickName;
    private final String testTitle;
    private final String testCompany;
    private final String testAddress;
    private final String testHome;
    private final String testMobile;
    private final String testWork;
    private final String testFax;
    private final String testEmail;
    private final String testSecAddress;
    private final String testSecHome;
    private final String testSecNotes;

    public ContactData(String testName, String testFirstName, String testMiddleName, String testLastName, String testNickName, String testTitle, String testCompany, String testAddress, String testHome, String testMobile, String testWork, String testFax, String testEmail, String testSecAddress, String testSecHome, String testSecNotes) {
        this.testName = testName;
        this.testFirstName = testFirstName;
        this.testMiddleName = testMiddleName;
        this.testLastName = testLastName;
        this.testNickName = testNickName;
        this.testTitle = testTitle;
        this.testCompany = testCompany;
        this.testAddress = testAddress;
        this.testHome = testHome;
        this.testMobile = testMobile;
        this.testWork = testWork;
        this.testFax = testFax;
        this.testEmail = testEmail;
        this.testSecAddress = testSecAddress;
        this.testSecHome = testSecHome;
        this.testSecNotes = testSecNotes;
    }

    public String getTestName() {
        return testName;
    }

    public String getTestFirstName() {
        return testFirstName;
    }

    public String getTestMiddleName() {
        return testMiddleName;
    }

    public String getTestLastName() {
        return testLastName;
    }

    public String getTestNickName() {
        return testNickName;
    }

    public String getTestTitle() {
        return testTitle;
    }

    public String getTestCompany() {
        return testCompany;
    }

    public String getTestAddress() {
        return testAddress;
    }

    public String getTestHome() {
        return testHome;
    }

    public String getTestMobile() {
        return testMobile;
    }

    public String getTestWork() {
        return testWork;
    }

    public String getTestFax() {
        return testFax;
    }

    public String getTestEmail() {
        return testEmail;
    }

    public String getTestSecAddress() {
        return testSecAddress;
    }

    public String getTestSecHome() {
        return testSecHome;
    }

    public String getTestSecNotes() {
        return testSecNotes;
    }
}
