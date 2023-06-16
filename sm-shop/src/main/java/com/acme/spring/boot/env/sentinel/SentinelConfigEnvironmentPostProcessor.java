/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.acme.spring.boot.env.sentinel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.util.StringUtils;

import static com.alibaba.csp.sentinel.config.SentinelConfig.APP_NAME_PROP_KEY;
import static com.alibaba.csp.sentinel.config.SentinelConfig.PROJECT_NAME_PROP_KEY;

/**
 * Sentinel Config {@link EnvironmentPostProcessor}
 *
 * @author <a href="mailto:mercyblitz@gmail.com">Mercy</a>
 * @since 1.0.0
 */
public class SentinelConfigEnvironmentPostProcessor implements EnvironmentPostProcessor {

    private static Logger logger = LoggerFactory.getLogger(SentinelConfigEnvironmentPostProcessor.class);

    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        String appName = environment.getProperty(APP_NAME_PROP_KEY);
        if (!StringUtils.hasText(appName)) {
            appName = environment.getProperty(PROJECT_NAME_PROP_KEY);
        }
        if (!StringUtils.hasText(appName)) {
            appName = environment.getProperty("spring.application.name");
        }

        if (StringUtils.hasText(appName)) {
            logger.info("The application name : {} for Sentinel", appName);
            System.setProperty(APP_NAME_PROP_KEY, appName);
        }

    }
}
