package com.google.protobuf;

import defpackage.e06;
import defpackage.ze0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class StructuralMessageInfo$Builder {
    private int[] checkInitialized;
    private Object defaultInstance;
    private final List<n0> fields;
    private boolean messageSetWireFormat;
    private ProtoSyntax syntax;
    private boolean wasBuilt;

    public StructuralMessageInfo$Builder() {
        this.checkInitialized = null;
        this.fields = new ArrayList();
    }

    public e06 build() {
        if (!this.wasBuilt) {
            if (this.syntax != null) {
                this.wasBuilt = true;
                Collections.sort(this.fields);
                return new e06(this.syntax, this.messageSetWireFormat, this.checkInitialized, (n0[]) this.fields.toArray(new n0[0]), this.defaultInstance);
            }
            ze0.m("Must specify a proto syntax");
            return null;
        }
        ze0.m("Builder can only build once");
        return null;
    }

    public void withCheckInitialized(int[] iArr) {
        this.checkInitialized = iArr;
    }

    public void withDefaultInstance(Object obj) {
        this.defaultInstance = obj;
    }

    public void withField(n0 n0Var) {
        if (!this.wasBuilt) {
            this.fields.add(n0Var);
        } else {
            ze0.m("Builder can only build once");
        }
    }

    public void withMessageSetWireFormat(boolean z) {
        this.messageSetWireFormat = z;
    }

    public void withSyntax(ProtoSyntax protoSyntax) {
        this.syntax = (ProtoSyntax) Internal.checkNotNull(protoSyntax, "syntax");
    }

    public StructuralMessageInfo$Builder(int i) {
        this.checkInitialized = null;
        this.fields = new ArrayList(i);
    }
}
