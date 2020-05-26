package vo;

import java.io.Serializable;

public class DataData implements Serializable{
    private static final long serialVersionUID = 1L;
    private String sourceId;
    private String itemId;
    
    public String getSourceId() {
        return sourceId;
    }
    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }
    public String getItemId() {
        return itemId;
    }
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }
    public DataData(String sourceId, String itemId) {
        super();
        this.sourceId = sourceId;
        this.itemId = itemId;
    }
    public DataData() {}
    
    @Override
    public String toString() {
        return "DataType [sourceId=" + sourceId + ", itemId=" + itemId + "]";
    }
}
