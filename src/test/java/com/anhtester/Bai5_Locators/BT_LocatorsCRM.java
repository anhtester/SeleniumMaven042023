package com.anhtester.Bai5_Locators;

public class BT_LocatorsCRM {
    //Login CRM
    public static String headerLoginPage = "//h1[normalize-space()='Login']";
    public static String inputEmail = "//input[@id='email']";
    public static String inputPassword = "//input[@id='password']";
    public static String buttonLogin = "//button[normalize-space()='Login']";
    public static String linkForgotPassword = "//a[normalize-space()='Forgot Password?']";

    //Dashboard
    public static String menuCustomers = "//span[normalize-space()='Customers']";
    public static String menuProjects = "//span[normalize-space()='Projects']";
    public static String menuTasks = "//span[normalize-space()='Tasks']";
    public static String menuDashboard = "//span[normalize-space()='Dashboard']";

    //Customers
    public static String buttonAddNewCustomer = "//a[normalize-space()='New Customer']";
    public static String buttonImportCustomers = "//a[normalize-space()='Import Customers']";
    public static String buttonContacts = "//a[contains(@href,'clients/all_contacts')]";
    public static String headerCustomersPage = "//span[normalize-space()='Customers Summary']";
    public static String inputSearchCustomers = "//div[@id='DataTables_Table_0_filter']//input[@type='search']";
    public static String inputCompanyName = "//input[@id='company']";
    public static String inputVatNumber = "//input[@id='vat']";
    public static String inputPhone = "//input[@id='phonenumber']";
    public static String inputWebsite = "//input[@id='website']";


}
