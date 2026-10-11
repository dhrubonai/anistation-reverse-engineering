package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class sm6 implements Executor {
    public static final sm6 x;
    public static final Handler y;
    public static final /* synthetic */ sm6[] z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, sm6] */
    static {
        ?? r0 = new Enum("INSTANCE", 0);
        x = r0;
        z = new sm6[]{r0};
        y = new Handler(Looper.getMainLooper());
    }

    public static sm6 valueOf(String str) {
        return (sm6) Enum.valueOf(sm6.class, str);
    }

    public static sm6[] values() {
        return (sm6[]) z.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        y.post(runnable);
    }
}
