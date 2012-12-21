/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.linkedin.events;

@SuppressWarnings("all")
/** An event to monitor the tracking system itself */
public class TrackingMonitoringEvent extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
	public static final org.apache.avro.Schema SCHEMA$ = org.apache.avro.Schema
			.parse("{\"type\":\"record\",\"name\":\"TrackingMonitoringEvent\",\"namespace\":\"com.linkedin.events\",\"fields\":[{\"name\":\"header\",\"type\":{\"type\":\"record\",\"name\":\"EventHeader\",\"fields\":[{\"name\":\"memberId\",\"type\":\"int\",\"doc\":\"The member id of the user initiating the action\"},{\"name\":\"time\",\"type\":\"long\",\"doc\":\"The time of the event\"},{\"name\":\"server\",\"type\":\"string\",\"doc\":\"The name of the server\"},{\"name\":\"service\",\"type\":\"string\",\"doc\":\"The name of the service\"},{\"name\":\"guid\",\"type\":{\"type\":\"fixed\",\"name\":\"Guid\",\"size\":16},\"doc\":\"A unique identifier for the message\"}]}},{\"name\":\"tier\",\"type\":\"string\",\"doc\":\"A name for the tier of servers to which this event belongs (client, broker, etc)\"},{\"name\":\"eventType\",\"type\":\"string\",\"doc\":\"The event type being monitored\"},{\"name\":\"count\",\"type\":\"long\",\"doc\":\"The number of events sent in this time period\"},{\"name\":\"beginTimestamp\",\"type\":\"long\",\"doc\":\"The timestamp at which this count began\"},{\"name\":\"endTimestamp\",\"type\":\"long\",\"doc\":\"The timestamp at which this count ended\"}]}");
	public com.linkedin.events.EventHeader header;
	/**
	 * A name for the tier of servers to which this event belongs (client,
	 * broker, etc)
	 */
	public java.lang.CharSequence tier;
	/** The event type being monitored */
	public java.lang.CharSequence eventType;
	/** The number of events sent in this time period */
	public long count;
	/** The timestamp at which this count began */
	public long beginTimestamp;
	/** The timestamp at which this count ended */
	public long endTimestamp;

	public org.apache.avro.Schema getSchema() {
		return SCHEMA$;
	}

	// Used by DatumWriter. Applications should not call.
	public java.lang.Object get(int field$) {
		switch (field$) {
		case 0:
			return header;
		case 1:
			return tier;
		case 2:
			return eventType;
		case 3:
			return count;
		case 4:
			return beginTimestamp;
		case 5:
			return endTimestamp;
		default:
			throw new org.apache.avro.AvroRuntimeException("Bad index");
		}
	}

	// Used by DatumReader. Applications should not call.
	@SuppressWarnings(value = "unchecked")
	public void put(int field$, java.lang.Object value$) {
		switch (field$) {
		case 0:
			header = (com.linkedin.events.EventHeader) value$;
			break;
		case 1:
			tier = (java.lang.CharSequence) value$;
			break;
		case 2:
			eventType = (java.lang.CharSequence) value$;
			break;
		case 3:
			count = (java.lang.Long) value$;
			break;
		case 4:
			beginTimestamp = (java.lang.Long) value$;
			break;
		case 5:
			endTimestamp = (java.lang.Long) value$;
			break;
		default:
			throw new org.apache.avro.AvroRuntimeException("Bad index");
		}
	}
}
