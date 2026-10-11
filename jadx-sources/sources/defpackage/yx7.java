package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class yx7 implements r26 {
    public static final /* synthetic */ yx7 x = new Object();

    @Override // defpackage.r26
    public final Object get() {
        Object obj = sx7.j;
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(r35.b);
        if (newSingleThreadScheduledExecutor instanceof p04) {
            return (p04) newSingleThreadScheduledExecutor;
        }
        return new p04(newSingleThreadScheduledExecutor);
    }
}
