/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De1_HangHoa;

/**
 *
 * @author Admin
 */
public class HangHoa {
    private String iD;
    private String name;
    private double prices;

    public HangHoa() {
    }

    public HangHoa(String iD, String name, double prices) {
        this.iD = iD;
        this.name = name;
        this.prices = prices;
    }

    public String getiD() {
        return iD;
    }
    public void setiD(String iD) {
        this.iD = iD;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public double getPrices() {
        return prices;
    }

    public void setPrices(double prices) {
        this.prices = prices;
    }

    @Override
    public String toString() {
        return "HangHoa{" + "iD=" + iD + ", name=" + name + ", prices="
                + prices + '}';
    }
    
    
}
