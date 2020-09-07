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
 * FBA Outbound Service MWS
 * API Version: 2010-10-01
 * Library Version: 2016-10-19
 * Generated: Wed Oct 19 08:37:51 PDT 2016
 */
package com.amazonservices.mws.FulfillmentOutboundShipment._2010_10_01.samples;

import com.amazonservices.mws.FulfillmentOutboundShipment._2010_10_01.FBAOutboundServiceMWSAsync;
import com.amazonservices.mws.FulfillmentOutboundShipment._2010_10_01.FBAOutboundServiceMWSAsyncClient;
import com.amazonservices.mws.FulfillmentOutboundShipment._2010_10_01.FBAOutboundServiceMWSException;
import com.amazonservices.mws.FulfillmentOutboundShipment._2010_10_01.model.CreateFulfillmentReturnRequest;
import com.amazonservices.mws.FulfillmentOutboundShipment._2010_10_01.model.CreateFulfillmentReturnResponse;
import com.amazonservices.mws.FulfillmentOutboundShipment._2010_10_01.model.CreateReturnItemList;
import com.amazonservices.mws.FulfillmentOutboundShipment._2010_10_01.model.ResponseHeaderMetadata;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/** Sample async call for CreateFulfillmentReturn. */
public class CreateFulfillmentReturnAsyncSample {

    /**
     * Call the service, log response and exceptions.
     *
     * @param client
     * @param request
     *
     * @return The response.
     */
    public static List<Object> invokeCreateFulfillmentReturn(
            FBAOutboundServiceMWSAsync client,
            List<CreateFulfillmentReturnRequest> requestList) {
        // Call the service async.
        List<Future<CreateFulfillmentReturnResponse>> futureList =
            new ArrayList<Future<CreateFulfillmentReturnResponse>>();
        for (CreateFulfillmentReturnRequest request : requestList) {
            Future<CreateFulfillmentReturnResponse> future =
                client.createFulfillmentReturnAsync(request);
            futureList.add(future);
        }
        List<Object> responseList = new ArrayList<Object>();
        for (Future<CreateFulfillmentReturnResponse> future : futureList) {
            Object xresponse;
            try {
                CreateFulfillmentReturnResponse response = future.get();
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
                if (cause instanceof FBAOutboundServiceMWSException) {
                    // Exception properties are important for diagnostics.
                    FBAOutboundServiceMWSException ex =
                        (FBAOutboundServiceMWSException)cause;
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
        FBAOutboundServiceMWSAsyncClient client = FBAOutboundServiceMWSSampleConfig.getAsyncClient();

        // Create a request list.
        List<CreateFulfillmentReturnRequest> requestList = new ArrayList<CreateFulfillmentReturnRequest>();
        CreateFulfillmentReturnRequest request = new CreateFulfillmentReturnRequest();
        String sellerId = "example";
        request.setSellerId(sellerId);
        String mwsAuthToken = "example";
        request.setMWSAuthToken(mwsAuthToken);
        String sellerFulfillmentOrderId = "example";
        request.setSellerFulfillmentOrderId(sellerFulfillmentOrderId);
        CreateReturnItemList items = new CreateReturnItemList();
        request.setItems(items);
        requestList.add(request);

        // Make the calls.
        CreateFulfillmentReturnAsyncSample.invokeCreateFulfillmentReturn(client, requestList);

    }

}
