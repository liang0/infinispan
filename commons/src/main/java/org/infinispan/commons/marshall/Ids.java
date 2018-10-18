package org.infinispan.commons.marshall;

/**
 * Internal marshalling identifiers.
 *
 * @author Galder Zamarreño
 * @since 6.0
 */
public interface Ids {

   // No internal externalizer should use this upper limit Id or anything higher than that.
   int MAX_ID = 255;

   int MAPS = 1;
   int COLLECTIONS = 2;

   // responses
   int SUCCESSFUL_RESPONSE = 4;
   int EXCEPTION_RESPONSE = 5;
   int UNSUCCESSFUL_RESPONSE = 6;

   // entries and values
   int IMMORTAL_ENTRY = 7;
   int MORTAL_ENTRY = 8;
   int TRANSIENT_ENTRY = 9;
   int TRANSIENT_MORTAL_ENTRY = 10;
   int IMMORTAL_VALUE = 11;
   int MORTAL_VALUE = 12;
   int TRANSIENT_VALUE = 13;
   int TRANSIENT_MORTAL_VALUE = 14;

   int INT_SUMMARY_STATISTICS = 16;
   int LONG_SUMMARY_STATISTICS = 17;
   int DOUBLE_SUMMARY_STATISTICS = 18;

   int GLOBAL_TRANSACTION = 19;
   int JGROUPS_ADDRESS = 20;
   int WRAPPED_BYTE_ARRAY = 21;

   int DEADLOCK_DETECTING_GLOBAL_TRANSACTION = 22;

   int DEFAULT_CONSISTENT_HASH = 27;
   int REPLICATED_CONSISTENT_HASH = 28;
   int UNSURE_RESPONSE = 29;

   int JGROUPS_TOPOLOGY_AWARE_ADDRESS = 30;
   int REPLICABLE_COMMAND = 31;

   int XID = 32;
   int XID_DEADLOCK_DETECTING_GLOBAL_TRANSACTION = 33;
   int XID_GLOBAL_TRANSACTION = 34;

   int IN_DOUBT_TX_INFO = 35;

   int CACHE_RPC_COMMAND = 36;

   int CACHE_TOPOLOGY = 37;

   // Metadata entries and values
   int METADATA_IMMORTAL_ENTRY = 38;
   int METADATA_MORTAL_ENTRY = 39;
   int METADATA_TRANSIENT_ENTRY = 40;
   int METADATA_TRANSIENT_MORTAL_ENTRY = 41;
   int METADATA_IMMORTAL_VALUE = 42;
   int METADATA_MORTAL_VALUE = 43;
   int METADATA_TRANSIENT_VALUE = 44;
   int METADATA_TRANSIENT_MORTAL_VALUE = 45;

   int TRANSACTION_INFO = 46;

   int FLAG = 47;

   int STATE_CHUNK = 48;
   int CACHE_JOIN_INFO = 49;

   int DEFAULT_CONSISTENT_HASH_FACTORY = 50;
   int REPLICATED_CONSISTENT_HASH_FACTORY = 51;
   int SYNC_CONSISTENT_HASH_FACTORY = 52;
   int TOPOLOGY_AWARE_CONSISTENT_HASH_FACTORY = 53;
   int TOPOLOGY_AWARE_SYNC_CONSISTENT_HASH_FACTORY = 54;
   int SIMPLE_CLUSTERED_VERSION = 55;
   int DELTA_COMPOSITE_KEY = 56;

   int EMBEDDED_METADATA = 57;

   int NUMERIC_VERSION = 58;

   int CACHE_NOT_FOUND_RESPONSE = 59;
   int KEY_VALUE_PAIR_ID = 60;
   int INTERNAL_METADATA_ID = 61;
   int MARSHALLED_ENTRY_ID = 62;

   int ENUM_SET_ID = 63;

