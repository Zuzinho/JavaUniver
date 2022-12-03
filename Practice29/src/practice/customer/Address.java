package practice.customer;

public record Address(String cityName, int zipCode, String streetName, int buildingNumber, char buildingLetter,
                      int apartmentNumber) {
    public final static Address EMPTY_ADDRESS = new Address("", 0, "", 0, '\0', 0);
}
