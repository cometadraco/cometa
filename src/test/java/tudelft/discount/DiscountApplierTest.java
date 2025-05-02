package tudelft.discount;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;
public class DiscountApplierTest {
    @Test
    public void testSetNewPricesForBusinessAndHome() {
        // Crear productos de prueba
        Product homeProduct = new Product("Home Product", 100.0, "HOME");
        Product businessProduct = new Product("Business Product", 100.0, "BUSINESS");
        // Crear mock de ProductDao
        ProductDao mockDao = mock(ProductDao.class);
        // Simular que el dao devuelve una lista de productos
        when(mockDao.all()).thenReturn(Arrays.asList(homeProduct, businessProduct));
        // Crear instancia de DiscountApplier con el mock de ProductDao
        DiscountApplier discountApplier = new DiscountApplier(mockDao);
        // Aplicar los nuevos precios
        discountApplier.setNewPrices();

        // Verificar los precios después de aplicar los descuentos
        assertEquals(90.0, homeProduct.getPrice(), 0.01); // Descuento del 10% para HOME
        assertEquals(110.0, businessProduct.getPrice(), 0.01); // Aumento del 10% para BUSINESS
    }
}