   int SIMPLE_COLLECTION_KEY_FILTER = 64;
   int KEY_FILTER_AS_KEY_VALUE_FILTER = 65;
   int CLUSTER_EVENT = 66;
   int CLUSTER_LISTENER_REMOVE_CALLABLE = 67;
   int CLUSTER_LISTENER_REPLICATE_CALLABLE = 68;
   // 69 unused
   int X_SITE_STATE = 70;
   int COMPOSITE_KEY_VALUE_FILTER = 71;
   int CACHE_STATUS_RESPONSE = 72;
   int CACHE_EVENT_CONVERTER_AS_CONVERTER = 73;
   int CACHE_EVENT_FILTER_AS_KEY_VALUE_FILTER = 74;
   int CACHE_EVENT_FILTER_CONVERTER_AS_KEY_VALUE_FILTER_CONVERTER = 75;
   int KEY_FILTER_AS_CACHE_EVENT_FILTER = 76;
   int KEY_VALUE_FILTER_AS_CACHE_EVENT_FILTER = 77;
   int ACCEPT_ALL_KEY_VALUE_FILTER = 78;
   int COMPOSITE_KEY_FILTER = 79;
   int KEY_VALUE_FILTER_AS_KEY_FILTER = 80;
   int MANAGER_STATUS_RESPONSE = 81;
   // 82 unused

   int EQUIVALENCE = 83;

   int INTERMEDIATE_OPERATIONS = 84;
   int TERMINAL_OPERATIONS = 85;
   int STREAM_MARSHALLING = 86;

   int CACHE_FILTERS = 87;

   int OPTIONAL = 88;

   int META_PARAMS_INTERNAL_METADATA = 89;

   // TODO: Add other meta params
   int META_LIFESPAN = 91;
   int META_ENTRY_VERSION = 92;
   int META_MAX_IDLE = 93;

   int READ_WRITE_SNAPSHOT_VIEW = 94;

   int AVAILABILITY_MODE = 95;

   int SYNC_REPLICATED_CONSISTENT_HASH_FACTORY = 96;

   int PERSISTENT_UUID = 97;

   int READ_ONLY_SNAPSHOT_VIEW = 98;
   int NO_VALUE_READ_ONLY_VIEW = 99;

   int MIME_CACHE_ENTRY = 100;
   int UUID = 101;

   int QUEUE = 102;
   int ARRAYS = 103;

   int MURMURHASH_3 = 104;

   int IMMUTABLE_MAP = 105;
   int BYTE_BUFFER = 106;

   // Functional lambdas
   int LAMBDA_CONSTANT = 107;
   int LAMBDA_SET_VALUE_IF_EQUALS_RETURN_BOOLEAN = 108;
   int LAMBDA_WITH_METAS = 109;

   int IMMUTABLE_SET = 110;

   int STREAM_ITERATOR_RESPONSE = 111;
   int END_ITERATOR = 112;

   int STREAM_MAP_OPS = 113;

   int TRIANGLE_ACK_EXTERNALIZER = 114;

   int VERSIONED_RESULT = 115;
   int VERSIONED_RESULTS = 116;

   int APPLY_DELTA = 117;

   int XID_IMPL = 118;

   int ATOMIC_MAP_FUNCTIONS = 119;
   int ATOMIC_KEY_SET = 120;
   int ATOMIC_FINE_GRAINED_MAP_FUNCTIONS = 121;

   int ENCODER_KEY_MAPPER = 122;
   int ENCODER_VALUE_MAPPER = 123;
   int ENCODER_ENTRY_MAPPER = 124;

   int FUNCTION_MAPPER = 125;
   int BI_FUNCTION_MAPPER = 126;

   int SCATTERED_CONSISTENT_HASH_FACTORY = 127;
   int SCATTERED_CONSISTENT_HASH = 128;
   int METADATA_REMOTE = 129;

   int MERGE_FUNCTION_MAPPER = 130;

   int DATA_CONVERSION = 131;

   int INT_SET = 132;

   int SCOPED_STATE = 133;
   int SCOPED_STATE_FILTER = 134;
   int ADMIN_FLAG = 135;
   int CACHE_STATE = 136;

   int STATS_ENVELOPE = 137;
   int BIAS_REVOCATION_RESPONSE = 138;

   int KEY_VALUE_FILTER_CONVERTER_AS_CACHE_EVENT_FILTER_CONVERTER = 139;

   int SIMPLE_PUBLISHER_RESULT = 140;
   int PUBLISHER_REDUCERS = 141;

   int MARSHALLED_VALUE = 142;

   int COUNTER_CONFIGURATION = 2000; //from counter
   int COUNTER_STATE = 2001; //from counter
}
