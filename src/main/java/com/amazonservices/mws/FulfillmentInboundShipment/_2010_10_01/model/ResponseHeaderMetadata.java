/*******************************************************************************
 * Copyright 2009-2016 Amazon Services. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at: http://aws.amazon.com/apache2.0
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *******************************************************************************
 * Library Version: 2016-10-05
 * Generated: Wed Oct 05 06:15:34 PDT 2016
 */
package com.amazonservices.mws.FulfillmentInboundShipment._2010_10_01.model;

import com.amazonservices.mws.client.MwsResponseHeaderMetadata;

import java.util.Date;
import java.util.List;

/**
 * ResponseHeaderMetadata
 */
public class ResponseHeaderMetadata extends MwsResponseHeaderMetadata {

    /** Value constructor. */
    public ResponseHeaderMetadata(String requestId, List<String> responseContext, String timestamp,
                                  Double quotaMax, Double quotaRemaining, Date quotaResetsAt) {
        super(requestId, responseContext, timestamp, quotaMax, quotaRemaining, quotaResetsAt);
    }

    /** Empty constructor. */
    public ResponseHeaderMetadata() {
        super(null, null, null, null, null, null);
    }

    /** Copy constructor. */
    public ResponseHeaderMetadata(MwsResponseHeaderMetadata rhmd) {
        super(rhmd);
    }

}
