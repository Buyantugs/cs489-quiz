package edu.miu.cs489.module;

import java.util.Arrays;

public class Contract
{
    private String firstName;
    private String lastName;

    private String company;
    private String jobTitle;
    private PhoneNumber[] phoneList;
    private EmailAddress[] emailAddresses;

    public Contract(String firstName, String lastName, String company, String jobTitle, PhoneNumber[] phoneList, EmailAddress[] emailAddresses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.jobTitle = jobTitle;
        this.phoneList = phoneList;
        this.emailAddresses = emailAddresses;
    }

    public Contract(String firstName, String lastName, String company, String jobTitle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.jobTitle = jobTitle;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCompany() {
        return company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public PhoneNumber[] getPhoneList() {
        return phoneList;
    }

    public EmailAddress[] getEmailAddresses() {
        return emailAddresses;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setPhoneList(PhoneNumber[] phoneList) {
        this.phoneList = phoneList;
    }

    public void setEmailAddresses(EmailAddress[] emailAddresses) {
        this.emailAddresses = emailAddresses;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", company='" + company + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", phoneList=" + Arrays.toString(phoneList) +
                ", emailAddresses=" + Arrays.toString(emailAddresses) +
                '}';
    }
}
