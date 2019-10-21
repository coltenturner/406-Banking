

import Accounts.BankAccounts.*;

import Accounts.BankAccounts.Money.CDs;
import Accounts.BankAccounts.Money.RegSavings;
import Accounts.People.Customer;
import Accounts.People.Managment;
import Accounts.People.Teller;
import org.json.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import  persistence.GetData.*;


public class Main {

    public static void main(String[] args) throws Exception {
        GetData x = new GetData();
        Customer a= x.getCustomerByATM("5445687789148812");
        Customer b= x.getCustomerBySSN("423-14-8894");

        System.out.println(a.getfName());
        System.out.println(b.getfName());

        String jsontest= a.getJSON().toString();
        JSONObject obj = (JSONObject) new JSONTokener(jsontest).nextValue();
        System.out.println("parsieboi:  "+  obj);


        System.out.println("Get test "+  obj.get("zip"));

        /*
        *  String json = "{"
         + "  \"query\": \"Pizza\", "
         + "  \"locations\": [ 94043, 90210 ] "
         + "}";

        JSONObject object = (JSONObject) new JSONTokener(json).nextValue();
        String query = object.getString("query");
        JSONArray locations = object.getJSONArray("locations");
        *
        * */

        Managment c= x.getManager("000-00-0000");
        System.out.println(c.getfName());

        Teller d= x.getTeller("111-11-1111");
        System.out.println(d.getfName());


        ArrayList<CDs> f= x.getCD("345-65-3425");
        System.out.println("CD's with 345-65-3425 SSN");
        for(CDs temp: f){
            System.out.println(temp.getID());
        }
        System.out.println("---------------------");


        ArrayList<RegSavings> g= x.getRegSavings("423-14-8894");
        System.out.println("RegSavings with 345-65-3425 SSN");
        for(RegSavings temp: g){
            System.out.println(temp.getID());
        }
        System.out.println("---------------------");

        HashMap<String, Double> test = new HashMap<>();
        test.put("00-00-0000", 2000.0);
        for (String p: test.keySet()){
            System.out.println(test.get(p));
        }






    }
}



