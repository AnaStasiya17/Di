package ru.stqa.pft.addressbook.model;

public class ContactData {
    private String testFirstName;
    private String testMiddleName;
    private String testLastName;
    private String testNickName;
    private String testTitle;
    private String testCompany;
    private String testAddress;
    private String testHome;
    private String testMobile;
    private String testWork;
    private String testFax;
    private String testEmail;
    private String testSecAddress;
    private String testSecHome;
    private String testSecNotes;
    private String group;
    private int id = Integer.MAX_VALUE;

    public ContactData withTestFirstName(String testFirstName) {
        this.testFirstName = testFirstName;
        return this;
    }

    public ContactData withTestMiddleName(String testMiddleName) {
        this.testMiddleName = testMiddleName;
        return this;
    }

    public ContactData withTestLastName(String testLastName) {
        this.testLastName = testLastName;
        return this;
    }

    public ContactData withTestNickName(String testNickName) {
        this.testNickName = testNickName;
        return this;
    }

    public ContactData withTestTitle(String testTitle) {
        this.testTitle = testTitle;
        return this;
    }

    public ContactData withTestCompany(String testCompany) {
        this.testCompany = testCompany;
        return this;
    }

    public ContactData withTestAddress(String testAddress) {
        this.testAddress = testAddress;
        return this;
    }

    public ContactData withTestHome(String testHome) {
        this.testHome = testHome;
        return this;
    }

    public ContactData withTestMobile(String testMobile) {
        this.testMobile = testMobile;
        return this;
    }

    public ContactData withTestWork(String testWork) {
        this.testWork = testWork;
        return this;
    }

    public ContactData withTestFax(String testFax) {
        this.testFax = testFax;
        return this;
    }

    public ContactData withTestEmail(String testEmail) {
        this.testEmail = testEmail;
        return this;
    }

    public ContactData withTestSecAddress(String testSecAddress) {
        this.testSecAddress = testSecAddress;
        return this;
    }

    public ContactData withTestSecHome(String testSecHome) {
        this.testSecHome = testSecHome;
        return this;
    }

    public ContactData withTestSecNotes(String testSecNotes) {
        this.testSecNotes = testSecNotes;
        return this;
    }

    public ContactData withGroup(String group) {
        this.group = group;
        return this;
    }

    public ContactData withId(int id) {
        this.id = id;
        return this;
    }

    public int getId() {
        return id;
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

    @Override
    public String toString() {
        return "ContactData{" +
                "testLastName='" + testLastName + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContactData that = (ContactData) o;

        if (id != that.id) return false;
        if (testFirstName != null ? !testFirstName.equals(that.testFirstName) : that.testFirstName != null)
            return false;
        return testLastName != null ? testLastName.equals(that.testLastName) : that.testLastName == null;
    }

    @Override
    public int hashCode() {
        int result = testFirstName != null ? testFirstName.hashCode() : 0;
        result = 31 * result + (testLastName != null ? testLastName.hashCode() : 0);
        result = 31 * result + id;
        return result;
    }
}
