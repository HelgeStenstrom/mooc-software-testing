package tudelft.discount;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DiscountApplierTest {

    Product business = new Product("bu", 100, "BUSINESS");
    Product home = new Product("ho", 100, "HOME");


    @Test
    void bu() {
        // Setup

        ProductDao dao = Mockito.mock(ProductDao.class);
        final DiscountApplier discountApplier = new DiscountApplier(dao);

        Mockito.when(dao.all()).thenReturn(Arrays.asList(business, home));
        // Exercise

        discountApplier.setNewPrices();
        // Verify

        assertEquals(110, business.getPrice(), 0.01);
    }

    @Test
    void setHome() {
        // Setup

        ProductDao dao = Mockito.mock(ProductDao.class);
        final DiscountApplier discountApplier = new DiscountApplier(dao);

        Mockito.when(dao.all()).thenReturn(Arrays.asList(business, home));
        // Exercise

        discountApplier.setNewPrices();

        // Verify
        assertEquals(90, home.getPrice(), 0.01);
    }
}
