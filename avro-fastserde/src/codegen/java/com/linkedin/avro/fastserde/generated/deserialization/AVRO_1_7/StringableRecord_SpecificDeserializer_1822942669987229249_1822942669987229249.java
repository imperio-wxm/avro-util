
package com.linkedin.avro.fastserde.generated.deserialization.AVRO_1_7;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.linkedin.avro.fastserde.FastDeserializer;
import org.apache.avro.AvroRuntimeException;
import org.apache.avro.Schema;
import org.apache.avro.generic.GenericArray;
import org.apache.avro.io.Decoder;
import org.apache.avro.util.Utf8;

public class StringableRecord_SpecificDeserializer_1822942669987229249_1822942669987229249
    implements FastDeserializer<com.linkedin.avro.fastserde.generated.avro.StringableRecord>
{

    private final Schema readerSchema;

    public StringableRecord_SpecificDeserializer_1822942669987229249_1822942669987229249(Schema readerSchema) {
        this.readerSchema = readerSchema;
    }

    public com.linkedin.avro.fastserde.generated.avro.StringableRecord deserialize(com.linkedin.avro.fastserde.generated.avro.StringableRecord reuse, Decoder decoder)
        throws IOException
    {
        try {
            return deserializeStringableRecord0((reuse), (decoder));
        } catch (NumberFormatException e) {
            throw new AvroRuntimeException(e);
        } catch (URISyntaxException e) {
            throw new AvroRuntimeException(e);
        } catch (MalformedURLException e) {
            throw new AvroRuntimeException(e);
        }
    }

    public com.linkedin.avro.fastserde.generated.avro.StringableRecord deserializeStringableRecord0(Object reuse, Decoder decoder)
        throws IOException, NumberFormatException, MalformedURLException, URISyntaxException
    {
        com.linkedin.avro.fastserde.generated.avro.StringableRecord StringableRecord;
        if ((reuse)!= null) {
            StringableRecord = ((com.linkedin.avro.fastserde.generated.avro.StringableRecord)(reuse));
        } else {
            StringableRecord = new com.linkedin.avro.fastserde.generated.avro.StringableRecord();
        }
        if (StringableRecord.get(0) instanceof Utf8) {
            StringableRecord.put(0, new BigInteger((decoder).readString(((Utf8) StringableRecord.get(0))).toString()));
        } else {
            StringableRecord.put(0, new BigInteger((decoder).readString(null).toString()));
        }
        if (StringableRecord.get(1) instanceof Utf8) {
            StringableRecord.put(1, new BigDecimal((decoder).readString(((Utf8) StringableRecord.get(1))).toString()));
        } else {
            StringableRecord.put(1, new BigDecimal((decoder).readString(null).toString()));
        }
        if (StringableRecord.get(2) instanceof Utf8) {
            StringableRecord.put(2, new URI((decoder).readString(((Utf8) StringableRecord.get(2))).toString()));
        } else {
            StringableRecord.put(2, new URI((decoder).readString(null).toString()));
        }
        if (StringableRecord.get(3) instanceof Utf8) {
            StringableRecord.put(3, new URL((decoder).readString(((Utf8) StringableRecord.get(3))).toString()));
        } else {
            StringableRecord.put(3, new URL((decoder).readString(null).toString()));
        }
        if (StringableRecord.get(4) instanceof Utf8) {
            StringableRecord.put(4, new File((decoder).readString(((Utf8) StringableRecord.get(4))).toString()));
        } else {
            StringableRecord.put(4, new File((decoder).readString(null).toString()));
        }
        List<URL> urlArray0 = null;
        long chunkLen0 = (decoder.readArrayStart());
        if (chunkLen0 > 0) {
            if (StringableRecord.get(5) instanceof List) {
                urlArray0 = ((List) StringableRecord.get(5));
                urlArray0 .clear();
            } else {
                urlArray0 = new ArrayList<URL>();
            }
            do {
                for (int counter0 = 0; (counter0 <chunkLen0); counter0 ++) {
                    Object urlArrayArrayElementReuseVar0 = null;
                    if (StringableRecord.get(5) instanceof GenericArray) {
                        urlArrayArrayElementReuseVar0 = ((GenericArray) StringableRecord.get(5)).peek();
                    }
                    if (urlArrayArrayElementReuseVar0 instanceof Utf8) {
                        urlArray0 .add(new URL((decoder).readString(((Utf8) urlArrayArrayElementReuseVar0)).toString()));
                    } else {
                        urlArray0 .add(new URL((decoder).readString(null).toString()));
                    }
                }
                chunkLen0 = (decoder.arrayNext());
            } while (chunkLen0 > 0);
        } else {
            urlArray0 = Collections.emptyList();
        }
        StringableRecord.put(5, urlArray0);
        Map<URL, BigInteger> urlMap0 = null;
        long chunkLen1 = (decoder.readMapStart());
        if (chunkLen1 > 0) {
            Map<URL, BigInteger> urlMapReuse0 = null;
            if (StringableRecord.get(6) instanceof Map) {
                urlMapReuse0 = ((Map) StringableRecord.get(6));
            }
            if (urlMapReuse0 != (null)) {
                urlMapReuse0 .clear();
                urlMap0 = urlMapReuse0;
            } else {
                urlMap0 = new HashMap<URL, BigInteger>();
            }
            do {
                for (int counter1 = 0; (counter1 <chunkLen1); counter1 ++) {
                    URL key0 = new URL((decoder.readString(null).toString()));
                    urlMap0 .put(key0, new BigInteger((decoder).readString(null).toString()));
                }
                chunkLen1 = (decoder.mapNext());
            } while (chunkLen1 > 0);
        } else {
            urlMap0 = Collections.emptyMap();
        }
        StringableRecord.put(6, urlMap0);
        StringableRecord.put(7, deserializeStringableSubRecord0(StringableRecord.get(7), (decoder)));
        StringableRecord.put(8, deserializeAnotherSubRecord0(StringableRecord.get(8), (decoder)));
        return StringableRecord;
    }

    public com.linkedin.avro.fastserde.generated.avro.StringableSubRecord deserializeStringableSubRecord0(Object reuse, Decoder decoder)
        throws IOException, URISyntaxException
    {
        com.linkedin.avro.fastserde.generated.avro.StringableSubRecord StringableSubRecord;
        if ((reuse)!= null) {
            StringableSubRecord = ((com.linkedin.avro.fastserde.generated.avro.StringableSubRecord)(reuse));
        } else {
            StringableSubRecord = new com.linkedin.avro.fastserde.generated.avro.StringableSubRecord();
        }
        if (StringableSubRecord.get(0) instanceof Utf8) {
            StringableSubRecord.put(0, new URI((decoder).readString(((Utf8) StringableSubRecord.get(0))).toString()));
        } else {
            StringableSubRecord.put(0, new URI((decoder).readString(null).toString()));
        }
        return StringableSubRecord;
    }

    public com.linkedin.avro.fastserde.generated.avro.AnotherSubRecord deserializeAnotherSubRecord0(Object reuse, Decoder decoder)
        throws IOException, URISyntaxException
    {
        com.linkedin.avro.fastserde.generated.avro.AnotherSubRecord AnotherSubRecord;
        if ((reuse)!= null) {
            AnotherSubRecord = ((com.linkedin.avro.fastserde.generated.avro.AnotherSubRecord)(reuse));
        } else {
            AnotherSubRecord = new com.linkedin.avro.fastserde.generated.avro.AnotherSubRecord();
        }
        AnotherSubRecord.put(0, deserializeStringableSubRecord0(AnotherSubRecord.get(0), (decoder)));
        return AnotherSubRecord;
    }

}
