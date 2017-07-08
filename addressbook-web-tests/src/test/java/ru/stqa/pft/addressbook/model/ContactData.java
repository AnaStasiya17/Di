package ru.stqa.pft.addressbook.model;

public class ContactData {
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
    private final String group;
    private int id;


    public ContactData(int id, String testFirstName, String testMiddleName,
                       String testLastName, String testNickName, String testTitle,
                       String testCompany, String testAddress, String testHome, String testMobile, String testWork,
                       String testFax, String testEmail, String testSecAddress, String testSecHome, String testSecNotes,
                       String group) {
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
        this.group = group;
        this.id = id;
    }

    public ContactData(String testFirstName, String testMiddleName,
                       String testLastName, String testNickName, String testTitle,
                       String testCompany, String testAddress, String testHome, String testMobile, String testWork,
                       String testFax, String testEmail, String testSecAddress, String testSecHome, String testSecNotes,
                       String group) {
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
        this.group = group;
        this.id = Integer.MAX_VALUE;
    }

    @Override
    public String toString() {
        return "ContactData{" +
                "testLastName='" + testLastName + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContactData that = (ContactData) o;

        return testLastName != null ? testLastName.equals(that.testLastName) : that.testLastName == null;
    }

    @Override
    public int hashCode() {
        return testLastName != null ? testLastName.hashCode() : 0;
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

    public String getGroup() {
        return group;
    }
}
