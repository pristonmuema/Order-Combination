/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package order.combination;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author PRISTON
 */
public class Helpers {
     public List<String> convertArrayToList(String[] array) {
        List<String> stringList = new ArrayList<String>(Arrays.asList(array));
        return stringList;
    }

    public List<String> addToList(String element, List<String> list) {

        list.add(element);
        return list;
    }

    public String[] convertListToArray(List<String> list) {
        String[] ins = (String[]) list.toArray(new String[list.size()]);
        return ins;
    }

    public String[] addNewItemToArray(String element, String[] array) {
        List<String> list = convertArrayToList(array);
        list = addToList(element, list);
        return convertListToArray(list);
    }
}
