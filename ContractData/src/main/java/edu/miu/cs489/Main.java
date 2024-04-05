package edu.miu.cs489;

import edu.miu.cs489.module.Contract;
import edu.miu.cs489.module.EmailAddress;
import edu.miu.cs489.module.Label;
import edu.miu.cs489.module.PhoneNumber;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Contract[] contractList= {
            new Contract("David","Sanger", "Argos LLC", "Sales Manager",
                    new PhoneNumber[]{
                            new PhoneNumber("240-133-0011",new Label("Home")),
                            new PhoneNumber("240-112-0123",new Label("Work"))
                    },
                    new EmailAddress[]{
                            new EmailAddress("dave.sang@gmail.com",new Label("Home")),
                            new EmailAddress("dsanger@argos.com", new Label("Work"))
                    }),
            new Contract("Carlos","Jimenez","Zappos","Director"),
            new Contract("Ali","Gafar","BMI Services","HR Manager",
                    new PhoneNumber[]{
                            new PhoneNumber("412-116-9988", new Label("Work"))
                    },
                    new EmailAddress[]{
                            new EmailAddress("ali@bmi.com", new Label("Work"))
                    })
        };

        System.out.println("Print contract object: ");

        for(Contract contact: contractList) {
            System.out.println(contact.toString());
        }

        System.out.println("Print JSON format: ");

        printJsonContracts(contractList);
    }

    private static void printJsonContracts(Contract[] contracts) {
        System.out.println("JSON-formatted list of all Employees:");
        System.out.println("[");
        for (Contract contract : contracts) {
            System.out.println("  " + contractToJson(contract) + ",");
        }
        System.out.println("]");
    }

    private static StringBuilder printJsonPhones(PhoneNumber[] phones) {

        if(phones.length==0) {
            return new StringBuilder("null ");
        }

        StringBuilder stb= new StringBuilder();
        stb.append("[");
        for (PhoneNumber phone : phones) {
            stb.append("  " + phoneToJson(phone) + ",");
        }
        stb.append("]");

        return stb;
    }

    private static String phoneToJson(PhoneNumber phone) {
        return "{\"Phone No\": \"" + phone.phone() + "\", \"Label\": \"" + phone.label()+ "}";
    }

    private static String contractToJson(Contract contract) {
        return new StringBuilder().append("{\"firstName\": \"")
                .append(contract.getFirstName()).append("\", \"lastName\": \"")
                .append(contract.getLastName()).append("\", \"company\": \"")
                .append(contract.getCompany()).append("\", \"jobTitle\": ")
                .append(contract.getJobTitle()).append(printJsonPhones(contract.getPhoneList()))
                .append("}").toString();
    }
}