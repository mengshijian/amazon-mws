/*******************************************************************************
 * Copyright 2009-2014 Amazon Services. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at: http://aws.amazon.com/apache2.0
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *******************************************************************************
 * Marketplace Web Service Sellers
 * API Version: 2011-07-01
 * Library Version: 2014-09-30
 * Generated: Mon Sep 15 19:38:38 GMT 2014
 */
package com.amazonservices.mws.sellers.samples;

import com.amazonservices.mws.sellers.MarketplaceWebServiceSellersAsync;
import com.amazonservices.mws.sellers.MarketplaceWebServiceSellersAsyncClient;
import com.amazonservices.mws.sellers.MarketplaceWebServiceSellersException;
import com.amazonservices.mws.sellers.model.ListMarketplaceParticipationsRequest;
import com.amazonservices.mws.sellers.model.ListMarketplaceParticipationsResponse;
import com.amazonservices.mws.sellers.model.ResponseHeaderMetadata;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/** Sample async call for ListMarketplaceParticipations. */
public class ListMarketplaceParticipationsAsyncSample {

    /**
     * Call the service, log response and exceptions.
     *
     * @param client
     * @param request
     *
     * @return The response.
     */
    public static List<Object> invokeListMarketplaceParticipations(
            MarketplaceWebServiceSellersAsync client,
            List<ListMarketplaceParticipationsRequest> requestList) {
        // Call the service async.
        List<Future<ListMarketplaceParticipationsResponse>> futureList =
            new ArrayList<Future<ListMarketplaceParticipationsResponse>>();
        for (ListMarketplaceParticipationsRequest request : requestList) {
            Future<ListMarketplaceParticipationsResponse> future =
                client.listMarketplaceParticipationsAsync(request);
            futureList.add(future);
        }
        List<Object> responseList = new ArrayList<Object>();
        for (Future<ListMarketplaceParticipationsResponse> future : futureList) {
            Object xresponse;
            try {
                ListMarketplaceParticipationsResponse response = future.get();
                ResponseHeaderMetadata rhmd = response.getResponseHeaderMetadata();
                // We recommend logging every the request id and timestamp of every call.
                System.out.println("Response:");
                System.out.println("RequestId: "+rhmd.getRequestId());
                System.out.println("Timestamp: "+rhmd.getTimestamp());
                String responseXml = response.toXML();
                System.out.println(responseXml);
                xresponse = response;
            } catch (ExecutionException ee) {
                Throwable cause = ee.getCause();
                if (cause instanceof MarketplaceWebServiceSellersException) {
                    // Exception properties are important for diagnostics.
                    MarketplaceWebServiceSellersException ex =
                        (MarketplaceWebServiceSellersException)cause;
                    ResponseHeaderMetadata rhmd = ex.getResponseHeaderMetadata();
                    System.out.println("Service Exception:");
                    System.out.println("RequestId: "+rhmd.getRequestId());
                    System.out.println("Timestamp: "+rhmd.getTimestamp());
                    System.out.println("Message: "+ex.getMessage());
                    System.out.println("StatusCode: "+ex.getStatusCode());
                    System.out.println("ErrorCode: "+ex.getErrorCode());
                    System.out.println("ErrorType: "+ex.getErrorType());
                    xresponse = ex;
                } else {
                    xresponse = cause;
                }
            } catch (Exception e) {
                xresponse = e;
            }
            responseList.add(xresponse);
        }
        return responseList;
    }

    /**
     *  Command line entry point.
     */
    public static void main(String[] args) {

        // Get a client connection.
        MarketplaceWebServiceSellersAsyncClient client = MarketplaceWebServiceSellersSampleConfig.getAsyncClient();

        // Create a request list.
        List<ListMarketplaceParticipationsRequest> requestList = new ArrayList<ListMarketplaceParticipationsRequest>();
        ListMarketplaceParticipationsRequest request = new ListMarketplaceParticipationsRequest();
        String sellerId = "example";
        request.setSellerId(sellerId);
        String mwsAuthToken = "example";
        request.setMWSAuthToken(mwsAuthToken);
        requestList.add(request);

        // Make the calls.
        ListMarketplaceParticipationsAsyncSample.invokeListMarketplaceParticipations(client, requestList);

    }

}
