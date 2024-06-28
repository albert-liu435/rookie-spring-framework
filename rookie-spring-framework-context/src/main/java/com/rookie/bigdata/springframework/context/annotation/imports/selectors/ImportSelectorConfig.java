package com.rookie.bigdata.springframework.context.annotation.imports.selectors;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Class ImportSelectorConfig
 * @Description
 * @Author rookie
 * @Date 2024/6/28 10:58
 * @Version 1.0
 */
@Import({MyImportSelector.class})
@Configuration
public class ImportSelectorConfig {
}
