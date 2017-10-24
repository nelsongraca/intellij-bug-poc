package com.flowkode.ideapoc;

import org.wildfly.swarm.Swarm;
import org.wildfly.swarm.messaging.EnhancedServer;
import org.wildfly.swarm.messaging.MessagingFraction;

public class Main {

    public static void main(String[] args) throws Exception {
        new Swarm(args)
                .fraction(new MessagingFraction().defaultServer(EnhancedServer::enableClustering))
                .start()
                .deploy();
    }
}
