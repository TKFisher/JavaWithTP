package JavaBasics;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataStructureMap {


    public static void main(String[] args) {

        Map<String , List<String>> makeModel = new HashMap<String, List<String>>();

        List<String> hondaList = new ArrayList<String>();
        hondaList.add("Civic");
        hondaList.add("Prelude");


        List<String> fordList = new ArrayList<String>();
        fordList.add("Expedition");
        fordList.add("Mustang");

        makeModel.put("Honda", hondaList);
        makeModel.put("Ford", fordList);

        //System.out.println(makeModel);

        System.out.println(makeModel.get("Honda"));
        System.out.println(makeModel.get("Ford"));
        System.out.println(makeModel.containsKey("Ford"));
        System.out.println(makeModel.get("Toyota"));
        System.out.println(makeModel.isEmpty());
        System.out.println(makeModel.get("Audi"));

    }


}
