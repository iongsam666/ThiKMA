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
public class DienThoai extends HangHoa{
    private String producer;
    private String color;
    private String memories;

    public DienThoai() {
    }

    public DienThoai(String producer, String color, String memories) {
        this.producer = producer;
        this.color = color;
        this.memories = memories;
    }

    public DienThoai(String producer, String color, String memories, String iD, String name, double prices) {
        super(iD, name, prices);
        this.producer = producer;
        this.color = color;
        this.memories = memories;
    }

    public String getProducer() {
        return producer;
    }
    public void setProducer(String producer) {
        this.producer = producer;
    }
    
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getMemories() {
        return memories;
    }
    public void setMemories(String memories) {
        this.memories = memories;
    }

    @Override
    public String toString() {
        return super.toString() +  "DienThoai{" + "producer=" + producer +
                ", color=" + color + ", memories=" + memories + '}';
    }
    
    
}
