package com.anistation.remote.model;

import com.anistation.model.Status;
import defpackage.a34;
import defpackage.aj5;
import defpackage.bx7;
import defpackage.hu0;
import defpackage.iq4;
import defpackage.jf3;
import defpackage.jj5;
import defpackage.kj5;
import defpackage.kq4;
import defpackage.mj5;
import defpackage.mz5;
import defpackage.q71;
import defpackage.qa4;
import defpackage.rb3;
import defpackage.uv1;
import defpackage.v0;
import defpackage.x73;
import defpackage.zo5;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@jj5
/* loaded from: classes.dex */
public final class Response<T> {
    private static final aj5 $cachedDescriptor;
    private final T data;
    private final String message;
    private final Status status;
    private final boolean success;
    public static final Companion Companion = new Companion(null);
    private static final rb3[] $childSerializers = {null, null, null, bx7.B(jf3.y, new qa4((byte) 27))};

    static {
        kq4 kq4Var = new kq4("com.anistation.remote.model.Response", null, 4);
        kq4Var.j("data", false);
        kq4Var.j("success", false);
        kq4Var.j("message", false);
        kq4Var.j("status", false);
        $cachedDescriptor = kq4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ Response(int i, Object obj, boolean z, String str, Status status, kj5 kj5Var) {
        if (15 != (i & 15)) {
            iq4.throwMissingFieldException(i, 15, $cachedDescriptor);
        }
        this.data = obj;
        this.success = z;
        this.message = str;
        this.status = status;
    }

    public static final x73 _childSerializers$_anonymous_() {
        Status[] values = Status.values();
        values.getClass();
        return new uv1("com.anistation.model.Status", values);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Response copy$default(Response response, Object obj, boolean z, String str, Status status, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = response.data;
        }
        if ((i & 2) != 0) {
            z = response.success;
        }
        if ((i & 4) != 0) {
            str = response.message;
        }
        if ((i & 8) != 0) {
            status = response.status;
        }
        return response.copy(obj, z, str, status);
    }

    public static final /* synthetic */ void write$Self$remote(Response response, hu0 hu0Var, aj5 aj5Var, x73 x73Var) {
        rb3[] rb3VarArr = $childSerializers;
        hu0Var.encodeNullableSerializableElement(aj5Var, 0, x73Var, response.data);
        v0 v0Var = (v0) hu0Var;
        v0Var.p(aj5Var, 1, response.success);
        hu0Var.encodeNullableSerializableElement(aj5Var, 2, mz5.a, response.message);
        v0Var.v(aj5Var, 3, (mj5) rb3VarArr[3].getValue(), response.status);
    }

    public final T component1() {
        return this.data;
    }

    public final boolean component2() {
        return this.success;
    }

    public final String component3() {
        return this.message;
    }

    public final Status component4() {
        return this.status;
    }

    public final Response<T> copy(T t, boolean z, String str, Status status) {
        status.getClass();
        return new Response<>(t, z, str, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Response)) {
            return false;
        }
        Response response = (Response) obj;
        if (a34.i(this.data, response.data) && this.success == response.success && a34.i(this.message, response.message) && this.status == response.status) {
            return true;
        }
        return false;
    }

    public final T getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        int hashCode;
        T t = this.data;
        int i = 0;
        if (t == null) {
            hashCode = 0;
        } else {
            hashCode = t.hashCode();
        }
        int g = zo5.g(hashCode * 31, 31, this.success);
        String str = this.message;
        if (str != null) {
            i = str.hashCode();
        }
        return this.status.hashCode() + ((g + i) * 31);
    }

    public String toString() {
        return "Response(data=" + this.data + ", success=" + this.success + ", message=" + this.message + ", status=" + this.status + ")";
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(q71 q71Var) {
            this();
        }

        public final <T> x73 serializer(x73 x73Var) {
            x73Var.getClass();
            return new Response$$serializer(x73Var);
        }

        private Companion() {
        }
    }

    public Response(T t, boolean z, String str, Status status) {
        status.getClass();
        this.data = t;
        this.success = z;
        this.message = str;
        this.status = status;
    }
}
