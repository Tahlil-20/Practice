package com.immutable;

public final class ImmutablePersonClass {

    private final String name;

    public ImmutablePersonClass(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        Address addressCopy = new Address();
        addressCopy.setStreet(address.getStreet());
        addressCopy.setHouseNo(address.getHouseNo());
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
       Address addressCopy = new Address();
       addressCopy.setHouseNo(this.address.getHouseNo());
       addressCopy.setStreet(this.address.getStreet());
       return addressCopy;
    }

    @Override
    public String toString() {
        return "ImmutablePersonClass{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", address=" + address +
            '}';
    }

    private final int age;
    private final Address address;
}
