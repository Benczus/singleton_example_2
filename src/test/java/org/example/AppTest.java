package org.example;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void testProducerWithNullWarehouse(){
        //given
        Warehouse warehouse = null;
        Producer producer = mock(Producer.class);
        //when
        producer.testProducter();

        //then
        verify(producer, times(1)).testProducter();
    }
}
