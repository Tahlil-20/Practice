package com.immutable;

public class ImmutableDemo {

    public static void main(String [] args){
        Address address = new Address();
        address.setHouseNo(2);
        address.setStreet("Street 1");

        ImmutablePersonClass imm = new ImmutablePersonClass("Zakir", 21, address);
        System.out.println(imm);
        imm.getAddress().setStreet("Street 10");
        System.out.println(imm);
        System.out.println(imm.getAddress());
        //System.out.println();
    }


}
