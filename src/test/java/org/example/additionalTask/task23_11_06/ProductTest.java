package org.example.additionalTask.task23_11_06;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static jdk.internal.org.objectweb.asm.util.CheckClassAdapter.verify;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class ProductTest {
    @Mock
    private InventoryService inventoryService;

    @InjectMocks
    private OrderFulfillmentService orderFulfillmentService;


    @Test
    public void fulfillOrderWithSufficientStockTest() {
        Product product = new Product("ABC123", 100);
        int quantity = 50;

        when(inventoryService.checkProductStock("ABC123")).thenReturn(100);
        when(inventoryService.updateStock("ABC123", -quantity)).thenReturn(true);

        boolean result = orderFulfillmentService.fulfillOrder(product, quantity);

        assertTrue(result);
        assertEquals(50, product.getStockQuantity());
        verify(inventoryService, times(1)).checkProductStock("ABC123");
        verify(inventoryService, times(1)).updateStock("ABC123", -quantity);
    }

    @Test
    public void fulfillOrderWithInsufficientStockTest() {
        Product product = new Product("ABC123", 100);
        int quantity = 150;

        when(inventoryService.checkProductStock("ABC123")).thenReturn(100);

        boolean result = orderFulfillmentService.fulfillOrder(product, quantity);

        assertFalse(result);
        assertEquals(100, product.getStockQuantity());
        verify(inventoryService, times(1)).checkProductStock("ABC123");
        verify(inventoryService, never()).updateStock(anyString(), anyInt());
    }

    @Test
    public void returnItemsToInventoryTest() {
        Product product = new Product("ABC123", 100);
        int quantity = 50;

        when(inventoryService.updateStock("ABC123", quantity)).thenReturn(true);

        boolean result = orderFulfillmentService.returnItemsToInventory(product, quantity);

        assertTrue(result);
        assertEquals(150, product.getStockQuantity());
        verify(inventoryService, times(1)).updateStock("ABC123", quantity);
    }

}