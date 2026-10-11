package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class tp5 {
    public final /* synthetic */ byte a;
    public final vs6 b;

    /* JADX WARN: Type inference failed for: r0v1, types: [vs6, java.lang.Object] */
    public tp5() {
        this.a = (byte) 2;
        this.b = new Object();
    }

    public final ht6 a(Context context, hp0 hp0Var, gt6 gt6Var, Executor executor, long j, boolean z) {
        byte b = this.a;
        vs6 vs6Var = this.b;
        switch (b) {
            case 0:
                return new up5(context, (fc1) vs6Var, hp0Var, gt6Var, executor, z);
            case 1:
                return new l34(context, (fc1) vs6Var, hp0Var, gt6Var, executor, z);
            default:
                try {
                    return ((tp5) tp5.class.getConstructor(vs6.class).newInstance((co4) vs6Var)).a(context, hp0Var, gt6Var, executor, j, z);
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
        }
    }

    public /* synthetic */ tp5(fc1 fc1Var, byte b) {
        this.a = b;
        this.b = fc1Var;
    }
}
