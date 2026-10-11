package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class wb7 extends ph2 {
    public static final rt3 k = new rt3("ClientTelemetry.API", new qa7((byte) 2), new q18((byte) 5));
    public static final rt3 l = new rt3("CastApi.API", new qa7((byte) 4), new q18((byte) 5));

    public wb7(Context context) {
        super(context, l, qo.a, oh2.c);
    }

    public v78 e(x76 x76Var) {
        o76 b = o76.b();
        b.a = new q12[]{a34.v};
        b.b = false;
        b.d = new qb7((Object) x76Var, (byte) 1);
        return d(2, b.a());
    }

    public v78 f(String[] strArr) {
        o76 b = o76.b();
        b.d = new hv7(this, strArr, (byte) 0);
        b.a = new q12[]{v94.s};
        b.b = false;
        b.c = (short) 8425;
        return d(0, b.a());
    }
}
