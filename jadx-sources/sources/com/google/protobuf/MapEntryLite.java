package com.google.protobuf;

import com.google.protobuf.MessageLite;
import com.google.protobuf.WireFormat;
import defpackage.a77;
import defpackage.v71;
import java.util.AbstractMap;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class MapEntryLite<K, V> {
    private static final int KEY_FIELD_NUMBER = 1;
    private static final int VALUE_FIELD_NUMBER = 2;
    private final K key;
    private final i1 metadata;
    private final V value;

    private MapEntryLite(WireFormat.FieldType fieldType, K k, WireFormat.FieldType fieldType2, V v) {
        this.metadata = new i1(fieldType, k, fieldType2, v);
        this.key = k;
        this.value = v;
    }

    public static <K, V> int computeSerializedSize(i1 i1Var, K k, V v) {
        return q0.c(i1Var.c, 2, v) + q0.c(i1Var.a, 1, k);
    }

    public static <K, V> MapEntryLite<K, V> newDefaultInstance(WireFormat.FieldType fieldType, K k, WireFormat.FieldType fieldType2, V v) {
        return new MapEntryLite<>(fieldType, k, fieldType2, v);
    }

    public static <K, V> Map.Entry<K, V> parseEntry(CodedInputStream codedInputStream, i1 i1Var, ExtensionRegistryLite extensionRegistryLite) {
        Object obj = i1Var.b;
        WireFormat.FieldType fieldType = i1Var.c;
        WireFormat.FieldType fieldType2 = i1Var.a;
        Object obj2 = i1Var.d;
        while (true) {
            int readTag = codedInputStream.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == WireFormat.makeTag(1, fieldType2.getWireType())) {
                obj = parseField(codedInputStream, extensionRegistryLite, fieldType2, obj);
            } else if (readTag == WireFormat.makeTag(2, fieldType.getWireType())) {
                obj2 = parseField(codedInputStream, extensionRegistryLite, fieldType, obj2);
            } else if (!codedInputStream.skipField(readTag)) {
                break;
            }
        }
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    public static <T> T parseField(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, WireFormat.FieldType fieldType, T t) {
        int i = h1.a[fieldType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    q0 q0Var = q0.d;
                    return (T) WireFormat.readPrimitiveField(codedInputStream, fieldType, a77.y);
                }
                v71.i("Groups are not allowed in maps.");
                return null;
            }
            return (T) Integer.valueOf(codedInputStream.readEnum());
        }
        MessageLite.Builder builder = ((MessageLite) t).toBuilder();
        codedInputStream.readMessage(builder, extensionRegistryLite);
        return (T) builder.buildPartial();
    }

    public static <K, V> void writeTo(CodedOutputStream codedOutputStream, i1 i1Var, K k, V v) {
        q0.r(codedOutputStream, i1Var.a, 1, k);
        q0.r(codedOutputStream, i1Var.c, 2, v);
    }

    public int computeMessageSize(int i, K k, V v) {
        return CodedOutputStream.computeLengthDelimitedFieldSize(computeSerializedSize(this.metadata, k, v)) + CodedOutputStream.computeTagSize(i);
    }

    public K getKey() {
        return this.key;
    }

    public i1 getMetadata() {
        return this.metadata;
    }

    public V getValue() {
        return this.value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void parseInto(MapFieldLite<K, V> mapFieldLite, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
        i1 i1Var = this.metadata;
        Object obj = i1Var.b;
        Object obj2 = i1Var.d;
        while (true) {
            int readTag = codedInputStream.readTag();
            if (readTag == 0) {
                break;
            }
            int makeTag = WireFormat.makeTag(1, this.metadata.a.getWireType());
            i1 i1Var2 = this.metadata;
            if (readTag == makeTag) {
                obj = parseField(codedInputStream, extensionRegistryLite, i1Var2.a, obj);
            } else if (readTag == WireFormat.makeTag(2, i1Var2.c.getWireType())) {
                obj2 = parseField(codedInputStream, extensionRegistryLite, this.metadata.c, obj2);
            } else if (!codedInputStream.skipField(readTag)) {
                break;
            }
        }
        codedInputStream.checkLastTagWas(0);
        codedInputStream.popLimit(pushLimit);
        mapFieldLite.put(obj, obj2);
    }

    public void serializeTo(CodedOutputStream codedOutputStream, int i, K k, V v) {
        codedOutputStream.writeTag(i, 2);
        codedOutputStream.writeUInt32NoTag(computeSerializedSize(this.metadata, k, v));
        writeTo(codedOutputStream, this.metadata, k, v);
    }

    private MapEntryLite(i1 i1Var, K k, V v) {
        this.metadata = i1Var;
        this.key = k;
        this.value = v;
    }

    public Map.Entry<K, V> parseEntry(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return parseEntry(byteString.newCodedInput(), this.metadata, extensionRegistryLite);
    }
}
