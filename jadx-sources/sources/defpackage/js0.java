package defpackage;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class js0 implements ow4 {
    public final /* synthetic */ byte a;

    @Override // defpackage.ow4
    public final Object get() {
        switch (this.a) {
            case 0:
                return Collections.EMPTY_SET;
            case 1:
                qb3 qb3Var = ExecutorsRegistrar.a;
                StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                detectNetwork.detectResourceMismatches();
                detectNetwork.detectUnbufferedIo();
                return new fd1(Executors.newFixedThreadPool(4, new m31("Firebase Background", 10, detectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 2:
                qb3 qb3Var2 = ExecutorsRegistrar.a;
                return new fd1(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new m31("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 3:
                qb3 qb3Var3 = ExecutorsRegistrar.a;
                return new fd1(Executors.newCachedThreadPool(new m31("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 4:
                qb3 qb3Var4 = ExecutorsRegistrar.a;
                return Executors.newSingleThreadScheduledExecutor(new m31("Firebase Scheduler", 0, null));
            default:
                return null;
        }
    }
}
