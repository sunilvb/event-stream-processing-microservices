package demo.function;

import demo.event.OrderEvent;
import demo.event.OrderEventType;
import demo.order.Order;
import demo.order.OrderStatus;
import org.apache.log4j.Logger;
import org.springframework.statemachine.StateContext;

import java.util.function.Function;

public class PaymentConnected extends OrderFunction {

    final private Logger log = Logger.getLogger(PaymentConnected.class);

    public PaymentConnected(StateContext<OrderStatus, OrderEventType> context, Function<OrderEvent, Order> lambda) {
        super(context, lambda);
    }

    /**
     * Apply an {@link OrderEvent} to the lambda function that was provided through the
     * constructor of this {@link OrderFunction}.
     *
     * @param event is the {@link OrderEvent} to apply to the lambda function
     */
    @Override
    public Order apply(OrderEvent event) {
        log.info("Executing workflow for payment connected...");
        return super.apply(event);
    }
}
