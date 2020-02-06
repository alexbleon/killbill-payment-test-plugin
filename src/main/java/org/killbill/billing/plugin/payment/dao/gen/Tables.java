/*
 * Copyright 2014-2020 The Billing Project, LLC
 *
 * The Billing Project licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

/*
 * This file is generated by jOOQ.
*/
package org.killbill.billing.plugin.payment.dao.gen;


import javax.annotation.Generated;

import org.killbill.billing.plugin.payment.dao.gen.tables.TestpaymentHppRequests;
import org.killbill.billing.plugin.payment.dao.gen.tables.TestpaymentPaymentMethods;
import org.killbill.billing.plugin.payment.dao.gen.tables.TestpaymentResponses;


/**
 * Convenience access to all tables in killbill
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>killbill.testpayment_hpp_requests</code>.
     */
    public static final TestpaymentHppRequests TESTPAYMENT_HPP_REQUESTS = org.killbill.billing.plugin.payment.dao.gen.tables.TestpaymentHppRequests.TESTPAYMENT_HPP_REQUESTS;

    /**
     * The table <code>killbill.testpayment_payment_methods</code>.
     */
    public static final TestpaymentPaymentMethods TESTPAYMENT_PAYMENT_METHODS = org.killbill.billing.plugin.payment.dao.gen.tables.TestpaymentPaymentMethods.TESTPAYMENT_PAYMENT_METHODS;

    /**
     * The table <code>killbill.testpayment_responses</code>.
     */
    public static final TestpaymentResponses TESTPAYMENT_RESPONSES = org.killbill.billing.plugin.payment.dao.gen.tables.TestpaymentResponses.TESTPAYMENT_RESPONSES;
}
