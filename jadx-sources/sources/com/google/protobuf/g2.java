package com.google.protobuf;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class g2 {
    public UnknownFieldSetLite a(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite == UnknownFieldSetLite.getDefaultInstance()) {
            UnknownFieldSetLite newInstance = UnknownFieldSetLite.newInstance();
            generatedMessageLite.unknownFields = newInstance;
            return newInstance;
        }
        return unknownFieldSetLite;
    }

    public final boolean b(int i, s sVar, Object obj) {
        CodedInputStream codedInputStream = sVar.a;
        int i2 = sVar.b;
        int tagFieldNumber = WireFormat.getTagFieldNumber(i2);
        int tagWireType = WireFormat.getTagWireType(i2);
        if (tagWireType != 0) {
            if (tagWireType != 1) {
                if (tagWireType != 2) {
                    if (tagWireType != 3) {
                        if (tagWireType == 4) {
                            return false;
                        }
                        if (tagWireType == 5) {
                            sVar.x(5);
                            ((UnknownFieldSetLite) obj).storeField(WireFormat.makeTag(tagFieldNumber, 5), Integer.valueOf(codedInputStream.readFixed32()));
                            return true;
                        }
                        throw InvalidProtocolBufferException.invalidWireType();
                    }
                    UnknownFieldSetLite newInstance = UnknownFieldSetLite.newInstance();
                    int makeTag = WireFormat.makeTag(tagFieldNumber, 4);
                    int i3 = i + 1;
                    if (i3 >= 100) {
                        throw InvalidProtocolBufferException.recursionLimitExceeded();
                    }
                    while (sVar.a() != Integer.MAX_VALUE && b(i3, sVar, newInstance)) {
                    }
                    if (makeTag == sVar.b) {
                        newInstance.makeImmutable();
                        ((UnknownFieldSetLite) obj).storeField(WireFormat.makeTag(tagFieldNumber, 3), newInstance);
                        return true;
                    }
                    throw InvalidProtocolBufferException.invalidEndTag();
                }
                ((UnknownFieldSetLite) obj).storeField(WireFormat.makeTag(tagFieldNumber, 2), sVar.e());
                return true;
            }
            sVar.x(1);
            ((UnknownFieldSetLite) obj).storeField(WireFormat.makeTag(tagFieldNumber, 1), Long.valueOf(codedInputStream.readFixed64()));
            return true;
        }
        sVar.x(0);
        ((UnknownFieldSetLite) obj).storeField(WireFormat.makeTag(tagFieldNumber, 0), Long.valueOf(codedInputStream.readInt64()));
        return true;
    }

    public void c(Object obj, Object obj2) {
        ((GeneratedMessageLite) obj).unknownFields = (UnknownFieldSetLite) obj2;
    }
}
