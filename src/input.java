import java.util.HashMap;

public class input {

    HashMap<String, value >map = new HashMap<>();

    public input() {
        inp();
    }

    public void  inp(){
        map.put("UUU",new value("Phe","F"));
        map.put("UUC",new value("Phe","F"));
        map.put("UUA",new value("Leu","L"));
        map.put("UUG",new value("Leu","L"));
        map.put("CUU",new value("Leu","L"));
        map.put("CUC",new value("Leu","L"));
        map.put("CUA",new value("Leu","L"));
        map.put("CUG",new value("Leu","L"));
        map.put("AUU",new value("ILe","I"));
        map.put("AUC",new value("ILe","I"));
        map.put("AUA",new value("LLe","I"));
        map.put("AUG",new value("Met","M"));
        map.put("GUU",new value("Val","V"));
        map.put("GUC",new value("Val","V"));
        map.put("GUA",new value("Val","V"));
        map.put("GUG",new value("Val","V"));
        map.put("UCU",new value("Ser","S"));
        map.put("UCC",new value("Ser","S"));
        map.put("UCA",new value("Ser","S"));
        map.put("UCG",new value("Ser","S"));
        map.put("CCU",new value("Pro","P"));
        map.put("CCC",new value("Pro","P"));
        map.put("CCA",new value("Pro","P"));
        map.put("CCG",new value("Pro","P"));
        map.put("ACU",new value("Phr","T"));
        map.put("ACC",new value("Phr","T"));
        map.put("ACA",new value("Phr","T"));
        map.put("ACG",new value("Phr","T"));
        map.put("GCU",new value("Ala","A"));
        map.put("GCC",new value("Ala","A"));
        map.put("GCA",new value("Ala","A"));
        map.put("GCG",new value("Ala","A"));
        map.put("UAU",new value("Tyr","T"));
        map.put("UAC",new value("Tyr","T"));
        map.put("UAA",new value("Stop","Stop"));
        map.put("UAG",new value("Stop","Stop"));
        map.put("UGA",new value("Stop","Stop"));
        map.put("CAU",new value("His","H"));
        map.put("CAC",new value("His","H"));
        map.put("CAA",new value("Gln","Q"));
        map.put("CAG",new value("Gln","Q"));
        map.put("AAU",new value("Asn","N"));
        map.put("AAC",new value("Asn","N"));
        map.put("AAA",new value("Lys","K"));
        map.put("AAG",new value("Lys","K"));
        map.put("GAU",new value("Asp","D"));
        map.put("GAC",new value("Asp","D"));
        map.put("GAA",new value("Glu","E"));
        map.put("GAG",new value("Glu","E"));
        map.put("UGU",new value("Cys","C"));
        map.put("UGC",new value("Cys","C"));
        map.put("UGG",new value("Trp","W"));
        map.put("CGU",new value("Arg","R"));
        map.put("CGC",new value("Arg","R"));
        map.put("CGA",new value("Arg","R"));
        map.put("CGG",new value("Arg","R"));
        map.put("AGA",new value("Arg","R"));
        map.put("AGG",new value("Arg","R"));
        map.put("AGU",new value("Ser","S"));
        map.put("AGC",new value("Ser","S"));
        map.put("GGU",new value("Gly","G"));
        map.put("GGC",new value("Gly","G"));
        map.put("GGA",new value("Gly","G"));
        map.put("GGG",new value("Gly","G"));
    }

    public HashMap<String, value> getMap() {
        return map;
    }
}










