package com.unity3d.ads.core.data.model;

import com.google.protobuf.ByteString;
import defpackage.ic2;
import defpackage.j11;
import defpackage.k11;
import defpackage.l11;
import defpackage.q71;
import defpackage.tl7;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class CoroutineOpportunity implements j11 {
    public static final Key Key = new Key(null);
    private final ByteString value;

    public CoroutineOpportunity(ByteString byteString) {
        byteString.getClass();
        this.value = byteString;
    }

    @Override // defpackage.l11
    public <R> R fold(R r, ic2 ic2Var) {
        return (R) tl7.t(this, r, ic2Var);
    }

    @Override // defpackage.l11
    public <E extends j11> E get(k11 k11Var) {
        return (E) tl7.u(this, k11Var);
    }

    @Override // defpackage.j11
    public k11 getKey() {
        return Key;
    }

    public final ByteString getValue() {
        return this.value;
    }

    @Override // defpackage.l11
    public l11 minusKey(k11 k11Var) {
        return tl7.B(this, k11Var);
    }

    @Override // defpackage.l11
    public l11 plus(l11 l11Var) {
        return tl7.L(this, l11Var);
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Key implements k11 {
        public /* synthetic */ Key(q71 q71Var) {
            this();
        }

        private Key() {
        }
    }
}
