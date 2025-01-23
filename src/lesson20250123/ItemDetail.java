package lesson20250123;

import java.io.Serializable;
import java.util.Objects;

public class ItemDetail implements Serializable {

    private String itemInfo;

    public ItemDetail(String itemInfo) {
        this.itemInfo = itemInfo;
    }

    @Override
    public String toString() {
        return "ItemDetail{" +
                "itemInfo='" + itemInfo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof ItemDetail that)) return false;
        return Objects.equals(itemInfo, that.itemInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(itemInfo);
    }
}
