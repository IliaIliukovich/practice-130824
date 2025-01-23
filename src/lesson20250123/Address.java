package lesson20250123;

import java.util.Objects;

public class Address implements Cloneable {

    private String address;

    public Address(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Address address1)) return false;
        return Objects.equals(address, address1.address);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(address);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
