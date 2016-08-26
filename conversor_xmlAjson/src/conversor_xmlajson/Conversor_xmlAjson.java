/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor_xmlajson;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

/**
 *
 * @author Yoiner Esteban Gomez Ayala yoiner.gomez22@gmail.com
 */
public class Conversor_xmlAjson {

    /**
     * @param args the command line arguments
     */
    public static int PRETTY_PRINT_INDENT_FACTOR = 4;
    public static String TEST_XML_STRING
            = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
            + "<breakfast_menu>\n"
            + "<food>\n"
            + "<name>Belgian Waffles</name>\n"
            + "<price>$5.95</price>\n"
            + "<description>\n"
            + "Two of our famous Belgian Waffles with plenty of real maple syrup\n"
            + "</description>\n"
            + "<calories>650</calories>\n"
            + "</food>\n"
            + "<food>\n"
            + "<name>Strawberry Belgian Waffles</name>\n"
            + "<price>$7.95</price>\n"
            + "<description>\n"
            + "Light Belgian waffles covered with strawberries and whipped cream\n"
            + "</description>\n"
            + "<calories>900</calories>\n"
            + "</food>\n"
            + "</breakfast_menu>";

    public static void main(String[] args) {
        try {
            JSONObject xmlJSONObj = XML.toJSONObject(TEST_XML_STRING);
            String jsonPrettyPrintString = xmlJSONObj.toString(PRETTY_PRINT_INDENT_FACTOR);
            System.out.println(jsonPrettyPrintString);
        } catch (JSONException e) {
            System.out.println(e.toString());
        }
    }

}
