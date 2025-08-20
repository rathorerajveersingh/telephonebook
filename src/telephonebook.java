package raj.study;
import java.util.Scanner;

public class telephonebook {


    public static void getcontactname(String [][]arr) {
        do {

            System.out.println("Please enter Name of contact");
            Scanner sc=new Scanner(System.in);
            String name=sc.nextLine();
            boolean found=false;
            for (int i = 0; i < arr.length; i++) {


                if(arr[i][0].equalsIgnoreCase(name)) {
                    for(int j=0;j<arr[i].length;j++)
                        System.out.println("Name and Number are="+arr[i][j]);


                    found=true;


                }
                if(!found) {
                    System.out.println("no contact");
                }

            }
            System.out.println("\n");
        }while(true);	}

    public static void main(String[] args) {
        String[][] contacts=new String[10][10];
        contacts[0]=new String[] {"Prasoon","9463837394"};
        contacts[1]=new String[] {"Tushar","7677664838"};
        contacts[2]=new String[] {"Rajvardhan","9995734657"};
        contacts[3]=new String[] {"Shubham","8906767767"};
        contacts[4]=new String[] {"Prahlad","9787767767"};
        contacts[5]=new String[] {"Vishnu","976567767"};
        contacts[6]=new String[] {"Shriraj","878676756"};
        contacts[7]=new String[] {"Prakash","7893493045"};
        contacts[8]=new String[] {"Rohit","7677670984"};
        contacts[9]=new String[] {"Bharat","9695767767"};
        getcontactname(contacts);
    }







}
