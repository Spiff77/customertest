package model;

import com.thomaslhomme.model.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CustomerTest {


    @Test
    public void shouldConvertMoneySpentIntoPoints(){
        //
        // Given
        //
        Customer c1 = new Customer("Tom", 30, 100, 50);

        //
        // When
        //
        c1.convert();

        //
        // Then
        //
        Assertions.assertEquals(c1.getPoints(), 1550);
    }

    @Test
    public void shouldGiveExtraPointIfAgeBelow25(){
        //
        // Given
        //
        Customer c1 = new Customer("Tom", 20, 100, 100);

        //
        // When
        //
        //

        //
        // Then
        //
        Assertions.assertEquals(c1.getPoints(), 200);
    }

}
