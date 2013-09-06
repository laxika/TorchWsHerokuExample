/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package io.torch.herokuexample;

import io.torch.controller.WebPage;
import io.torch.http.request.TorchHttpRequest;
import io.torch.http.response.TorchHttpResponse;
import io.torch.session.Session;


/**
 *
 * @author Laxika
 */
public class Hello extends WebPage{

    @Override
    public void handle(TorchHttpRequest request, TorchHttpResponse response, Session session) {
        response.appendContent("hello!");
    }
    
}
