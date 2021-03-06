/*
 * Copyright 2010 Lincoln Baxter, III
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ocpsoft.pretty.faces.rewrite.processor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ocpsoft.pretty.faces.config.rewrite.RewriteRule;
import com.ocpsoft.pretty.faces.rewrite.Processor;

public class MockCustomClassProcessor implements Processor
{
   public static final String RESULT = "I_PROCESSED";

   private String process(final HttpServletRequest req, final HttpServletResponse resp, final RewriteRule rule,
            final String url)
   {
      return RESULT;
   }

   @Override
   public String processInbound(final HttpServletRequest request, final HttpServletResponse response,
             final RewriteRule rule,
             final String url)
   {
      return process(request, response, rule, url);
   }

   @Override
   public String processOutbound(final HttpServletRequest request, final HttpServletResponse response,
             final RewriteRule rule, final String url)
   {
      return process(request, response, rule, url);
   }
}
