import java.util.*;
import java.lang.Math;
public class student {
    static Scanner sc = new Scanner(System.in);
    public HashMap<String, ArrayList<String>> addStudent(){
        System.out.println("How many students you want to add");
        int num = sc.nextInt();
        HashMap<String,ArrayList<String>> std = new  HashMap<String,ArrayList<String>>(num);
        for(int i=0; i<num;i++){
            System.out.print("Enter the "+(i+1)+" student Id: ");
            int stdId = sc.nextInt();
            int k = stdId%10000;
            if(k>0 && k<9999){
                sc.nextLine();
                String st = Integer.toString(stdId);
                std.put(st, new ArrayList<String>());
                System.out.print("Enter the Student name: ");
                String name = sc.nextLine();
                std.get(st).add(name);
                System.out.print("Enter the Student course name: ");
                String course = sc.nextLine();
                std.get(st).add(course);
                System.out.print("Enter the Student annual tution fee: ");
                String tuFee = sc.nextLine();
                std.get(st).add(tuFee);
            }
            else{
                System.out.println("Sorry it's not a valid student id");
                break;
            }
            
        }
        return std;
    }
    public void printIdName(HashMap<String, ArrayList<String>> Idname){
        for(HashMap.Entry<String, ArrayList<String>> entry : Idname.entrySet()){
            System.out.print(entry.getKey()+" : ");
            for(String name: entry.getValue()){
                System.out.print(name);
                break;
            }
            System.out.println();
        }
    }
    public void printInd(HashMap<String,ArrayList<String>> names){
        System.out.println("Enter the Student id: ");
        int k = sc.nextInt();
        String s = Integer.toString(k);
        if(names.get(s)!=null){
            for(HashMap.Entry<String, ArrayList<String>> entry : names.entrySet()){
                boolean areEqual = s.equals(entry.getKey());
                if(areEqual){
                    System.out.print(entry.getKey()+" : ");
                        for(String name: entry.getValue()){
                            System.out.print(name+"\t");
                        }
                    System.out.println();
                }
                else{continue;}
            }
        }
        else{
            System.out.println("Sorry details of the student not found");
        }
    }
    public void print(HashMap<String,ArrayList<String>> students){
        for(HashMap.Entry<String,ArrayList<String>> entry : students.entrySet()){
            System.out.print(entry.getKey()+" : ");
            for(String name: entry.getValue()){
                System.out.print(name+"\t");
            }
            System.out.println();
        }  
    }
    public HashMap<String,ArrayList<String>> printbalance(HashMap<String,ArrayList<String>> std){
        try{int i =0;
            ArrayList<String> arr = new ArrayList<String>();
            System.out.println("Enter the Student id: ");
            int k = sc.nextInt();
            sc.nextLine();
            String s = Integer.toString(k);
            if(std.get(s)!=null){
                for(HashMap.Entry<String, ArrayList<String>> entry : std.entrySet()){
                    boolean areEqual = s.equals(entry.getKey());
                    for(String cane: entry.getValue()){
                        arr.add(cane);
                    }
                    if(areEqual){
                            for(String name: entry.getValue()){
                                if(i==(arr.size()-1)){
                                    int r = Integer.parseInt(name);
                                    System.out.print("How much do wanna pay: ");
                                    int o = sc.nextInt();
                                    int l = r - o;
                                    if(l==0){
                                        String w = Integer.toString(l);
                                        std.get(entry.getKey()).add(w);
                                        System.out.println("Your fee for the current academic year is cleared");
                                    }
                                    else if(l>0){
                                        String q = Integer.toString(l);
                                        std.get(entry.getKey()).add(q);
                                        System.out.println("The student has to pay "+l+" ruppees more to clear his tutuion fee for the year");
                                    }
                                    else{
                                        String y = Integer.toString(Math.abs(l));
                                        std.get(entry.getKey()).add(y);
                                        System.out.println("The student has payed "+y+" ruppees extra.");
                                        System.out.println("The student can pay "+y+" less for the next academic year");
                                    }
                                }      
                                i++;
                            }
                        System.out.println();
                    }
                    else{continue;}
                }
            }
            else{
                System.out.println("Sorry details of the student not found");
            }
            return std;
        }
        catch(Exception e){
            System.out.println();
            return std;
        }
    }
}
