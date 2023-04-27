package Switchexample;

import java.util.Locale;
import java.util.Scanner;

public class SwtchDemoBrowser {
    public static void main(String args[])
    {
        Scanner scanner= new Scanner(System.in);
        String browser;
      browser =scanner.next();
      browser = browser.toLowerCase(Locale.ROOT);
switch(browser)
        {
            case "chrome":
                System.out.println("Chrome browser is started");
                break;
            case "firefox":
                System.out.println("Firefox browser is started");
                break;
            case "ie":
                System.out.println("IE is  started");
                break;
            case "microsoftedge":
                System.out.println("Microsoftedge is started");
                break;
            default:
                        System.out.println("Default Browser is started");

        }
    }

    }

