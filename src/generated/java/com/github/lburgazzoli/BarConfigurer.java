/* Generated by camel build tools - do NOT edit this file! */
package com.github.lburgazzoli;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class BarConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        com.github.lburgazzoli.Bar target = (com.github.lburgazzoli.Bar) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "names":
        case "Names": target.setNames(property(camelContext, java.util.List.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("Names", java.util.List.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        com.github.lburgazzoli.Bar target = (com.github.lburgazzoli.Bar) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "names":
        case "Names": return target.getNames();
        default: return null;
        }
    }
}

