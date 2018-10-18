package org.infinispan.notifications.cachelistener.cluster;

import java.util.Collection;
import java.util.UUID;
import java.util.concurrent.CompletionStage;

import org.infinispan.notifications.cachelistener.CacheNotifier;

/**
 * This interface describes methods required for a cluster listener to be able to be bootstrapped and properly notified
 * when a new event has been raised from the cluster.
 *
 * @author wburns
 * @since 7.0
 */
public interface ClusterCacheNotifier<K, V> extends CacheNotifier<K, V> {
   /**
    * Method that is invoked on the node that has the given cluster listener that when registered generated the given
    * listenerId.  Note this will notify only cluster listeners and regular listeners are not notified of the events.
    * Will fire the events in the order of the iteration of the collection.
    * @param events
    * @param listenerId
    */
   CompletionStage<Void> notifyClusterListeners(Collection<ClusterEvent<K, V>> events, UUID listenerId);

   /**
    * This method is invoked so that this node can send the details required for a new node to be bootstrapped with
    * the existing cluster listeners that are already installed.
    * @return A collection of callables that should be invoked on the new node to properly install cluster listener information
    */
   Collection<ClusterListenerReplicateCallable<K, V>> retrieveClusterListenerCallablesToInstall();
}
