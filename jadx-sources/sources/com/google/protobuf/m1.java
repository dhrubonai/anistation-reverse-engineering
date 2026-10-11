package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLite;
import com.google.protobuf.WireFormat;
import defpackage.j97;
import defpackage.ub3;
import defpackage.yb5;
import defpackage.yz1;
import defpackage.ze0;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class m1 implements yb5 {
    public final MessageLite a;
    public final g2 b;
    public final boolean c;
    public final yz1 d;

    public m1(g2 g2Var, yz1 yz1Var, MessageLite messageLite) {
        this.b = g2Var;
        ((h0) yz1Var).getClass();
        this.c = messageLite instanceof GeneratedMessageLite.ExtendableMessage;
        this.d = yz1Var;
        this.a = messageLite;
    }

    @Override // defpackage.yb5
    public final void a(Object obj, Object obj2) {
        v1.l(this.b, obj, obj2);
        if (this.c) {
            ((h0) this.d).getClass();
            q0 q0Var = ((GeneratedMessageLite.ExtendableMessage) obj2).extensions;
            if (!q0Var.a.isEmpty()) {
                ((GeneratedMessageLite.ExtendableMessage) obj).ensureExtensionsAreMutable().n(q0Var);
            }
        }
    }

    @Override // defpackage.yb5
    public final void b(Object obj) {
        ((h2) this.b).getClass();
        ((GeneratedMessageLite) obj).unknownFields.makeImmutable();
        ((h0) this.d).getClass();
        ((GeneratedMessageLite.ExtendableMessage) obj).extensions.m();
    }

    @Override // defpackage.yb5
    public final boolean c(Object obj) {
        ((h0) this.d).getClass();
        return ((GeneratedMessageLite.ExtendableMessage) obj).extensions.j();
    }

    @Override // defpackage.yb5
    public final Object d() {
        MessageLite messageLite = this.a;
        if (messageLite instanceof GeneratedMessageLite) {
            return ((GeneratedMessageLite) messageLite).newMutableInstance();
        }
        return messageLite.newBuilderForType().buildPartial();
    }

    @Override // defpackage.yb5
    public final void e(Object obj, s sVar, ExtensionRegistryLite extensionRegistryLite) {
        g2 g2Var = this.b;
        UnknownFieldSetLite a = g2Var.a(obj);
        yz1 yz1Var = this.d;
        ((h0) yz1Var).getClass();
        q0 ensureExtensionsAreMutable = ((GeneratedMessageLite.ExtendableMessage) obj).ensureExtensionsAreMutable();
        while (sVar.a() != Integer.MAX_VALUE) {
            try {
                m1 m1Var = this;
                s sVar2 = sVar;
                ExtensionRegistryLite extensionRegistryLite2 = extensionRegistryLite;
                if (!m1Var.k(sVar2, extensionRegistryLite2, yz1Var, ensureExtensionsAreMutable, g2Var, a)) {
                    break;
                }
                this = m1Var;
                sVar = sVar2;
                extensionRegistryLite = extensionRegistryLite2;
            } finally {
                ((GeneratedMessageLite) obj).unknownFields = a;
            }
        }
    }

    @Override // defpackage.yb5
    public final void f(MessageLite messageLite, j97 j97Var) {
        ((h0) this.d).getClass();
        Iterator l = ((GeneratedMessageLite.ExtendableMessage) messageLite).extensions.l();
        while (l.hasNext()) {
            Map.Entry entry = (Map.Entry) l.next();
            FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite = (FieldSet$FieldDescriptorLite) entry.getKey();
            if (fieldSet$FieldDescriptorLite.getLiteJavaType() == WireFormat.JavaType.MESSAGE && !fieldSet$FieldDescriptorLite.isRepeated() && !fieldSet$FieldDescriptorLite.isPacked()) {
                if (entry instanceof ub3) {
                    ((z) j97Var).h(fieldSet$FieldDescriptorLite.getNumber(), ((LazyField) ((ub3) entry).x.getValue()).toByteString());
                } else {
                    ((z) j97Var).h(fieldSet$FieldDescriptorLite.getNumber(), entry.getValue());
                }
            } else {
                ze0.m("Found invalid MessageSet item.");
                return;
            }
        }
        ((h2) this.b).getClass();
        ((GeneratedMessageLite) messageLite).unknownFields.writeAsMessageSetTo(j97Var);
    }

    @Override // defpackage.yb5
    public final int g(GeneratedMessageLite generatedMessageLite) {
        ((h2) this.b).getClass();
        int hashCode = generatedMessageLite.unknownFields.hashCode();
        if (this.c) {
            ((h0) this.d).getClass();
            return ((GeneratedMessageLite.ExtendableMessage) generatedMessageLite).extensions.a.hashCode() + (hashCode * 53);
        }
        return hashCode;
    }

    @Override // defpackage.yb5
    public final boolean h(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
        h2 h2Var = (h2) this.b;
        h2Var.getClass();
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        h2Var.getClass();
        if (!unknownFieldSetLite.equals(generatedMessageLite2.unknownFields)) {
            return false;
        }
        if (this.c) {
            h0 h0Var = (h0) this.d;
            h0Var.getClass();
            q0 q0Var = ((GeneratedMessageLite.ExtendableMessage) generatedMessageLite).extensions;
            h0Var.getClass();
            return q0Var.equals(((GeneratedMessageLite.ExtendableMessage) generatedMessageLite2).extensions);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d5 A[EDGE_INSN: B:37:0x00d5->B:38:0x00d5 BREAK  A[LOOP:1: B:20:0x0076->B:28:0x00a7], SYNTHETIC] */
    @Override // defpackage.yb5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.Object r17, byte[] r18, int r19, int r20, defpackage.as r21) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.m1.i(java.lang.Object, byte[], int, int, as):void");
    }

    @Override // defpackage.yb5
    public final int j(AbstractMessageLite abstractMessageLite) {
        ((h2) this.b).getClass();
        int serializedSizeAsMessageSet = ((GeneratedMessageLite) abstractMessageLite).unknownFields.getSerializedSizeAsMessageSet();
        if (this.c) {
            ((h0) this.d).getClass();
            return ((GeneratedMessageLite.ExtendableMessage) abstractMessageLite).extensions.g() + serializedSizeAsMessageSet;
        }
        return serializedSizeAsMessageSet;
    }

    public final boolean k(s sVar, ExtensionRegistryLite extensionRegistryLite, yz1 yz1Var, q0 q0Var, g2 g2Var, UnknownFieldSetLite unknownFieldSetLite) {
        int i = sVar.b;
        int i2 = WireFormat.MESSAGE_SET_ITEM_TAG;
        MessageLite messageLite = this.a;
        if (i != i2) {
            if (WireFormat.getTagWireType(i) == 2) {
                int tagFieldNumber = WireFormat.getTagFieldNumber(i);
                ((h0) yz1Var).getClass();
                GeneratedMessageLite.GeneratedExtension findLiteExtensionByNumber = extensionRegistryLite.findLiteExtensionByNumber(messageLite, tagFieldNumber);
                if (findLiteExtensionByNumber != null) {
                    q0Var.p(findLiteExtensionByNumber.descriptor, sVar.o(findLiteExtensionByNumber.getMessageDefaultInstance().getClass(), extensionRegistryLite));
                    return true;
                }
                return g2Var.b(0, sVar, unknownFieldSetLite);
            }
            return sVar.y();
        }
        GeneratedMessageLite.GeneratedExtension generatedExtension = null;
        ByteString byteString = null;
        int i3 = 0;
        while (sVar.a() != Integer.MAX_VALUE) {
            int i4 = sVar.b;
            if (i4 == WireFormat.MESSAGE_SET_TYPE_ID_TAG) {
                sVar.x(0);
                i3 = sVar.a.readUInt32();
                ((h0) yz1Var).getClass();
                generatedExtension = extensionRegistryLite.findLiteExtensionByNumber(messageLite, i3);
            } else if (i4 == WireFormat.MESSAGE_SET_MESSAGE_TAG) {
                if (generatedExtension != null) {
                    ((h0) yz1Var).getClass();
                    q0Var.p(generatedExtension.descriptor, sVar.o(generatedExtension.getMessageDefaultInstance().getClass(), extensionRegistryLite));
                } else {
                    byteString = sVar.e();
                }
            } else if (!sVar.y()) {
                break;
            }
        }
        if (sVar.b == WireFormat.MESSAGE_SET_ITEM_END_TAG) {
            if (byteString != null) {
                if (generatedExtension != null) {
                    ((h0) yz1Var).getClass();
                    MessageLite.Builder newBuilderForType = generatedExtension.getMessageDefaultInstance().newBuilderForType();
                    CodedInputStream newCodedInput = byteString.newCodedInput();
                    newBuilderForType.mergeFrom(newCodedInput, extensionRegistryLite);
                    q0Var.p(generatedExtension.descriptor, newBuilderForType.buildPartial());
                    newCodedInput.checkLastTagWas(0);
                    return true;
                }
                ((h2) g2Var).getClass();
                unknownFieldSetLite.storeField(WireFormat.makeTag(i3, 2), byteString);
            }
            return true;
        }
        throw InvalidProtocolBufferException.invalidEndTag();
    }
}
