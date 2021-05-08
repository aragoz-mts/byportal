package org.example;

import java.util.Date;
import java.util.List;

public class Employee {


    static int portal_id = 0;
    private String firstName;
    private String lastName;
    private String middleName;
    private Date birthDate;
    private String jobPosition;
    private String workingAddress;
    private Integer age;
    private List<String> phoneNumbers;
    private byte availibility;


    public Employee() {
            System.out.println();
        }

    public Employee(String firstName, String lastName, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }
    public Employee(String firstName, String lastName, String middleName, Date birthDate, String jobPosition, String workingAddress, Integer age, List<String> phoneNumbers, byte availibility) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.birthDate = birthDate;
        this.jobPosition = jobPosition;
        this.workingAddress = workingAddress;
        this.age = age;
        this.phoneNumbers = phoneNumbers;
        this.availibility = availibility;
    }

    public static int getPortal_id() {
        return portal_id;
    }

    public static void setPortal_id(int portal_id) {
        Employee.portal_id = portal_id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public String getWorkingAddress() {
        return workingAddress;
    }

    public void setWorkingAddress(String workingAddress) {
        this.workingAddress = workingAddress;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public byte getAvailibility() {
        return availibility;
    }

    public void setAvailibility(byte availibility) {
        this.availibility = availibility;
    }
    }

/*
public Date(int year, int month, int date) {
        this(year, month, date, 0, 0, 0);
    }

    /**
     * Allocates a {@code Date} object and initializes it so that
     * it represents the instant at the start of the minute specified by
     * the {@code year}, {@code month}, {@code date},
     * {@code hrs}, and {@code min} arguments, in the local
     * time zone.
     *
     * @param   year    the year minus 1900.
     * @param   month   the month between 0-11.
     * @param   date    the day of the month between 1-31.
     * @param   hrs     the hours between 0-23.
     * @param   min     the minutes between 0-59.
     * @see     java.util.Calendar
     * @deprecated As of JDK version 1.1,
     * replaced by {@code Calendar.set(year + 1900, month, date, hrs, min)}
     * or {@code GregorianCalendar(year + 1900, month, date, hrs, min)}.
     */
 */