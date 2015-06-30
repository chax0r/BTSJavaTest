package api;

import model.Order;

/**
 * Author: ckale
 * Date: 6/29/15
 */
public interface OrderProcessorFacade {

    Order processOrder(final Order order) throws Exception;

    Order changeOrder(final Order order) throws Exception;


}
