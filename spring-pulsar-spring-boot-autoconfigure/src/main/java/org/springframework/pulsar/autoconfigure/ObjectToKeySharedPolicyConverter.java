package org.springframework.pulsar.autoconfigure;

import org.apache.pulsar.client.api.KeySharedPolicy;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;

@ConfigurationPropertiesBinding
public class ObjectToKeySharedPolicyConverter implements Converter<Object, KeySharedPolicy> {

    @Override
    public KeySharedPolicy convert(Object source) {
        // Do something to convert to KeySharedPolicy
        return null;
    }
}
