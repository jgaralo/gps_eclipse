package org.openapitools.configuration;

import org.openapitools.model.Mark;
import org.openapitools.model.Winner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;

@Configuration
public class EnumConverterConfiguration {

    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.markConverter")
    Converter<String, Mark> markConverter() {
        return new Converter<String, Mark>() {
            @Override
            public Mark convert(String source) {
                return Mark.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.winnerConverter")
    Converter<String, Winner> winnerConverter() {
        return new Converter<String, Winner>() {
            @Override
            public Winner convert(String source) {
                return Winner.fromValue(source);
            }
        };
    }

}
