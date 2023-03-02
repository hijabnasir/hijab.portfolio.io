package New;

import org.hamcrest.Matcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class VendingMachineTest {
    //junit 4

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void insertProductIsNull() throws IllegalAccessException {
        exception.expect(IllegalAccessException.class);
        exception.expectMessage("A product can not be null");

        VendingMachine vendingMachine = new VendingMachine(2);
        vendingMachine.insertProduct(2, null);
    }

    @Test
    public void insertProductSlots() throws IllegalAccessException {
        exception.expect(IllegalAccessException.class);
        exception.expectMessage("Number of slot is greater than total slots in the vending machine");
        Product coke = new Product("coke", 25, "23-11-2023");

        VendingMachine vendingMachine = new VendingMachine(2);
        vendingMachine.insertProduct(5, coke);

    }

    @Test
    public void insertProductUndefinedSlot() throws IllegalAccessException {
        exception.expect(IllegalAccessException.class);
        exception.expectMessage("Undefined slot");
        Product coke = new Product("coke", 25, "23-11-2023");

        VendingMachine vendingMachine = new VendingMachine(2);
        vendingMachine.insertProduct(-1, coke);

    }

    @Test
    public void insertProductAlreadyExist() throws IllegalAccessException {
        exception.expect(IllegalAccessException.class);
        exception.expectMessage("there is already a product on the slot");
        Product coke = new Product("coke", 25, "23-11-2023");
        Product water = new Product("water", 15, "20-05-2024");

        VendingMachine vendingMachine = new VendingMachine(2);
        vendingMachine.insertProduct(2,coke);
        vendingMachine.insertProduct(2,water);

    }






}

