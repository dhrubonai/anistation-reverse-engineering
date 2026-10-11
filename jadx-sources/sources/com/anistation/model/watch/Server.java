package com.anistation.model.watch;

import defpackage.a34;
import defpackage.aj5;
import defpackage.bx7;
import defpackage.ds;
import defpackage.hu0;
import defpackage.iq4;
import defpackage.jf3;
import defpackage.jj5;
import defpackage.kj5;
import defpackage.mj5;
import defpackage.q71;
import defpackage.r75;
import defpackage.rb3;
import defpackage.x73;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@jj5
/* loaded from: classes.dex */
public final class Server {
    private static final rb3[] $childSerializers;
    public static final Companion Companion = new Companion(null);
    private final List<Provider> dub;
    private final List<Provider> sub;

    static {
        r75 r75Var = new r75((byte) 22);
        jf3 jf3Var = jf3.y;
        $childSerializers = new rb3[]{bx7.B(jf3Var, r75Var), bx7.B(jf3Var, new r75((byte) 23))};
    }

    public /* synthetic */ Server(int i, List list, List list2, kj5 kj5Var) {
        if (3 != (i & 3)) {
            iq4.throwMissingFieldException(i, 3, Server$$serializer.INSTANCE.getDescriptor());
        }
        this.sub = list;
        this.dub = list2;
    }

    public static final /* synthetic */ x73 _childSerializers$_anonymous_() {
        return new ds(Provider$$serializer.INSTANCE, (byte) 0);
    }

    public static final /* synthetic */ x73 _childSerializers$_anonymous_$0() {
        return new ds(Provider$$serializer.INSTANCE, (byte) 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Server copy$default(Server server, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = server.sub;
        }
        if ((i & 2) != 0) {
            list2 = server.dub;
        }
        return server.copy(list, list2);
    }

    public static final /* synthetic */ void write$Self$AniStation_core_model(Server server, hu0 hu0Var, aj5 aj5Var) {
        rb3[] rb3VarArr = $childSerializers;
        hu0Var.encodeNullableSerializableElement(aj5Var, 0, (mj5) rb3VarArr[0].getValue(), server.sub);
        hu0Var.encodeNullableSerializableElement(aj5Var, 1, (mj5) rb3VarArr[1].getValue(), server.dub);
    }

    public final List<Provider> component1() {
        return this.sub;
    }

    public final List<Provider> component2() {
        return this.dub;
    }

    public final Server copy(List<Provider> list, List<Provider> list2) {
        return new Server(list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Server)) {
            return false;
        }
        Server server = (Server) obj;
        if (a34.i(this.sub, server.sub) && a34.i(this.dub, server.dub)) {
            return true;
        }
        return false;
    }

    public final List<Provider> getDub() {
        return this.dub;
    }

    public final List<Provider> getSub() {
        return this.sub;
    }

    public int hashCode() {
        int hashCode;
        List<Provider> list = this.sub;
        int i = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i2 = hashCode * 31;
        List<Provider> list2 = this.dub;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        return "Server(sub=" + this.sub + ", dub=" + this.dub + ")";
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(q71 q71Var) {
            this();
        }

        public final x73 serializer() {
            return Server$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Server(List<Provider> list, List<Provider> list2) {
        this.sub = list;
        this.dub = list2;
    }
}
