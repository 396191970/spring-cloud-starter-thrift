package com.icekredit.rpc.thrift.examples.rpc;

import com.icekredit.rpc.thrift.client.annotation.ThriftClient;
import com.icekredit.rpc.thrift.client.common.ThriftClientAware;
import com.icekredit.rpc.thrift.examples.thrift.CalculatorService;

@ThriftClient(serviceId = "thrift-rpc-calculator", refer = CalculatorService.class, version = 2.0)
public interface CalculatorThriftClient extends ThriftClientAware<CalculatorService.Client> {
}
