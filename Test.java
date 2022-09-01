package ladem.shop.middleware.service.shopware.client.schema;

import com.fasterxml.jackson.annotation.JsonSubTypes;

@JsonSubTypes(value = {
        @JsonSubTypes.Type(value = A.class, name = "a"),
        @JsonSubTypes.Type(value = B.class, name = "b"),
})
public abstract class Test {
}
